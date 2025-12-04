
import java.util.Scanner;

public class FindEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even = 0;
        while (true) { 
            int a = in.nextInt();

            if (a == -1) {
                break;
            }

            if (a % 2 == 0) {
                even++;
            }
        }
        System.out.println("Total even numbers : " +even);
    }
}
