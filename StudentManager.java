package com.student.management;

import java.util.*;

public class StudentManager {

    private List<Student> studentList = new ArrayList<>();
    private Map<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentList.add(student);
        studentMap.put(student.getId(), student);
    }

    public void removeDuplicates() {
        Set<Student> set = new HashSet<>(studentList);
        studentList = new ArrayList<>(set);
    }

    public Student getStudentById(int id) {
        return studentMap.get(id);
    }

    public void sortByName() {
        studentList.sort(StudentComparators.sortByName);
    }

    public void sortByMarks() {
        studentList.sort(StudentComparators.sortByMarksDesc);
    }

    public void printReport() {
        System.out.println("ID    Name            Age   Marks");
        System.out.println("------------------------------------");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
