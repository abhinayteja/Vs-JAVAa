
import java.util.Scanner;

public class powerTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int a = in.nextInt();

        System.out.print("Enter the Power : ");
        int b = in.nextInt();

        powTable(a, b);

    }

    static  void powTable(int x,int y){
        int r = 1;
        for(int i = 1;i <= y;i++){
            r = r * x;
            System.out.println(x + " * " + "pow" + i  + " = " + r);
        }
    }
}
