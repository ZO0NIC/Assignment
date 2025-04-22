package Day1;

import java.util.Scanner;

public class Q2_Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gender (M/F): ");
        char gender = 'M';

        switch (gender) {
            case 'M': System.out.println("Male"); break;
            case 'F': System.out.println("Female"); break;
            default: System.out.println("Invalid input");
        }

    }
}
