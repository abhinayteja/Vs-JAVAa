
import java.util.Scanner;

public class sumOFnumOddnum {
    public static void main(String[] args) {
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter integers (0 to stop):");

        while (true) {
            if (!sc.hasNextInt()) {
                sc.next(); // skip non-integer token
                continue;
            }
            int n = sc.nextInt();
            if (n == 0) break;
            if (n < 0) {
                sumNegative += n;
            } else if (n % 2 == 0) {
                sumPositiveEven += n;
            } else {
                sumPositiveOdd += n;
            }
        }

        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);

        }
    }
}
