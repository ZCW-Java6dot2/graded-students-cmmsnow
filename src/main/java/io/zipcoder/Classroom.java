package io.zipcoder;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return this.students;
    }

    public double getAverageExamScore(){
        Double overallAverage = 0.0;
        for (Student s : students){
            overallAverage += s.getAverageExamScore();
        }
        return overallAverage/students.length;
    }

    public void addStudent(Student student){
        Student[] newStudents = new Student[students.length + 1];
        int i = 0;
        for (Student s : students){
            newStudents[i++] = s;
        }
        newStudents[i] = student;
    }

    public void removeStudent(String firstName, String lastName){
        Student[] newArray = new Student[students.length-1];
        for (int i=0; i< students.length; i++){
            if ((!students[i].getFirstName().equals(firstName) || !students[i].getLastName().equals(lastName))){
                newArray[i] = students[i];
            } else if ((students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName))){
                students[i] = null;
                newArray[newArray.length-1] = students[i];
                //how to fill the rest of the array?
            }
        }
    }

    public void getStudentsByScore(){
        //returns an array of Student objects sorted in descending score order
        //(if 2 students have same average, sort them lexigraphically)
    }

    public void getGradeBook(){
        //returns a mapping of Student objects to a respective letter grade determined by creating a grading curve
    }
}
