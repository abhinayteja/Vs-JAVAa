
import java.util.Scanner;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // sum of n numbers
        System.out.print("Enter the No of Numbers : ");
        int n = in.nextInt();

        int ans = sumnNumbers(n);
        System.out.println("The total sum : "+ans);

    }

    static int sumnNumbers(int x){
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum = sum + i;
        }
        return sum;
    }


}
