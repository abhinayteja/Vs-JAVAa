import java.util.*;

public class HakerRankSTRINGS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        System.out.println(A.length() + B.length());

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(toPascalCase(A) + " " + toPascalCase(B));
    }

    public static String toPascalCase(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        } // Lower one will return the pascal case letter
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
