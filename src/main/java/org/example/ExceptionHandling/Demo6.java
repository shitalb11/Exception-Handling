package org.example.ExceptionHandling;

public class Demo6 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println(10 / 0);
            } catch (ArithmeticException e){
                System.out.println("inner catch");
            }
        }

    }
}
