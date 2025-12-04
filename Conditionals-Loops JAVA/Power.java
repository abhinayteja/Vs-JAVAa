
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = in.nextInt();

        System.out.print("Enter the power  : ");
        int p = in.nextInt();


        pow(a, p);

        power(a, p);
    }

    static void pow(int n,int b){
        int r = 1;
        for (int i = 1; i <= b; i++) {
            r =  r * n;  // simple logic dude.....   Got mad
        }
        System.out.println("The power value is :"+ r);
    }
    // power using the while loop  
    // Same logic no deviation 
    static void power(int x,int y){
        
        int r = 1;
        int i = 1;
        while (i <= y) {
            r = r * x;
            i++;
        }
        System.out.println("The power value is :"+ r);
    }
    

}
