
import java.util.Scanner;

public class In {
    public static void main(String[] args){
       try (Scanner inut = new Scanner(System.in)) {
        System.out.println("Enter the number : ");
           int ou = inut.nextInt();
           
           System.out.println("The out put you entered is " + ou);
       }



    }
}
