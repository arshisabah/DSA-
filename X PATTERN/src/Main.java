import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //UPPER PART
        for (int i = 0; i < n; i++) {
            //LEFT SPACE
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print(i+1);
            for (int j = n+2 ; j > i ; j--) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
