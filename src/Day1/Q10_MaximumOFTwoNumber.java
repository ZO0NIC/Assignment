package Day1;

import java.util.Scanner;

public class Q10_MaximumOFTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        switch (Integer.compare(num1, num2)) {
            case 1:  System.out.println("Maximum number is: " + num1);break;
            case -1: System.out.println("Maximum number is: " + num2);break;
            default: System.out.println("Both numbers are equal.");break;
        }
    }
}
