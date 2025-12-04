
import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        sum(a,b);
    }
    static void  sum(int a, int b){
       System.out.println("The sum of the two numbers is : "+ (a + b));
    }
}
