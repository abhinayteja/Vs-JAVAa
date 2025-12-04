
import java.util.Scanner;

public class battingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the no Matches : ");
        int matches = in.nextInt();

        battingAvg(matches);

    }

    static float  battingAvg(int a){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        float avg;

        for (int i = 1; i <= a; i++) {
            System.out.print("Enter the Match " + i + " Score :");
            int b = in.nextInt();

            sum = sum + b;
        }
        avg = sum / a;
        System.out.print("Avarage  : "+avg);
        return avg;
    }
}
