
import java.util.Scanner;

public class anstrongNumber {
    public static void main(String[] args) {
        // check whether it is a anstrong number .. dude
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to check  it is anstrong number :");
        int n = in.nextInt();

        int copy = n;
        int temp = n;
        int rem ;
        int c = 0;
        int result = 0;
        int pow ;


       

        while(copy != 0){
            copy = copy / 10;
            c++;
        }
        
        System.out.println(c);

        while (temp != 0) {
            rem = temp % 10;
            pow = (int)Math.pow(rem, c);
            result = result + pow;
            temp /= 10;
        }

        System.out.println(result);

        if(result == n){
            System.out.println("The given number is anstrong Number");
        } else{
            System.out.println("It is not a anstrong number ");
        }

    }
}
