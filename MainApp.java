package com.student.management;

public class MainApp {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(101, "Arun", 20, 85.5));
        manager.addStudent(new Student(102, "Bala", 21, 72.0));
        manager.addStudent(new Student(103, "Chitra", 19, 91.2));
        manager.addStudent(new Student(101, "Arun", 20, 85.5)); // duplicate

        System.out.println("\n--- After Removing Duplicates ---");
        manager.removeDuplicates();
        manager.printReport();

        System.out.println("\n--- Sorted By Name ---");
        manager.sortByName();
        manager.printReport();

        System.out.println("\n--- Sorted By Marks ---");
        manager.sortByMarks();
        manager.printReport();

        System.out.println("\n--- Fast Lookup ---");
        System.out.println(manager.getStudentById(102));
    }
}
