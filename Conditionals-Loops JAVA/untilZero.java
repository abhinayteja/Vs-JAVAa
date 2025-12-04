
import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers
public class untilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int sum = 0;
     // The loop whic take the input from the USER
        while (a != 0) {
            a = in.nextInt();
            if (a == 0) {
                break;
            }
            sum += a;
            a++;
        }

        System.out.println("The Sum of the number are : " + sum);
    }

}
