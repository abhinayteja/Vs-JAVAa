
import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = in.nextInt();

        int Sum_of_Divisiors = 0;

        int i = 1;
        while ( i < n) {
            if (n % i == 0) {
                Sum_of_Divisiors = Sum_of_Divisiors + i;
            }
            i++;
        }

        if(n == Sum_of_Divisiors){
            System.out.println("It is a perfect number");
        }else{
            System.out.println("It is not a pefect number");
        }
        

    }
}
