package homework_week3;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Program1_NumberOdoEven {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        Program1_NumberOdoEven obj = new Program1_NumberOdoEven();
        obj.oddEven();

    }
    public void oddEven() {
        System.out.println("Enter number");
        int number = scan.nextInt();

        scan.close();

        //ternary operator to check number
        String result = number % 2 == 0 ? "Even" : "Odd";

        System.out.println(number + " is " + result);

    }
}
