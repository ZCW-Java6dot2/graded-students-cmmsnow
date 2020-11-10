package io.zipcoder;

public class Classroom {
    Student[] students;

    public Classroom(int maxNumberOfStudents){}

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        //nullary constructor
        //initializes empty array of 30 Student objects
    }

    public Student[] getStudents() {
        return students;
    }

    public double getAverageExamScore(){
        //average of all students' average exam scores
        return 0.00;
    }

    public void addStudent(Student student){
        //adds Student object to composite students list
    }

    public void removeStudent(String firstName, String lastName){
        //ensure array is reordered after removal
        //null values should be at back.
    }

    public void getStudentsByScore(){
        //returns an array of Student objects sorted in descending score order
        //(if 2 students have same average, sort them lexigraphically)
    }

    public void getGradeBook(){
        //returns a mapping of Student objects to a respective letter grade determined by creating a grading curve
    }
}
