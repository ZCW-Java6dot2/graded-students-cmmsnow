package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {
    //given
    String given;
    String actual;
    String givenFirstName = "Jerry";
    String givenLastName = "Bobo";
    Double[] givenExamScores = {75.0, 68.0, 110.0};

    @Test
    public void setFirstNameTest(){
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);
        given = "Mary";
        student.setFirstName(given);
        actual = student.getFirstName();
        Assert.assertEquals(given, actual);
    }

    @Test
    public void setLastNameTest(){
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);
        given = "Baloney";
        student.setLastName(given);
        actual = student.getLastName();
        Assert.assertEquals(given, actual);
    }

    @Test
    public void addExamScoreTest(){
        //given
        //when
        //then
        Assert.assertEquals(given, actual);
    }

    @Test
    public void setExamScoreTest(){
        //given
        //when
        //then
        Assert.assertEquals(given, actual);
    }

    @Test
    public void getNumbersOfExamsTakenTest(){
        //given
        //when
        //then
        Assert.assertEquals(given, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        //given
        //when
        //then
        Assert.assertEquals(given, actual);
    }

    @Test
    public void toStringTest(){
        //given
        //when
        //then
        Assert.assertEquals(given, actual);
    }
}