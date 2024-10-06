import java.util.*;
public class Main {
    public static boolean isPrime(int n) {
        int count = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                count++;
            }
        }
        if(count == 2) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if((n % i == 0) && (isPrime(i))) {
                System.out.print(i+" ");
            }
        }
    }
}

//OPTIMIZED VERSION
/*
import java.util.*;

public class Main {
    // Optimized method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;  // Handle edge case for 1 and negative numbers
        if (n == 2 || n == 3) return true;  // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false;  // Eliminate multiples of 2 and 3

        // Check divisibility from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Prime factors of " + n + ":");
        for (int i = 2; i <= n; i++) {
            // Check if 'i' is a factor and prime
            if (n % i == 0 && isPrime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}

 */
