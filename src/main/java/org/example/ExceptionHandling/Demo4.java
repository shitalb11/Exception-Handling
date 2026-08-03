package org.example.ExceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("Rest of the Try");
        } catch (NullPointerException npe){
            System.out.println("NPE");
        }
        System.out.println("rest of the main");
    }
}
