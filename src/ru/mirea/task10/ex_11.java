package ru.mirea.task10;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        countOnes();
    }

    static void countOnes(){
        Scanner console = new Scanner(System.in);
        String data = console.nextLine();
        int i = 0;
        int count = 0;
        while ((data.charAt(i) != '0') || (data.charAt(i+1) != '0')){
            if(data.charAt(i) == '1')
                count++;
            i++;
        }
        System.out.println(count);
    }
}
