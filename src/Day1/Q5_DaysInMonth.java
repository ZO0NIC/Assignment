package Day1;

import java.util.Scanner;

public class Q5_DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month, year;

        System.out.print("Enter month number (1-12): ");
        month = scanner.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;

            case 4: case 6: case 9: case 11:
                System.out.println("30 days");
                break;

            case 2:
                System.out.print("Enter year: ");
                year = scanner.nextInt();

                // Check leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29 days (Leap year)");
                } else {
                    System.out.println("28 days");
                }
                break;

            default:
                System.out.println("Invalid month. Please enter a number from 1 to 12.");
        }
    }
}

