import java.util.Scanner;

public class Reverseofastring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String :");
        String word = in.next(); // Take only one word mean -----> Abhinay teja ----> (Abhinay)

        String reve = "";
        for (int i = word.length() - 1; i >= 0 ; i--) {
            reve += word.charAt(i);
        }

        System.out.println("The reveresed    : " +reve);

        if (word.equals(reve)) {
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }



    }
}
