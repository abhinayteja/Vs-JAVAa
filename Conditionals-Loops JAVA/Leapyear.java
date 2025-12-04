import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year to check : ");
        int year = in.nextInt();

        if (year % 4 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is a leap YEAR.");
        }else{
            System.out.println("It is not a leap year");
        }
    }
}
