import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int space = row-1;
        int star = 1;
        for (int i = 1; i<=row; i++) { //OUTER LOOP
            //PRINT SPACE
            for(int j = 1; j<=space; j++) {
                System.out.print(" ");
            }
            //PRINT STAR
            for(int j = 1; j<=star; j++) {
                System.out.print("*");
            }
            star++;
            space--;
            System.out.println();
        }
    }
}
