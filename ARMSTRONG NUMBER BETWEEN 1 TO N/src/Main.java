import java.util.*;
public class Main {
    public static int power(int a,int b) {
        int answer = 1;
        for(int i = 1; i<=b; i++) {
            answer *= a;
        }
        return answer;
    }
    public static boolean IsArmstrong(int n) {
        int temp = n;
        int count = 0;
        while(n > 0) {
            n = n/10;
            count++;
        }
        int sum = 0;
        n = temp;
        while(n > 0) {
            int last = n % 10;
            sum = sum + power(last,count);
            n = n/10;
        }
//        if(sum == temp) {
//            return true;
//        } else {
//            return false;
//        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point: ");
        int start = sc.nextInt();
        System.out.print("Enter the end point: ");
        int end = sc.nextInt();
        System.out.print("The Armstrong numbers are: ");
        for(int i = start; i<=end; i++) {
            if(IsArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
