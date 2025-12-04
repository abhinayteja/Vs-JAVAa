
import java.util.Scanner;

class Player{
    int runs;
    int wickets;

    Player(int runs,int wickets) {
        this.runs = runs;
        this.wickets = wickets;
    }

    void Performance(){
        if(this.runs > 50){
            System.out.println("Good");
        }
        System.out.println("Wickets : " + this.wickets);
    }
}
public class circketPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the runs : ");
        int a = in.nextInt();

        System.out.print("Enter the wickets : ");
        int b = in.nextInt();

        Player p1 = new Player(a, b);
        p1.Performance();
    }
}
