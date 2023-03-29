package com;

public class Factorial {

    public static double calculateUn(int n) {
        double sum = 0;
        double factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            sum += factorial;
        }
        return (1.0 / factorial) * sum;
    }

    public static void main(String[] args) {
        double calculate = Factorial.calculateUn(8);
        System.out.println(calculate);
    }

}
