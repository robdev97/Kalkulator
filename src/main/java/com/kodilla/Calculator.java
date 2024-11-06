package com.kodilla;


class AdditionAndSubstraction {

    public int addition(int a, int b) {
        return a + b;
    }
    public int substraction(int a, int b) {
        return a - b;
    }
}

public class Calculator {
    public static void main(String[] args) {

        AdditionAndSubstraction calculator = new AdditionAndSubstraction();
        int result1 = calculator.addition(5, 10);
        int result2 = calculator.substraction(10, 5);

        System.out.println(result1);
        System.out.println(result2);
    }
}