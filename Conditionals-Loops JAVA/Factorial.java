
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find Fatorial : ");
        int a = in.nextInt();

        int aans = fact(a);
        System.out.println("The factorial value : " + aans);

    }

    static  int fact(int n){
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
}
