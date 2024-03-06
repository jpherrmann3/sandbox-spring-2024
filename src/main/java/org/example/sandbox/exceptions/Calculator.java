package org.example.sandbox.exceptions;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.divide(2f, 0f));
        } catch (DivideByZeroException e) {
           e.printStackTrace();
        }


    }

    public float divide(float a, float b) throws DivideByZeroException {

        if (b == 0.0) {
            throw new DivideByZeroException("Denominator must be non zero");
        }
        return a / b;
    }
}
