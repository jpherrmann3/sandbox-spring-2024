package org.example.sandbox.recursion;

public class GreatestCommonDivisor {

    public int gcdDiv(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }

        return a;
    }

    public int gcdSub(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }

            else {
                b = b - a;
            }
        }

        return a;
    }

    public int gcdRec(int a, int b) {
        if (b == 0) {
            return a;
        }

        else {
            return gcdRec(b, a % b);
        }
    }

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
        int a = 2040;
        int b = 240;
        System.out.println(greatestCommonDivisor.gcdDiv(a, b));
        System.out.println(greatestCommonDivisor.gcdSub(a, b));
        System.out.println(greatestCommonDivisor.gcdRec(a, b));
    }

}
