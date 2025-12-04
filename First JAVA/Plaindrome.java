
// import java.util.Scanner;

public class Plaindrome {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String check = in.nextLine();

        String check = "madam";
        System.out.println(check.charAt(1));

        for(int i = 0;i != check.length() ;i++){
            if(check.charAt(i)== check.charAt(check.length()-i)){
                System.out.println(check.charAt(i));
            }
            
        }

    }
}
