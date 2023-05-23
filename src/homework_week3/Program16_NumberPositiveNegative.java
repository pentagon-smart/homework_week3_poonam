package homework_week3;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Program16_NumberPositiveNegative {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        checkNumber();

    }

    public static void checkNumber(){
        System.out.println("Enter Your Number: ");
        int num = sc.nextInt();
        if(num>0)
            System.out.println("This Number is Positive: " +num);
        else if(num<0)
            System.out.println("This Number is Negative: " +num);
        else
            System.out.println("This Number is Zero: " +num);
    }

}
