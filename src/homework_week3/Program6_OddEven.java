package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */

public class Program6_OddEven {

    public static void main(String[] args) {

        odoEven();
    }

    public static void odoEven(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");

    }
}
