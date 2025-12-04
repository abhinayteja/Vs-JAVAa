import java.util.Scanner;

class BankAccount {
    String name;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("You have successfully deposited: " + amount + " Mr. " + this.name);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("You have successfully withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Funds Dude!!!!");
        }
    }

    void showBalance() {
        System.out.println("Account Holder : " + this.name);
        System.out.println("Your Balance   : " + this.balance);
    }
}

public class BankAcc {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        BankAccount ram = new BankAccount(); // object created using default constructor

        System.out.print("Enter the amount for Deposit : ");
        double damount = in.nextDouble();

        System.out.print("Enter the amount for Withdraw : ");
        double wamount = in.nextDouble();

        ram.name = "Sri Vastav";
        ram.deposit(damount);
        ram.withdraw(wamount);
        ram.showBalance();
    }
}
