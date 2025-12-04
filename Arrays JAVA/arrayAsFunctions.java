
import java.util.Arrays;
import java.util.Scanner;

public class arrayAsFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Enter the n vale : ");
        n = in.nextInt();

        String [] name = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+i+"element:");
            name[i] = in.next();
         }   

         System.out.println(Arrays.toString(name));
         nae(name); // we called the  function. 
         System.out.println(Arrays.toString(name));
}
    static String nae(String [] ae){ // we have passed the aray as  the  functiojnn argument ;
        ae[0] = "Hello World"; // Index has changed in the function
        return ae[0];
    }
}