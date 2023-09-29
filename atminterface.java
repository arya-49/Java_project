import java.util.Scanner;

public class atminterface {
    public static void main(String[] args) {
        int balance = 500000, withdraw, deposit;
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("Welcome to My Simplified Automated Teller Machine ");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Exit ");
            System.out.print("Choose an operation: ");

            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter the amount to deposit: ");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been sucessfully deposited. ");
                    System.out.println("");
                    break;

                case 2:
                    System.out.println("Enter the amount to withdraw: ");
                    withdraw = s.nextInt();
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("Money withdrawn successfully. Please collect your money. ");
                    } else {
                        System.out.println("Insufficient balance. ");
                    }
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Your balance is " + balance + " only. ");
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");

            }
        }
    }
}