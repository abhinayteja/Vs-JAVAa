
import java.util.Scanner;

public class Som {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the num1 : ");
    int num1 = in.nextInt();

    System.out.print("Enter the num2 : ");
    int num2 = in.nextInt();

    int sum = sam(num1,num2);
    System.out.println("The Sum is :"+sum);

   } 

   static int sam(int a, int b){
        int sum = a + b;
        return  sum;
   }
   
}
