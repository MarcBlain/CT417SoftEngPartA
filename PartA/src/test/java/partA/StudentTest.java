package partA;

import static org.junit.Assert.*;

import org.junit.Test;

import partA.Student;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void generateUsername() throws Exception {
        final Student a = new Student("MarcoBlano", "26-04-1998", 15349941);
        final String expected = "MarcoBlano20";
        final String actual = a.generateUsername();
        assertEquals(expected, actual);
    } 

}     