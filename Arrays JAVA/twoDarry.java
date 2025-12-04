import java.util.Scanner;

public class twoDarry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the value of the n(rows) : ");
        int n = in.nextInt();

        System.out.print("Enter the value of the m(cols) : ");
        int m = in.nextInt();

        int [][] array  = new  int[n][m]; 

        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
              array[i][j] =  in.nextInt();
            }
        }

       System.out.println("");
       for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
              System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
       
    }
}
