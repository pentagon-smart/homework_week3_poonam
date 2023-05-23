package homework_week3;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Program17_NumericStringArray {

    public static void main(String[] args) {

        methodArray();

    }

    public static void methodArray(){

        int a [] = {99,45,78,33,77,10,67,21,49,39,101};

        String b [] = {"banana", "orange", "apple", "grapes", "cherry", "mango"};

        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+Arrays.toString(a));

        Arrays.sort(b);
        System.out.println("Sorted String array : "+Arrays.toString(b));

    }
}
