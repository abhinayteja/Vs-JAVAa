import java.util.Scanner;

public class Afactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find the  factors : ");
        int x = in.nextInt();
        // function call which gives the all the factors of the given number
        allFactors(x, 1);

        

    }
    

    static int  allFactors(int n, int i){
        for (i = 1; i <= n; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
        return i;
    }
}

