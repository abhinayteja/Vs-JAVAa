import java.util.Scanner;

public class MAxELEMENTE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = in.nextInt();

        int [] arr = new int[n];
        for(int i = 0;i < n ; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Length : " + arr.length);
        System.out.println("Max el : " + finMax(arr));
    }

    static int finMax(int [] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
   
}
