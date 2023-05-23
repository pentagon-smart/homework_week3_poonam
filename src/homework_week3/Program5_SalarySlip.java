package homework_week3;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 */

public class Program5_SalarySlip {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        salaryCalculation();

    }

    public static void salaryCalculation() {


        System.out.print("Enter Employee Id :");
        int eID = sc.nextInt();
        System.out.print("Enter Employee Name : ");
        String eName = sc.next();
        System.out.print("Enter Employee Basic Salary : ");
        int basicSalary = sc.nextInt();

        int hra = (basicSalary * 10) / 100;
        int da = (basicSalary * 8) / 100;
        int ta = (basicSalary * 9) / 100;
        int pf = (basicSalary * 20) / 100;
        int grossSalary = basicSalary + hra + ta + da - pf;

        System.out.println(" ______________________________");
        System.out.println("|          Salary Slip         |");
        System.out.println("|______________________________|");
        System.out.println("|      Employee Id     :" + eID +              "|");
        System.out.println("|      Employee Name   :" + eName +  "|");
        System.out.println("|______________________________|");
        System.out.println("|      Basic Salary   :" + basicSalary +        "|");
        System.out.println("|      HRA 10%        :" + hra +             "|");
        System.out.println("|      TA 8%          :" + ta +              "|");
        System.out.println("|      DA 9%          :" + da +              "|");
        System.out.println("|      PF - 20%       :" + pf +              "|");
        System.out.println("|______________________________|");
        System.out.println("|        Gross Salary :" + grossSalary + "|");
        System.out.println("|==============================|");
    }
}
