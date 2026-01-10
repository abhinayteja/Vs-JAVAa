// reverse a String
import java.util.Scanner;

public class reveString{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enetr the string :");
        String Word = in.next();

        String rev = " ";

        for(int i = Word.length()-1; i >= 0;i--){
            rev = rev + Word.charAt(i);
        }

        System.out.println("Reversed Word : "+rev);
    }
}