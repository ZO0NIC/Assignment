package Day3;

import java.util.Scanner;

public class AllFunction {
    public static void main(String[] args) {
        weekday(5);
        gender('M');
        vowelConsonant('A');
        evenOdd(7);
        daysInMonth(5);
        simpleCalculator(4,6,'+');
        gradeRemark('A');
        votingEligibility(20);
        maximum(54,45);
        sumOfNaturalNumbers(15);
        multiplicationTable(11);
        factorial(5);
        power(2,4);
        reverseDigits(157);
        fibonacci(5);
        primeNumber(7);
        palindrome(151);
        findHCF(150,15);
        absoluteValue(-99);
        plusNegativeZero(-7);
        leapYear(2000);
        smallestNumber(5,7,9);
    }

    public static void smallestNumber(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println("The smallest of " + a + ", " + b + ", and " + c + " is " + a);
        } else if (b <= a && b <= c) {
            System.out.println("The smallest of " + a + ", " + b + ", and " + c + " is " + b);
        } else {
            System.out.println("The smallest of " + a + ", " + b + ", and " + c + " is " + c);
        }
    }

    public static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static void plusNegativeZero(int n) {
        if (n > 0) {
            System.out.println(n + " is positive");
        } else if (n < 0) {
            System.out.println(n + " is negative");
        } else {
            System.out.println(n + " is zero");
        }
    }

    public static void absoluteValue(int n) {
        if (n < 0) {
            System.out.println("Absolute value of " + n + ": " + -n);
        } else {
            System.out.println("Absolute value of " + n + ": " + n);
        }
    }

    public static void findHCF(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("HCF of the two numbers is: " + a);
    }

    public static void palindrome(int num) {
        int original = num, reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }

    public static void primeNumber(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && num > 1) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void fibonacci(int terms) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }

    public static void power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
    }

    public static void factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    public static void sumOfNaturalNumbers(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of first " +num+" natural numbers: " + sum);
    }

    public static void maximum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    public static void votingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }

    public static void gradeRemark(char grade) {
        switch (grade) {
            case 'A': System.out.println("Very Good"); break;
            case 'B': System.out.println("Good"); break;
            case 'C': System.out.println("Ok"); break;
            case 'D': System.out.println("Bad"); break;
            case 'F': System.out.println("Fail"); break;
            default: System.out.println("Invalid grade");
        }
    }

    public static void simpleCalculator(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public static void daysInMonth(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days in the month");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30 days in the month");
                break;
            case 2:
                System.out.print("Enter year: ");
                Scanner sc = new Scanner(System.in);
                int year = sc.nextInt();

                // Check leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29 days (Leap year)");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("Invalid month number");
        }
    }

    public static void evenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }

    public static void vowelConsonant(char character) {
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println(character + " is a vowel.");
        } else {
            System.out.println(character + " is a consonant.");
        }
    }

    public static void gender(char gender) {
        if (gender == 'M' || gender == 'm') {
            System.out.println("Male");
        } else if (gender == 'F' || gender == 'f') {
            System.out.println("Female");
        } else {
            System.out.println("Invalid input");
        }
    }

    static void weekday(int day){
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.print("not a valid input");
        }
    }
}
