package homework_week3;

import java.util.Scanner;

public class Program4_DaysInMonth {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
Program4_DaysInMonth obj = new Program4_DaysInMonth();
        System.out.print("Input a year: ");
        int year = input.nextInt();

        boolean isLeapYear = obj.isLeapYear(year);
        if(year>=9999 || year<1 )
        {
            System.out.println("Parameter is invalid");
        }
        else {
            System.out.println("This Leap Year : " + isLeapYear);
        }

        System.out.print("Input a month number: ");
        int month = input.nextInt();



        int dayOfMonth = obj.getDaysInMonth(month, year);
        System.out.println("day Of Month : " + dayOfMonth);

    }

    public static boolean isLeapYear(int years) {

        boolean a;
        if (years <= 1 || years >= 9999) {
            a = false;
        } else {
            a = years % 4 == 0 && years % 100 != 0 || years % 400 == 0;
        }
        return a;
    }

    public int getDaysInMonth(int month, int year) {

        int number_Of_DaysInMonth = 0;
        String MonthOfName = "Unknown";


        if (month < 1 || month > 12) {
            System.out.println("The parameter month is invalid.");
        } else if (year < 1 || year > 9999) {
            System.out.println("The parameter year is outside the range.");
        } else {
            switch (month) {
                case 1:
                    MonthOfName = "January";
                    number_Of_DaysInMonth = 31;
                    break;
                case 2:
                    MonthOfName = "February";
                    boolean leapYear = isLeapYear(year);
                    if (leapYear == true) {
                        number_Of_DaysInMonth = 29;
                    } else {
                        number_Of_DaysInMonth = 28;
                    }
                    break;
                case 3:
                    MonthOfName = "March";
                    number_Of_DaysInMonth = 31;
                    break;
                case 4:
                    MonthOfName = "April";
                    number_Of_DaysInMonth = 30;
                    break;
                case 5:
                    MonthOfName = "May";
                    number_Of_DaysInMonth = 31;
                    break;
                case 6:
                    MonthOfName = "June";
                    number_Of_DaysInMonth = 30;
                    break;
                case 7:
                    MonthOfName = "July";
                    number_Of_DaysInMonth = 31;
                    break;
                case 8:
                    MonthOfName = "August";
                    number_Of_DaysInMonth = 31;
                    break;
                case 9:
                    MonthOfName = "September";
                    number_Of_DaysInMonth = 30;
                    break;
                case 10:
                    MonthOfName = "October";
                    number_Of_DaysInMonth = 31;
                    break;
                case 11:
                    MonthOfName = "November";
                    number_Of_DaysInMonth = 30;
                    break;
                case 12:
                    MonthOfName = "December";
                    number_Of_DaysInMonth = 31;
                    break;
                default:
                    return -1;
            }

            System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days and ");
            System.out.println(isLeapYear(year) ? year + " is Leap Year" :
                    year + " is not a Leap Year");
        }
        return -1;
    }
}