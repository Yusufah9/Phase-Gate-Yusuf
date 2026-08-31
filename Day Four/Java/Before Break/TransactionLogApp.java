import java.util.Arrays;
import java.util.Scanner;

public class TransactionLogApp1 {

    public static double deposit(double amount, double accountBalance) {
        if (amount > 0) {
            accountBalance += amount;
        }
        return accountBalance;
    }

    public static double withdraw(double amount, double accountBalance) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
        }
        return accountBalance;
    }

    public static void showTransactions(double[] deposits, double[] withdrawals, int depositCount, int withdrawalCount) {
        if (depositCount == 0 && withdrawalCount == 0) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transactions so far:");
            if (depositCount > 0) {
                System.out.println("Deposits:");
                int count = 0;
                while (count < depositCount) {
                    System.out.println((count + 1) + ". ₦" + deposits[count]);
                    count++;
                }
            }
            if (withdrawalCount > 0) {
                System.out.println("Withdrawals:");
                int count = 0;
                while (count < withdrawalCount) {
                    System.out.println((count + 1) + ". ₦" + withdrawals[count]);
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 0;
        
        double[] deposits = new double[100];
        double[] withdrawals = new double[100];
        int depositCount = 0;
        int withdrawalCount = 0;
        int userInput = -1;
        
        while(userInput != 0){ 
        System.out.println("Welcome to Transaction Log App");

        String options = """
                
                1. Check Balance
                2. Deposit
                3. Withdrawal
                4. Show Transactions
                0. Exit
                """;

         
            System.out.print(options);
            System.out.print("Enter your choice: ");
            userInput = scanner.nextInt();
            

            if (userInput == 1) {
                System.out.println("Your Account Balance: ₦" + accountBalance);
            } 
            else if (userInput == 2) {
                System.out.print("Enter your Amount to Deposit: ");
                double depositAmount = scanner.nextDouble();
                if (depositAmount > 0) {
                    accountBalance = deposit(depositAmount, accountBalance);
                    deposits[depositCount] = depositAmount;
                    depositCount++;
                    System.out.println("Deposited: ₦" + depositAmount + " | New Balance: ₦" + accountBalance);
                } else {
                    System.out.println("Invalid input! Please enter a valid positive amount.");
                }
            } 
            else if (userInput == 3) {
                System.out.print("Enter your Amount to Withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                if (withdrawAmount > 0 && accountBalance >= withdrawAmount) {
                    accountBalance = withdraw(withdrawAmount, accountBalance);
                    withdrawals[withdrawalCount] = withdrawAmount;
                    withdrawalCount++;
                    System.out.println("Withdrew: ₦" + withdrawAmount + " | New Balance: ₦" + accountBalance);
                } else if (withdrawAmount > accountBalance) {
                    System.out.println("Withdrawal failed: insufficient funds");
                } else {
                    System.out.println("Invalid input! Please enter a valid positive amount.");
                }
            } 
            else if (userInput == 4) {
                showTransactions(deposits, withdrawals, depositCount, withdrawalCount);
            } 
            else if (userInput == 0) {
                System.out.println("Thank you for using Transaction Log App!");
                break;
            } 
            else {
                System.out.println("Invalid input! Please choose valid options from the options above.");
            }
        }
       
    }
}
