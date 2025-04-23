package Day1;

import java.util.Scanner;

public class Q8_MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.print("Choose operation (1-4): ");
        int choice = sc.nextInt();

        System.out.println("Enter two numbers");
        System.out.print("First numbers: ");
        int a = sc.nextInt();
        System.out.print("Second numbers: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Sum: " + (a + b)); break;
            case 2: System.out.println("Difference: " + (a - b)); break;
            case 3: System.out.println("Product: " + (a * b)); break;
            case 4:
                if (b != 0) {
                    System.out.println("Quotient: " + (a / b));
                    System.out.println("Remainder: " + (a % b));
                }
                else
                    System.out.println("divider cant be zero");
                break;
            default: System.out.println("Invalid choice");
        }
    }

}
