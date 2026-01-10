import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        ArrayList<Integer> L = new ArrayList<>(n);
        for(int i = 0;i < n;i++){
           int x = in.nextInt();
           L.add(x);
        }

        int Q = in.nextInt();

        System.out.println("Insert");
        int e = in.nextInt();
        int inde = in.nextInt();
        L.set(inde, e);

        System.out.println("Delete");
        int id = in.nextInt();
        L.remove(id);

        System.out.println(L);
        
    }
}
