package io.zipcoder;

import java.util.*;

public class Classroom implements Comparable<Student> {
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
        Arrays.sort(students, new SortNulls());  //Used to sort students based on if they're null or not
    }

    public void getStudentsByScore(){
//        for (int i=0; i<students.length; i++){
//            Double score = students[i].getAverageExamScore();
//            score.compareTo()
//        }

//        Comparator<Student> comparator = Comparator.comparing(Student::getAverageExamScore);
//        ArrayList<Student> studentList = new ArrayList<>();
//        for (int i=0; i< students.length; i++){
//            studentList.add(students[i]);
//        }
//        Collections.sort(studentList, comparator);
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

    @Override
    public int compareTo(Student o) {
//        int answer = this.student.getAverageExamScore().compareTo(o.getAverageExamScore());
//        return answer == 0 ? this.type.compareTo(o.getType()) : answer;
        return 0;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(getAverageExamScore(), student.getAverageExamScore()) &&
//                Objects.equals(student.getFirstName(), student.getFirstName());
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getAverageExamScore(), getFirstName());
//    }
}
