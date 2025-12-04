
import java.util.Scanner;

public class Product {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the num1 : ");
    int num1 = in.nextInt();

    System.out.print("Enter the num2 : ");
    int num2 = in.nextInt();

    int pr = prod(num1,num2);
    System.out.println("The product is : "+pr);

   } 

   static int prod(int a, int b){
        int product = a * b;
        return  product;
   }
   
}


