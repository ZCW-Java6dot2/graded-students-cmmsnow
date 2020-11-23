package io.zipcoder;

import java.util.*;

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
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                students[i] = null;
            }
        }
        Arrays.sort(students, new SortNulls());  //sort students based on if they're null
    }

    public Student[] getStudentsByScore(){
        ArrayList<Student> studentsList = new ArrayList<>(Arrays.asList(students));
        Collections.sort(studentsList);
        return studentsList.toArray(new Student[studentsList.size()]);
    }

    public Map<String, Character> getGradeBook(){
        Map<String, Character> gradeBook = new HashMap<>();
        int count, percent;

        for (int i=0; i< students.length; i++){
            count = 0;
            for (int j=0; j< students.length; j++){
                if(students[i].getAverageExamScore() > students[j].getAverageExamScore()){
                    count++;
                }
            }
            percent = (count *100) / (students.length - 1);
            if(percent > 89){
                gradeBook.put(students[i].toString(), 'A');
            } else if(percent <= 89 && percent > 70){
                gradeBook.put(students[i].toString(), 'B');
            } else if(percent<=70 && percent > 49){
                gradeBook.put(students[i].toString(), 'C');
            } else if(percent <= 49 && percent > 11){
                gradeBook.put(students[i].toString(), 'D');
            } else {
                gradeBook.put(students[i].toString(), 'F');
            }
        }
        return gradeBook;
    }
}
