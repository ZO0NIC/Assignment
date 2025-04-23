package Day2;

import java.util.Scanner;

public class Q4_PlusNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = sc.nextInt();
        String status = (n > 0) ? "Positive" : ((n < 0) ? "Negative" : "Zero");
        System.out.println("The number is " + status);
    }
}
