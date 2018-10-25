package partA;

import java.util.ArrayList;

public class Module {



    public String moduleName;

    public String moduleID;

    private final ArrayList<Student> students = new ArrayList();



    public Module(final String name, final String id) {

        this.moduleName = name;

        this.moduleID = id;

    }



    public void addStudent(final Student student) {

        this.students.add(student.getStudentID(), student);

        student.addModule(this);

    }



    public void addStudents(final ArrayList<Student> students) {

        for (final Student student : students) {

            this.students.add(student.getStudentID(), student);

            student.addModule(this);

        }

    }



    public ArrayList<Student> getStudents() {

        return new ArrayList<>(students.size());

    }



    public String getModuleID() {

        return moduleID;

    }



    public String getModuleName() {

        return moduleName;

    }



    @Override

    public String toString() {

        return this.moduleID + " : " + this.moduleName;

    }

}