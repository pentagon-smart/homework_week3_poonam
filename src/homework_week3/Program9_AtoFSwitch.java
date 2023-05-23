package homework_week3;

import java.util.Scanner;

public class Program9_AtoFSwitch {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter alphabet between A to F : ");
        String city = scanner.next().toUpperCase();

        Program9_AtoFSwitch cityName = new Program9_AtoFSwitch();
        cityName.cityName(city);

        scanner.close();
    }

    public void cityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Bombay");
                break;
            case "C":
                System.out.println("Chennai");
                break;
            case "D":
                System.out.println("Diu");
                break;
            case "E":
                System.out.println("Elora");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("The Alphabet you have entered is not between A to F");
        }
    }
}
