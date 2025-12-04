
import java.util.Scanner;

public class factorialofNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find the factorial : ");
        int fac = in.nextInt();

        int ans = fact(fac);

        System.out.println(ans);

    }

    static int fact(int f){
        int result = 1;
        if(f == 0){
            System.out.println(1);
        }else{
            for (int i = 1; i <= f; i++) {
                result =  result * i;
            }
        }
        return result;
    }
}
