import java.util.Arrays;
import java.util.Scanner;

public class arrayObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter the value of the n : ");
        n  = in.nextInt();

        String [] Letter = new String[n];
        for (int i = 0; i < n; i++) {
            Letter[i] = in.next();
        }

        System.out.println(Arrays.toString(Letter));
        Letter[1] = "Abhinay";
        System.out.println(Arrays.toString(Letter));

    } 
}
