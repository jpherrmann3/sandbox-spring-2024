package org.example.sandbox.recursion;

public class Factorial {

    // Limit is n = 21
    private long calculate(int n) {
        if (n == 0) {
            return 1;
        }

        return n * calculate(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        for (int x = 0; x <= 20; x++) {
            System.out.println(x + ": " + factorial.calculate(x));
        }
    }
}
