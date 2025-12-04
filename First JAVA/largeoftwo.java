
import java.util.Scanner;

public class largeoftwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = input.nextInt();

        System.out.print("Enter b : ");
        int b = input.nextInt();

        if(a > b){
            System.out.println("a is greater then the b");
        }else{
            System.out.println("b is greater then the a");
        }
    }
}
