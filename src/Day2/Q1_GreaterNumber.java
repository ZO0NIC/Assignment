package Day2;

import java.util.Scanner;

public class Q1_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int greater = (num1 > num2) ? num1 : num2;
        System.out.println("Greater number: " + greater);
    }
}
