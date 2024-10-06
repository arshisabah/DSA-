import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int HCF = 1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.min(a,b);
        //System.out.println(c);
        for(int i=1; i<=c; i++) {
            if((a % i == 0) && (b % i == 0)) {
                HCF = i;
            }
        }
        System.out.println(HCF);
    }
}
//fix for zero
/*
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HCF = 1;
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Check for zero input cases
        if (a == 0 && b == 0) {
            System.out.println("HCF is undefined for both numbers being zero.");
        } else if (a == 0) {
            System.out.println("HCF is: " + b); // HCF of 0 and b is b
        } else if (b == 0) {
            System.out.println("HCF is: " + a); // HCF of a and 0 is a
        } else {
            // Normal case when neither a nor b is zero
            int c = Math.min(a, b);

            for (int i = 1; i <= c; i++) {
                if ((a % i == 0) && (b % i == 0)) {
                    HCF = i;
                }
            }
            System.out.println("HCF is: " + HCF);
        }
        sc.close();
    }
}

 */

//OPTIMISED VERSION
/*
import java.util.*;
public class Main {
    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        // Base case: if one number is 0, the GCD is the other number
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Handling the case where both numbers are zero
        if (a == 0 && b == 0) {
            System.out.println("HCF is undefined for both numbers being zero.");
        } else {
            // Calculate GCD and display it
            int hcf = Math.abs(gcd(a, b));  // Use absolute value to handle negative numbers
            System.out.println("HCF is: " + hcf);
        }
        sc.close();
    }
}

 */