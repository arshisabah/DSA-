import java.util.*;

import static java.lang.Math.log10;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int last = n % 10;
        int digits = (int)Math.log10(n);//CALCULATE N-1 DIGITS
        int first = (int)(n/Math.pow(10,digits));
        System.out.println(first+" "+last);
    }
}
