import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter the num2 : ");
        int num2 = in.nextInt();

        swep(num1, num2);
        
    }
    

    static void swep(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped num 1 : "+ a + "\n" + "The swapped num 2 : "+b);
    }

}
