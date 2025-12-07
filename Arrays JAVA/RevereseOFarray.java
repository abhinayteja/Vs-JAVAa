import java.util.Scanner;

public class RevereseOFarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = in.nextInt();

        int [] arr = new int[n];
        for(int i = 0;i < n ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Length : " + arr.length);

        for (int i = arr.length - 1; i > 0 ; i--) {
            System.out.print(arr[i] + " ");
        }
    }

   
}