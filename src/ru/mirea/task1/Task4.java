package ru.mirea.task1;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        final Random rand = new Random();
        int n = (int) (Math.random()*10);
        System.out.println(n);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
