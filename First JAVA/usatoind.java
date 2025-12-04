import java.util.Scanner;

public class usatoind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int us = in.nextInt();
        int converted = us * 87;

        System.out.println("$ converted to ₹ : "+converted);
    }
}
