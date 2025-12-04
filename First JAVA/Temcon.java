
import java.util.Scanner;

public class Temcon {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     System.out.print("Enter value in the celceius :");
     int celceius = input.nextInt();

     // to the farenheit

     double farenheit = 0.8 * celceius;
     
     System.out.print("Into the celceius : "+farenheit+"F");
     
     
    }
}
