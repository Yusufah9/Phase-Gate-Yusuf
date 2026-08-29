import java.util.Scanner;

public class TransactionLogApp {

    public static int deposit(int amount, int accountBalance) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.println("Deposited: ₦" + amount + " | New Balance: ₦" + accountBalance);
        } else {
            System.out.println("Invalid input! Please enter a valid positive amount.");
        }
        return accountBalance;
    }

    public static int withdraw(int amount, int accountBalance) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
            System.out.println("Withdrew: ₦" + amount + " | New Balance: ₦" + accountBalance);
        } else if (amount > accountBalance) {
            System.out.println("Withdrawal failed: insufficient funds");
        } else {
            System.out.println("Invalid input! Please enter a valid positive amount.");
        }
        return accountBalance;
    }

    public static void showTransactions(int totalDeposits, int totalWithdrawals, int lastDeposit, int lastWithdrawal) {
        if (totalDeposits == 0 && totalWithdrawals == 0) {
            System.out.println("No transactions yet.");
        } else {
            System.out.println("Transactions so far:");
            if (totalDeposits > 0) {
                System.out.println("1. Last Deposit: ₦" + lastDeposit);
            }
            if (totalWithdrawals > 0) {
                System.out.println("2. Last Withdrawal: ₦" + lastWithdrawal);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accountBalance = 0;
        int progress = 1;
        
        int totalDeposits = 0;
        int totalWithdrawals = 0;
        int lastDeposit = 0;
        int lastWithdrawal = 0;

        System.out.println("Welcome to Transaction Log App");

        String options = """
                
                1. Check Balance
                2. Deposit
                3. Withdrawal
                4. Show Transactions
                0. Exit
                """;

        while (progress != 0) {
            System.out.print(options);
            System.out.print("Enter your choice: ");
            int userInput = scanner.nextInt();

            if (userInput == 1) {
                System.out.println("Your Account Balance: ₦" + accountBalance);
            } 
            else if (userInput == 2) {
                System.out.print("Enter your Amount to Deposit: ");
                int depositAmount = scanner.nextInt();
                accountBalance = deposit(depositAmount, accountBalance);
                if (depositAmount > 0) {
                    totalDeposits++;
                    lastDeposit = depositAmount;
                }
            } 
            else if (userInput == 3) {
                System.out.print("Enter your Amount to Withdraw: ");
                int withdrawAmount = scanner.nextInt();
                accountBalance = withdraw(withdrawAmount, accountBalance);
                if (withdrawAmount > 0 && accountBalance >= 0 && withdrawAmount <= accountBalance + withdrawAmount) {
                    totalWithdrawals++;
                    lastWithdrawal = withdrawAmount;
                }
            } 
            else if (userInput == 4) {
                showTransactions(totalDeposits, totalWithdrawals, lastDeposit, lastWithdrawal);
            } 
            else if (userInput == 0) {
                progress = 0;
                System.out.println("Final Balance: ₦" + accountBalance);
                System.out.println("Thank you for using Transaction Log App!");
            } 
            else {
                System.out.println("Invalid input! Please choose valid options from the options above.");
            }
        }
    }
}
