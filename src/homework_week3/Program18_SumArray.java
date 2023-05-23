package homework_week3;

/**
 * Write a Java program to sum values of an array.
 */

public class Program18_SumArray {

    public static void main(String[] args) {

        sumArray();
    }

    public static void sumArray(){

        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for (int i : a)
            sum += i;
        System.out.println("The sum is " + sum);

    }
}
