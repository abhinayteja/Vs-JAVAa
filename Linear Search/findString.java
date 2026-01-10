
import java.util.Scanner;

public class findString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String  name = in.next();
        System.out.println();
        System.out.print("Enter the char to find : ");
        String fin = in.next();

        for (int i = 0; i < name.length(); i++) {
            if (fin.equals(i)) {
                System.out.println("Found");
                break;
            }
        }

    }
}
