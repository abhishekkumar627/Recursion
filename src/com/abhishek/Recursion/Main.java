package com.abhishek.Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iterative Factorial : " + iterativeFactorial(3));
        System.out.println("---------------------------");
        System.out.println("Recursive Factorial : " + recursiveFactorial(3));
    }
    // Call stack for recursion
    // recursiveFactorial(0)
    // recursiveFactorial(1)
    // recursiveFactorial(2)
    // recursiveFactorial(3)
    public static int recursiveFactorial(int num) {
        if (num == 0) return 1;
        return num * recursiveFactorial(num - 1);
    }
    public static int iterativeFactorial(int num) {
        if (num == 0)return 1;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
