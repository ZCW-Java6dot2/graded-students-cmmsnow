package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));

    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getExamScores(){
        StringBuilder str= new StringBuilder();
        str.append("Exam Scores:\n");
        for (int i = 0; i < examScores.size(); i++) {
            String strFormat= String.format("%1.1f", examScores.get(i));
            str.append("Exam " + (i+1) + " -> " + strFormat+ "\n");
        }
        return str.toString();
    }

    public void addExamScore(double testScore){
        examScores.add(testScore);
    }

    public void setExamScore(int examNumber, double newScore){
        //examScores.set(examNumber-1, newScore);
        String string = "";
        for (int i = 0; i < examScores.size(); i++) {
            string += "Exam" + i+1 + "->" + examScores.get(i);
        }
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public double getAverageExamScore(){
        double average = 0;
        for (int i=0; i<examScores.size(); i++){
            average += examScores.get(i);
        }
        return (average/examScores.size());
    }

    @Override
    public String toString(){
        StringBuilder str= new StringBuilder();
        str.append("Student Name: " + firstName +" "+ lastName + "\n");
        String storeAvgScore=String.format("%1.2f",getAverageExamScore());
        str.append("Average Score: " + storeAvgScore + "\n");
        str.append(this.getExamScores());
        return str.toString();
    }
}
