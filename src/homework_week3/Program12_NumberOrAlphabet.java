package homework_week3;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Program12_NumberOrAlphabet {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        valueChecker();
    }

    public static void valueChecker() {
        System.out.println("Enter the Value : ");
        char c = sc.next().charAt(0);
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
            System.out.println(c + " is an alphabet.");
        }
        if (c >= '0' && c <= '9') {
            System.out.println(c + " is a number.");
        } else {
            System.out.println(c + " is a symbol.");
        }
    }

}

