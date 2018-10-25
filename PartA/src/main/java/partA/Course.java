package partA;

import org.joda.time.LocalDate;

import org.joda.time.format.DateTimeFormat;

import org.joda.time.format.DateTimeFormatter;


import java.util.ArrayList;


public class Course {



    private final DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-mm-yyyy");

    private final String courseName;

    private final ArrayList<Module> modules = new ArrayList();

    private final ArrayList<Student> students = new ArrayList();

    private final LocalDate startDate;

    private final LocalDate endDate;



    public Course(final String courseName, final String startDate, final String endDate) {

        this.courseName = courseName;

        this.startDate = this.dtf.parseLocalDate(startDate);

        this.endDate = dtf.parseLocalDate(endDate); 

    }



    public void addModule(final Module module) {

        this.modules.add(module);

        for (final Student student : module.getStudents()) {

            students.add(student.getStudentID(), student);

            student.addCourse(this);

        }

    }



    public ArrayList<Module> getModules() {

        return new ArrayList<Module>(modules.size());

    }



    public ArrayList<Student> getStudents() {

        return new ArrayList<Student>(students.size());

    }



    public String getCourseName() {

        return this.courseName;

    }



    public LocalDate getStartDate() {

        return this.startDate;

    }



    public LocalDate getEndDate() {

        return this.endDate; 

    }



    @Override

    public String toString() {

        return this.courseName + "\nProgramme:\t" + this.startDate.toString() + " - " + this.endDate.toString();

    }

}