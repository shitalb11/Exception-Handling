package org.example.ExceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
            System.out.println(10 / 0);
            int[] array = {};
            System.out.println(array[0]);
        }
    }
}
