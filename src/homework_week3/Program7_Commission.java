package homework_week3;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 */

public class Program7_Commission {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        commissionCal();

    }

    public static void commissionCal() {

        System.out.print("Enter Sales Id :");
        int sId = sc.nextInt();
        System.out.print("Enter Seller Name : ");
        String sName = sc.next();
        System.out.print("Enter Sales Amount : ");
        double amount = sc.nextDouble();
        System.out.print("Enter Basic Salary : ");
        double salary = sc.nextDouble();
        double commission = 0;
        int rate = 0;


        if (amount >= 50000) {
            rate = 35;
            commission = amount * 0.35;
        }
        if (amount >= 30000 && amount <= 20000 ) {
            rate = 20;
            commission = amount * 0.2;
        }
        if (amount >= 20000 && amount <= 10000) {
            rate = 10;
            commission = amount * 0.1;
        }
        if (amount >= 10000  && amount <= 10000) {
            rate = 5;
            commission = amount * 0.05;
        }
        if (amount < 10000) {
            rate = 2;
            commission = amount * 0.02;
        }
        System.out.println("Commission amount=" + commission);

    }
}
