import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        for(;;) {
            System.out.println(i);
            i += 2;
            if(i > n)
                break;

        }
    }
}
