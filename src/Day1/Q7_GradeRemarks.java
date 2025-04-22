package Day1;

import java.util.Scanner;

public class Q7_GradeRemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter grade (A/B/C/D/F): ");
        char grade = Character.toUpperCase(sc.next().charAt(0));

        switch (grade) {
            case 'A': System.out.println("Very Good"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Ok"); break;
            case 'D': System.out.println("Bad"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid grade");
        }
    }
}
