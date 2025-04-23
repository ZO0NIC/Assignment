package Day2;

import java.util.Scanner;

public class Q3_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n = sc.nextInt();
        int absolute = (n >= 0) ? n : n*-1;
        System.out.println("Absolute value of "+ n + " is: " + absolute);
    }

}
