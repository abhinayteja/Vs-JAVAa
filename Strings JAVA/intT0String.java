
import java.util.Scanner;

public class intT0String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the n value : ");
        int n = in.nextInt();

        String s = String.valueOf(n);
        
        System.out.println("To String : "+s);
    }
}
