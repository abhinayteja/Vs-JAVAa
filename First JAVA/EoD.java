
import java.util.Scanner;

public class EoD {
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = num1.nextInt();
        

        if (a % 2 == 0) {
            System.out.println("The a is Even");
        } else {
            System.out.println("The a is Odd");
        }

        
    }
}
