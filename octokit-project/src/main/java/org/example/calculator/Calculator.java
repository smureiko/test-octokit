package org.example.calculator;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Sum of firstNumber and secondNumber is: " + add(10, 20));
    }

    private static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
