
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        
        System.out.print("Enter the name :");
        String name = inn.nextLine();

        System.out.println("Hello " + name);

    }
}
