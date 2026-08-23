package org.example.ExceptionHandling;

public class Demo16 {
    public static void main(String[] args) {
        try {
            m1();
        }catch (ArithmeticException e) {
            System.out.println("divide by zero");
        }
    }
    }

