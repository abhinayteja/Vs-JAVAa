import java.util.Arrays;
import java.util.Scanner;

public class arrayTraversing {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);

        int n;

        System.out.print("Entee the n value :");
        n = in.nextInt();

        int [] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+i+"Element :");
            array[i] = in.nextInt();
        }
        System.out.print("[");   
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" "); // onr way to Print 
        }
        System.out.println("]");

        System.out.println(Arrays.toString(array)); // best way to print like wee need to 


    }
}
