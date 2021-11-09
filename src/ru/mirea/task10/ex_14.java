package ru.mirea.task10;

import java.util.Scanner;

public class ex_14 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        func(num);
    }

    static void func(int num){
        if(num>9)
            func(num/10);
        System.out.println(num%10);
    }
}
