
import java.util.Scanner;

public class Arthemetic {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        Scanner op   = new  Scanner(System.in);

       

        System.out.print("Enter the value of the (a) : ");
        int a =  num1.nextInt();
        System.out.print("Enetr the value of the (b) : ");
        int b = num2.nextInt();

        System.out.print("Enter the arthemetic operator (+ ,- ,* ,/ ,% ) : ");
        String p = op.nextLine();

        switch (p) {
            case "+" -> System.out.println("a + b = "+  (a+b));
            case "-" -> System.out.println("a - b = "+  (a-b));
            case "*" -> System.out.println("a * b = "+  (a*b));
            case "%" -> System.out.println("a % b = "+  (a%b));
            case "/" -> System.out.println("a / b = "+  (a/b));
            default -> System.out.println("Enter the valid one broo !!!");
        }


        
        }
    }

