package Day1;

import java.util.Scanner;

public class Q9_VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        int num;

        if (age < 18 && age >=0)
            num = 1;
        else if (age >=18)
            num = 0;
        else
            num = 3;

        switch(num) {
            case 0 :  System.out.println("Eligible to vote"); break;
            case 1 :  System.out.println("Not eligible to vote"); break;
            default : System.out.println("Not valid age"); break;
        }
    }
}

