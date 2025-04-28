package Day1;

import java.util.Scanner;

public class Q2_Gender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);

        switch (gender) {
            case 'M': case 'm' : System.out.println("Male"); break;
            case 'F': case 'f' : System.out.println("Female"); break;
            default: System.out.println("Invalid input");
        }

    }
}
