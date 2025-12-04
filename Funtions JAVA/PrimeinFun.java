import java.util.Scanner;

public class PrimeinFun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print(("Enter the number to check : "));
        int a = in.nextInt();

        boolean ans = isam(a);

        System.out.println(ans);

    }

    static  boolean  isam(int n){
        if(n <= 1){
            return false;
        }
        int c = 2; // start checking form the 2 
        // loop which checks the factors
        while (c * c <= n) {
            if(n % c == 0){ // checks each 
                return false;
            }
            c++; // increament
        }
        return  c * c > n; // Until root of the n mean -- 23 --> (root 23) mean the factors lies between them only 
    }                      // Mean ---> It will take less time
}
