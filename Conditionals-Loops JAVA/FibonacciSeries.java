
import java.util.Scanner;


public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the no of terms : ");
        int x = in.nextInt();

        feb(x);
       
    }

    static void feb(int n){
        int t1 = 0;
        int t2 = 1;
        int t3;

        for (int i = 0; i <= n; i++) {
            System.out.print(t1 + " ");
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }

    }
}
