
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of the units : ");
        int noUnits = in.nextInt();

        bill(noUnits);
    }

    static  void bill(int n){
        float unitCost = 10;
        System.out.println("The total bill is : " + (unitCost * n ));
    }
}
