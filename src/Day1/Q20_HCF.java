package Day1;

import java.util.Scanner;

public class Q20_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = 1;
        int i = 2;
        int a = num1;
        int b = num2;

        if (a == b) {
            hcf = a;
        } else {
            while (i <= a && i <= b) {
                if (a % i == 0 && b % i == 0) {
                    hcf *= i;
                    a /= i;
                    b /= i;
                } else {
                    i++;
                }
            }
        }
        System.out.println("HCF of the "+ num1 +" and "+num2+" numbers is: " + hcf);

//        while (num2 != 0) {
//            int temp = num2;
//            num2 = num1 % num2;
//            num1 = temp;
//        }
//        System.out.println(Math.abs(num1));

//        while (a != b) {
//            if (a > b) {
//                a -= b;
//            } else {
//                b -= a;
//            }
//        }
    }
}

