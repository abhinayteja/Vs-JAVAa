import java.util.Scanner;

public class inser {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         int i = scan.nextInt();
         double d = scan.nextDouble();
         scan.nextLine();  // it is the space will be taken 
         String s = scan.nextLine();
       
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}