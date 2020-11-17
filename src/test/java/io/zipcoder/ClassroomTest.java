package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassroomTest {
    private Double[] givenTestScoresA = {79.0, 80.0, 100.0};
    private Double[] givenTestScoresB = {95.0, 99.0, 83.0};
    private Double[] givenTestScoresC = {68.0, 88.0, 98.0};
    private Student studentA = new Student("Mallory", "Molly", givenTestScoresA);
    private Student studentB = new Student("Sally", "Shark", givenTestScoresB);
    private Student studentC = new Student("Bob", "Boob", givenTestScoresC);
    private Student[] theStudents = new Student[3];

    @Test
    public void getStudentsTest(){
        theStudents[0] = studentA;
        theStudents[1] = studentB;
        theStudents[2] = studentC;
        Classroom classroom = new Classroom(theStudents);
        //given
        Student[] given = theStudents;
        //when
        Student[] actual = classroom.getStudents();
        //then
        Assert.assertEquals(given, actual);
    }

    @Test
    public void addStudentTest(){
        theStudents[0] = studentA;
        theStudents[1] = studentB;
        Classroom classroom = new Classroom(theStudents);
        //given
        Integer expected = 3;
        classroom.addStudent(studentC);
        //when
        Integer actual = classroom.getStudents().length;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        theStudents[0] = studentA;
        theStudents[1] = studentB;
        theStudents[2] = studentC;
        Classroom classroom = new Classroom(theStudents);
        //given
        Double expected = 87.77777777777777;
        //when
        Double actual = classroom.getAverageExamScore();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeStudentTest(){
        theStudents[0] = studentA;
        theStudents[1] = studentB;
        theStudents[2] = studentC;
        Classroom classroom = new Classroom(theStudents);
        //given
        classroom.removeStudent("Mallory", "Molly");
        Student expected = studentB;
        //when
        Student actual = theStudents[0];
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getStudentsByScoreTest(){
        theStudents[0] = studentA;
        theStudents[1] = studentB;
        theStudents[2] = studentC;
        Classroom classroom = new Classroom(theStudents);
        //given
        //when
        //then
    }

    @Test
    public void getGradebookTest(){
        theStudents[0] = studentA;
        theStudents[1] = studentB;
        theStudents[2] = studentC;
        Classroom classroom = new Classroom(theStudents);
        //given
        //when
        //then
    }
}
