import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int space = 0;
        for(int i=1; i<=row; i++) {
            //SPACE
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            //STAR
            for(int j=1; j<=row; j++) {
                System.out.print("*");
            }
            space++;
            System.out.println();
        }
    }
}
