
import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t1 = 0;
        int t2 = 1;

        int t3;

        System.out.print("Eneter teh value of n : ");
        int n = in.nextInt();

        for(int i = 0;i <= n;i++){
            t3 = t1 + t2;
            System.out.print(" " +t1 +" ");
            t1 = t2;
            t2 = t3;
        }
    }
}
