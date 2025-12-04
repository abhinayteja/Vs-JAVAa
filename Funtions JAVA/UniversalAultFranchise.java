import java.util.Scanner;

public class UniversalAultFranchise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = in.nextInt();

        checkBox(age);
    }
    static void checkBox(int a){
        if(a < 18 && a > 0){
            System.out.println("You are not eligible to Vote DUDE!!!");
        }else if(a >= 18 &&  a != 0){
            System.out.println("You are eligible to vote DUDE ");
        }else if(a <= 0){
            System.out.println("Enter the valid number DUDE!!!");
        }
    }
}
