package homework_week3;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */

public class Program3_MarkSheet {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        markSheet();
    }

    public static void markSheet() {

        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Roll number : ");
        int a = sc.nextInt();
        System.out.print("Enter Maths Marks : ");
        int maths = sc.nextInt();
        if (maths<0 || maths >= 100) {
            System.out.print("Invalid Input. Marks should between 0 to 100");
            System.exit(maths);
        }
        System.out.print("Enter Science Marks : ");
        int sci = sc.nextInt();
        if (sci<0 || sci >= 100) {
            System.out.print("Invalid Input. Marks should between 0 to 100");
            System.exit(sci);
        }
        System.out.print("Enter English Marks : ");
        int eng = sc.nextInt();
        if (eng<0 || eng >= 100) {
            System.out.print("Invalid Input. Marks should between 0 to 100");
            System.exit(eng);
        }

        int sum = maths + sci + eng;
        float per = (sum * 100) / 300;

        int average = (sum * 100) / 300;
        String grade;
        String result;

        if (maths >= 35 && sci >= 35 && eng >= 35) {
            result = "Pass";
        } else {
            result = "Fail";
        }

        if (average >= 80 && result == "Pass") {
            grade = "A+";
        } else if (average >= 60 && result == "Pass") {
            grade = "A";
        } else if (average >= 50 && result == "Pass") {
            grade = "B";
        } else if (average >= 35 && result == "Pass") {
            grade = "C";
        } else {
            grade = "";
        }


        System.out.println(" ______________________________");
        System.out.println("|                              |");
        System.out.println("|          Mark Sheet          |");
        System.out.println("|______________________________|");
        System.out.println("|      Name        :" + name + "     |");
        System.out.println("|      Roll No     :" + a + "          |");
        System.out.println("|______________________________|");
        System.out.println("|      Subjects    :    Marks  |");
        System.out.println("|______________________________|");
        System.out.println("|      Maths       :" + maths + "         |");
        System.out.println("|      Science     :" + sci + "         |");
        System.out.println("|      English     :" + eng + "         |");
        System.out.println("|______________________________|");
        System.out.println("|      Total       :" + sum + "        |");
        System.out.println("|______________________________|");
        System.out.println("|      Percentage  :" + per + "%      |");
        System.out.println("|      Result      :" + result + "       |");
        System.out.println("|      Grade       :" + grade + "          |");
        System.out.println("|______________________________|");

    }
}

