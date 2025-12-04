
import java.util.Scanner;

public class findEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = in.nextInt();

        evenOdd(a);
    }

    static  void evenOdd(int x){
        if(x % 2 == 0){
            System.out.println("It is even Number");
        }else{
            System.out.println("It is odd Number ");
        }
    }
}
