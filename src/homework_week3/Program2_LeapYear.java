package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Program2_LeapYear {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        Program2_LeapYear obj = new Program2_LeapYear();
        obj.leapYear();

    }

    public void leapYear(){

        System.out.print("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
