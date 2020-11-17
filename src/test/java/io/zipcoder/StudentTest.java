package io.zipcoder;

import org.junit.Assert;
import org.junit.*;

import java.util.ArrayList;

public class StudentTest {

    String given;
    String actual;
    String givenFirstName = "Jerry";
    String givenLastName = "Bobo";
    private Double[] givenTestScores = {75.0, 68.0, 110.0};
    Student student = new Student(givenFirstName, givenLastName, givenTestScores);
    private ArrayList<Double> givenExamScores = new ArrayList<>();

    @Test
    public void setFirstNameTest(){
        String given = "Eric";
        student.setFirstName(given);
        Assert.assertEquals(student.getFirstName(), given);
    }

    @Test
    public void setLastNameTest(){
        Student student = new Student(givenFirstName, givenLastName, givenTestScores);
        given = "Baloney";
        student.setLastName(given);
        actual = student.getLastName();
        Assert.assertEquals(given, actual);
    }

    @Test
    public void addExamScoreTest(){
        Student student = new Student(givenFirstName, givenLastName, givenTestScores);
        Integer expected = 3;
        Integer actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setExamScoreTest(){
        Student student = new Student(givenFirstName, givenLastName, givenTestScores);
        givenExamScores.add(givenTestScores[0]);
        givenExamScores.add(givenTestScores[1]);
        givenExamScores.add(givenTestScores[2]);
        //given
        Double expected = 100.0;
        //when
        student.setExamScore(1, expected);
        //then
        Double actual = givenExamScores.get(1);
        Assert.assertNotEquals(given, actual);
    }

    @Test
    public void getNumbersOfExamsTakenTest(){
        Student student = new Student(givenFirstName, givenLastName, givenTestScores);
        givenExamScores.add(givenTestScores[0]);
        givenExamScores.add(givenTestScores[1]);
        givenExamScores.add(givenTestScores[2]);
        Integer expected = 3;

        Integer actual = student.getNumberOfExamsTaken();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreTest(){
        Student student = new Student(givenFirstName, givenLastName, givenTestScores);
        givenExamScores.add(givenTestScores[0]);
        givenExamScores.add(givenTestScores[1]);
        givenExamScores.add(givenTestScores[2]);
        //given
        Double expected = (75.0 + 68.0 + 110.0)/3;
        //when
        Double actual = student.getAverageExamScore();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() {
        // : Given
        Student student = new Student(givenFirstName, givenLastName, givenTestScores);
        givenExamScores.add(givenTestScores[0]);
        givenExamScores.add(givenTestScores[1]);
        givenExamScores.add(givenTestScores[2]);
        // When
        StringBuilder str= new StringBuilder();
        str.append("Student Name: " + student.getFirstName() + " " + student.getLastName() + "\n");
        str.append("Average Score: " + String. format("%.2f", student.getAverageExamScore()) + "\n");
        str.append("Exam Scores:\n");
        for (int i = 0; i < givenExamScores.size(); i++) {
            String strFormat= String.format("%1.1f", givenExamScores.get(i));
            str.append("Exam " + (i+1) + " -> " + strFormat+ "\n");
        }
        String given = str.toString();
        String actual = student.toString();
        // Then
        Assert.assertEquals(given, actual);
    }
}