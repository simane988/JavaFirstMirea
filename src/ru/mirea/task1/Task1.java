package ru.mirea.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько будет элементов в массиве?");
        final int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += arr[i];
        }
        System.out.println("For: " + ans);

        ans = 0;
        int i = 0;
        while (i < n){
            ans += arr[i];
            i++;
        }
        System.out.println("While: " + ans);

        ans = 0;
        i = 0;
        do {
            ans += arr[i];
            i++;
        } while (i < n);
        System.out.println("Do while: " + ans);
    }
}
