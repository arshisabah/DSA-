import java.util.*;
public class Main {
    public static boolean isPrime(int n) {
        int count = 0;
        for(int i = 1; i<=n; i++) {
            if(n % i == 0)
                count++;
        }
        return count == 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}

//OPTIMISED VERSION
/*
import java.util.Scanner;

public class Main {

    // Optimised method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // Handle 1 and negative numbers
        if (n == 2) return true;  // 2 is prime
        if (n % 2 == 0) return false;  // Eliminate even numbers > 2

        // Check divisibility up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close(); // Close scanner after input

        // Loop from 2 to n to print all prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

 */
