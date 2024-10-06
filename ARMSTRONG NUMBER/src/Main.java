import java.util.Scanner;
public class Main {
    public static int power(int a,int b) {
        int answer = 1;
        for(int i = 1; i<=b; i++) {
            answer *= a;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;//copy value of n to compare at last
        int count = 0;
        //CALCULATE NO OF DIGITS
        while(n > 0) {
            n = n / 10;
            count++;
        }
        n = temp;//After the first while loop in main,
        // reset n to its original value (n = temp)
        // so the second loop can process the digits properly.
        int sum = 0;
        while(n > 0) {
            int store = n % 10;//find the last digit
            sum = sum + power(store,count);
            n = n/10;//remove the last digit
        }
        if(sum == temp) {
            System.out.println("ARMSTRONG NUMBER");
        } else {
            System.out.println("NOT AN ARMSTRONG NUMBER");
        }
    }
}
