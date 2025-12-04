import java.util.Scanner;

public class LrgestofThree {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();

         if(a > b && a > c){
            System.out.println("A is greater than b and c");
         } else if(b > a && b > c){
            System.out.println("B is greater than  a and c");
         } else{
            System.out.println("C is greater than a and b");
         }


    }
}
