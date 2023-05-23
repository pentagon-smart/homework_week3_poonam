package homework_week3;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 *find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */

public class Program10_Calculation {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.println("Entre 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print(
                "Choose and Enter the type of operation you want to perform (+, -, *, /, %) - ");
        char op = sc.next().charAt(0);
        calculation(num1, num2, op);

    }

    public static int calculation(int num1, int num2, char op){
        int ans = 0;

        if (op == '+') {
            ans = num1 + num2;

        }
        else if (op == '-') {
            ans = num1 - num2;

        }
        else if (op == '*') {
            ans = num1 * num2;

        }
        else if (op == '%') {
            ans = num1 % num2;

        }
        else if (op == '/') {
            ans = num1 / num2;
        }

        System.out.println("Your answer is = " + ans);
        return ans;

    }
}
