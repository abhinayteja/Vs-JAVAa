import java.util.Arrays;
import java.util.Scanner;

public class lenierSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the n value : ");
        int n = in.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the element to find : ");
        int x = in.nextInt();

        System.out.println(find(arr,x));

    }
    static  int find(int [] arr,int x){
       if (arr.length == 0) {
        return  -1;
       } 
       for(int i = 0;i < arr.length;i++){
            if(x == arr[i]){
                return i;
            }
       }
       return -1;

    }
}
