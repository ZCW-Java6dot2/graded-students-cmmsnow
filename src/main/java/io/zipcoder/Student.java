package io.zipcoder;

import java.util.ArrayList;

public class Student {
    String firstName;
    String lastName;
    ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getExamScores(){
        //returns string list of all exam scores
        //System.out.println(output);
        //         Exam Scores:
        //              Exam 1 -> 100
        return null;
    }

    public void addExamScore(double examScore){
        //adds examScore to composite List examScores
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        //re-assigns value to specific exam
        examScores.get(examNumber);
        // ?? add code to change current score
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

    public String toString(){
        //override
        //System.out.println(output);
        //           Student Name: Bob Boob
        //              > Average Score: 125
        //              > Exam Scores:
        //                  Exam 1 -> 100
        return null;
    }
}
