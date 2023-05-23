package homework_week3;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */

public class Program8_FindAtoF {

    public static void main(String[] args) {
        Scanner g1 = new Scanner(System.in);
        System.out.println("Please Enter Alphabet between A to F : ");
        char city = g1.next().charAt(0);
        Program8_FindAtoF cityName = new Program8_FindAtoF();
        cityName.cityName(city);
        g1.close();
    }

    public void cityName(char city){
        if (city == 'A' || city == 'a'){
            System.out.println("Ahmedabad");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Bombay");
        } else if (city == 'C' || city == 'c') {
            System.out.println("Chennai");
        } else if (city == 'D' || city == 'd') {
            System.out.println("Diu");
        } else if (city == 'E' || city == 'e') {
            System.out.println("Elora");
        } else if (city == 'F' || city == 'f') {
            System.out.println("Faridabad");
        } else {
            System.out.println("The Alphabet you have entered is not between A to F ");
        }
    }

}


