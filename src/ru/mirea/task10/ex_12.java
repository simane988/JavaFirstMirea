package ru.mirea.task10;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        func();
    }

    static void func(){
        Scanner console = new Scanner(System.in);
        String data = console.nextLine();
        int i = 0;
        while(data.charAt(i) != '0'){
            int num = data.charAt(i) - '0';
            if(num%2 == 1){
                System.out.println(num);
            }
            i++;
        }
    }
}
