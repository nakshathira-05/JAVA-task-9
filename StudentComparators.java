package com.student.management;

import java.util.Comparator;

public class StudentComparators {

    public static Comparator<Student> sortByName =
            Comparator.comparing(Student::getName);

    public static Comparator<Student> sortByMarksDesc =
            (s1, s2) -> Double.compare(s2.getMarks(), s1.getMarks());
}
