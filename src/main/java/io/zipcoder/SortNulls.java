package io.zipcoder;

import java.util.Comparator;

public class SortNulls implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1 == null && s2 == null) {  // if both are null
            return 0;                   //Dont move anything
        } else if (s1 == null) {      //if s1 is null
            return 1;                 //pushes s1 toward the end of the list
        } else if (s2 == null) {      // if s2 is null
            return -1;                //pushes s2 toward the end of the list
        } else {
            return 0;   // if neither are null, dont move them
        }
    }
}
