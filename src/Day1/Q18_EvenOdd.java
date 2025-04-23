package Day1;

import java.util.Scanner;

public class Q18_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;
            case 1:
                System.out.println(num + " is an odd number.");
                break;
        }
    }
}

