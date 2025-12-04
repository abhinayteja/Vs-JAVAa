
import java.util.Scanner;


public class revString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String  : ");
        String word = in.next();

        String reveString = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reveString = reveString + word.charAt(i);
        }

        System.out.println("reversed string   : "+reveString);
    }
}
