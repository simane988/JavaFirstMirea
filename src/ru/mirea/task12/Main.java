package ru.mirea.task12;

import java.util.Scanner;

public class Main {
    public static void main(String []args){
        SortingStudentsByGPA sort = new SortingStudentsByGPA();
        System.out.print("Enter the number of students: ");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.print("Enter the marks of students: ");
        Student [] students = new Student[k];
        for (int i = 0;i < students.length;i++){
            int m = scanner.nextInt();
            students[i]= new Student(m);
        }
        sort.quicksort(students,0,students.length-1);
        System.out.println("Quick sort: ");
        for (Student student : students) {
            System.out.print(student.getSrBall() + " ");
        }
        System.out.println();
        System.out.print("Enter the marks of students: ");
        for (int i = 0;i < students.length;i++){
            int m = scanner.nextInt();
            students[i]= new Student(m);
        }
        sort.mergeSort(students,0,students.length-1);
        System.out.print("Insertion sort: ");
        for (Student student : students) {
            System.out.print(student.getSrBall() + " ");
        }
    }
}