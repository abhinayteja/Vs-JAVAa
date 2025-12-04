import java.util.Scanner;

public class findingNumberpalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int rem;
        int revese = 0;
        int temp;


        System.out.print("Enter the number :");
        int n = in.nextInt();

        temp = n;

        while (temp != 0) {
            rem = temp % 10; // gives the remainder
            revese = revese * 10 + rem ;
            temp /= 10;
        }

        
        System.out.println("Original : " + n);
        System.out.println("Reversed : " + revese);

        if (n == revese) {
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
