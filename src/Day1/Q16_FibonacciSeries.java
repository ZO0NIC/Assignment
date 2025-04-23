package Day1;

import java.util.Scanner;

public class Q16_FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num1 = 0, num2 = 1, next;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");
            next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
    }
}

