import java.util.Scanner;

public class FindLargest {
     public static void main(String[] args) {
       Scanner inp = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        // The loop whic take the input from the USER

        while (true) {
            int a = inp.nextInt();
 
            if (a == 0) {
                break;
            }

            if (a > max) {
                max = a;
            }
        }
        System.out.println("The max element : " + max);
    }
}
