
import java.util.Scanner;

public class SI {
    public static void main(String[] args) {

        
        Scanner t1 = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);
        Scanner t3 = new Scanner(System.in);

        System.out.print("Enter the principle (p) :");
        int p = t1.nextInt();
        System.out.print("Enter the time      (t) :");
        int t = t2.nextInt();
        System.out.print("Enter the rate.     (r) :");
        int r = t3.nextInt();

        int Si = (p * t * r) / 100;

        System.out.println(Si);

        
    }
}
