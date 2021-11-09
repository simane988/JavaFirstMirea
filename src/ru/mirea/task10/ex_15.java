package ru.mirea.task10;

import java.util.Scanner;

public class ex_15 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        func(num);
    }

    static void func(int num){
        System.out.println(num%10);
        if(num>9)
            func(num/10);
    }
}
