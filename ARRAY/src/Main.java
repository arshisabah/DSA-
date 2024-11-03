//INSERT ARRAY AT A SPECIFIC POSITION
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value you want to insert: ");
        int val = sc.nextInt();
        System.out.println("Enter the index where you want to insert: ");
        int index = sc.nextInt();
        int[] arr1 = new int[n+1];
        //TWO POINTER
        int i = 0,j = 0;
        //i is tracking the original array
        //j is tracking the new array
        while (i < index) {
            arr1[j] = arr[i];
            i++;
            j++;
        }
        arr1[j] = val;
        j++;
        while (i < n) {
            arr1[j] = arr[i];
            i++;
            j++;
        }
        for (int k = 0; k < arr1.length; k++) {
            System.out.print(arr1[k]+" ");
        }

    }
}
