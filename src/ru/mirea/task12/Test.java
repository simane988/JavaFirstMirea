package ru.mirea.task12;

import java.util.Scanner;

public class Test {
    public static void main(String []args){
        System.out.println("Enter the number of students");
        Scanner scanner = new Scanner(System.in);
        Students sor = new Students();
        int numOfStu = scanner.nextInt();
        int[] idNumber = new int[numOfStu];
        Students []students = new Students[numOfStu];

        for(int i = 0;i <students.length;i++){
            int random = (int) (Math.random() * numOfStu * 30);
            students[i] = new Students();
            students[i].setIdStudent(random);
        }

        for (int i = 0;i <numOfStu;i++){
            System.out.print(students[i].getIdStudent()+" ");
            idNumber[i] = students[i].getIdStudent();
        }
        System.out.println();
        idNumber = sor.sort(idNumber,numOfStu);
        System.out.println("Sorted ID:");

        for (int i = 0; i<numOfStu;i++){
            System.out.print(idNumber[i]+ " ");
        }
    }
}