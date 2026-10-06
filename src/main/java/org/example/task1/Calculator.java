package org.example.task1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int substruct(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }

        return (double) a / b;
    }
}
