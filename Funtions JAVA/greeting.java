
import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the name to greet : ");  // Take Name ans the input broo!!!
        String namee = in.nextLine();


        System.out.println(greet());
        System.out.println( myGreet(namee));

    }

    static String greet(){
        String nam = "Hello bro hope you doing good! ";
        return nam;
    }

    static String myGreet(String sos){
        String Message  = "Hello " + sos;
        return Message;
    }
}
