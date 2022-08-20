package com.marks;

public class StudentMarksImpl {

    public static void main(String[] args) {

        StudentMarks studentMarks = new StudentMarks();

        System.out.println("Total Marks of Medical Students = " + studentMarks.calculateMarks(60, 50, 80, 94));
        System.out.println("Total Marks of Non-Medical Students = " + studentMarks.calculateMarks(62, 75, 82));
        System.out.println("Total Marks of Business Students = " + studentMarks.calculateMarks(65, 80));
    }
}
