import java.util.Arrays;
import java.util.Scanner;

public class SwapOfElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = in.nextInt();

        int [] arr = new int[n];
        for(int i = 0;i < n ; i++){
            arr[i] = in.nextInt();
        }
        
        System.out.println("! Make sure to enter i an j index with in the 0 < arr[] < n ! ");
        System.out.print("Enter the i and j : ");
        int i = in.nextInt();
        int j = in.nextInt();
        int temp;

        {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
