import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HCF = 1;
        System.out.print("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.min(a,b);
        //System.out.println(c);
        for(int i=1; i<=c; i++) {
            if((a % i == 0) && (b % i == 0)) {
                HCF = i;
            }
        }
        int LCM = (a*b)/HCF;
        System.out.println(LCM);
    }
}
/*
Using GCD Helper Method
import java.util.Scanner;

public class LCMCalculator {

    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate LCM
        int result = lcm(num1, num2);

        // Output the result
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}

 */