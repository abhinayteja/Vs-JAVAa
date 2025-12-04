import java.util.*;


class HakerRankFormula{
   public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

    for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int e = 0;
    for (int j = 0; j < n; j++) {
            e += ((int)Math.pow(2, j) * b);
            System.out.print((a + e) + " ");
        }
        System.out.println();
    }   
    }
}
