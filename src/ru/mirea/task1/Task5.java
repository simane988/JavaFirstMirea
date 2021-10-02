package ru.mirea.task1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
    }

    public static int Factorial(int n){
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }
}
