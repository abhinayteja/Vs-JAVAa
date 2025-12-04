import java.util.Scanner;

public class AvarageofnNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the n value : ");
        int n = in.nextInt();

        int sum = 0;
        int avg;

         for (int i = 1; i <= n; i++) {
             sum += i;
         }
        
         avg = sum / n;

         System.out.println("The average is : "+avg);

    }
}
