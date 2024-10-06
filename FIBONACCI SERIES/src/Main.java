import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println(a+"\n"+b);
        for(int i = 0; i<n-2; i++) {
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
//OPTIMIZED VERSION
/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close(); // Close scanner after input

        // Handle cases where n is less than 2
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        } else if (n == 1) {
            System.out.println(0);
            return;
        }

        // Initialize first two Fibonacci numbers
        int a = 0, b = 1;
        System.out.println(a); // Print the first Fibonacci number
        System.out.println(b); // Print the second Fibonacci number

        // Calculate and print the next n-2 Fibonacci numbers
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}

 */
