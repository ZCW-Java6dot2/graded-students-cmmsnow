package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClassroomTest {
    private Double[] givenExamScores0 = {79.0, 80.0, 100.0};
    private Double[] givenExamScores1 = {95.0, 99.0, 83.0};
    private Double[] givenExamScores2 = {68.0, 88.0, 98.0};
    private Student[] theStudents = new Student[3];
    private Student student0 = new Student("Mallory", "Molly", givenExamScores0);
    private Student student1 = new Student("Sally", "Shark", givenExamScores1);
    private Student student2 = new Student("Bob", "Boob", givenExamScores2);
    theStudents = {student0, student1, student2};
    private Classroom classroom = new Classroom(theStudents);

    @Test
    public void getStudentsTest(){
        //given
        //when
        //then
        Assert.assertEquals();
    }

    @Test
    public void addStudentTest(){
        //given
        //when
        //then
    }

    @Test
    public void getAverageExamScoreTest(){
        //given
        //when
        //then
    }

    @Test
    public void removeStudentTest(){
        //given
        //when
        //then
    }

    @Test
    public void getStudentsByScoreTest(){
        //given
        //when
        //then
    }

    @Test
    public void getGradebookTest(){
        //given
        //when
        //then
    }
}
