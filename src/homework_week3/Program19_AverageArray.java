package homework_week3;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Program19_AverageArray {

    public static void main(String[] args) {

        avgArray();
    }

    public static void avgArray(){
        int num [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for(int i=0; i < num.length ; i++)
            sum = sum + num[i];
        //calculate average value
        double average = sum / num.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}

