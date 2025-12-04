import java.util.Scanner;

public class findMaxMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the num 1 :");
        int a = in.nextInt();

        System.out.print("Enter the num 2 :");
        int b = in.nextInt();

        System.out.print("Enter the num 3 :");
        int c = in.nextInt();

        fMax(a,b,c);
        fMin(a,b,c);
    }
    static  void fMax(int x,int y,int z){
        if(x > y && x > z ){
            System.out.println("num 1 : "+ x + " is greater");
        }else if(y > x && y > z ){
            System.out.println("num 2 : "+ y + " is greater");
        }else{
            System.out.println("num 3 : "+ z + " is greater");
        }
    }

    static void fMin(int x,int y,int z){
        if(x < y && x < z ){
            System.out.println("num 1 : "+ x + " is smaller");
        }else if(y < x && y < z ){
            System.out.println("num 2 : "+ y + " is smaller");
        }else{
            System.out.println("num 3 : "+ z + " is smaller");
        }
    }
}
