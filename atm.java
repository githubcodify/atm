import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int balance = 10000;

        while (true) {
            System.out.println("1 - Inquire balance");
            System.out.println("2 - Withdraw money");
            System.out.println("3 - Deposit money");
            System.out.println("Please choose the transaction");
            int transaction = s.nextInt();
            switch (transaction) {
                case 1:
                    System.out.println("Your balance is " + balance + "₺");
                    break;
                case 2:
                    System.out.println("Enter amount");
                    int amount = s.nextInt();
                    balance -= amount;
                    System.out.println("The new balance is " + balance + "₺");
                    break;
                case 3:
                    System.out.println("Enter amount");
                    int amount2 = s.nextInt();
                    balance += amount2;
                    System.out.println("The new balance is " + balance + "₺");
                    break;
                default:
                    System.out.println("Invalid transaction entered");
                    break;
            }
            System.out.println("Do you want to make a new transaction? y/n");
            String again = s.next();
            if (again.equals("y")) {
                continue;
            }
            if (again.equals("n"))
                System.out.println("Exiting...");
            break;
        }
    }
}
