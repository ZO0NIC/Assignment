package Day2;

import java.util.Scanner;

public class Q6_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int year = sc.nextInt();
        String isLeap = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";
        System.out.println(year + " is " + isLeap);

    }
}
