package Day2;

import java.util.Scanner;

public class Q5_GradeAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int score = sc.nextInt();
        String grade =  (score >= 90) ? "A" :
                        (score >= 80) ? "B" :
                        (score >= 60) ? "C" :
                        (score >= 40) ? "D" :
                        (score >= 30) ? "E" : "F";

        System.out.println("Grade: " + grade);

    }
}
