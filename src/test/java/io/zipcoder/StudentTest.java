package io.zipcoder;

import org.junit.Assert;
import org.junit.*;

public class StudentTest {

    String given;
    String actual;
    private Double[] givenExamScores = {75.0, 68.0, 110.0};
    String givenFirstName = "Jerry";
    String givenLastName = "Bobo";
    Student student = new Student(givenFirstName, givenLastName, givenExamScores);


    @Test
    public void setFirstNameTest(){
        String given = "Eric";
        student.setFirstName(given);
        Assert.assertEquals(student.getFirstName(), given);
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
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);

        Integer expected = (givenExamScores.length + 1);
        student.addExamScore(90.0);

        Integer actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest(){
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);
        //given
        Double given = givenExamScores[1];
        //when
        student.setExamScore(1, 100.0);
        //then
        Double actual = givenExamScores[1];
        Assert.assertNotEquals(given, actual);
    }

    @Test
    public void getNumbersOfExamsTakenTest(){
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);
        Integer given = givenExamScores.length;

        Integer actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(given, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);
        //given
        Double sum = givenExamScores[0] + givenExamScores[1] + givenExamScores[2];
        Double expected = sum/3;
        //when
        student.getAverageExamScore();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest(){
        Student student = new Student(givenFirstName, givenLastName, givenExamScores);

        Assert.assertNotNull(student.toString());
    }
}