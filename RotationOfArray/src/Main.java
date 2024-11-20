//ROTATION OF AN ARRAY K TIMES
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter rotation size: ");
        int k = sc.nextInt();//rotation size
        k = k%n;
        int []rev = new int[n];//reversed array
        for (int i = 0; i < n; i++) {
            int newIndex = (i-k);
            if (newIndex < 0) {
                newIndex += n;
            }
            rev[newIndex] = arr[i];
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]+" ");
        }

    }
}
