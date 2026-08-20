import java.util.Scanner;

public class TransactionMain {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     double balance = 0.0;
        
     System.out.println("Welcome to Transaction Log App");
        
     String options = """
        1. Show transactions
        2. Deposit
        3. Withdrawal
        0. exit
 """;
                
   int progress = 1;
        
     while (progress != 0) {
            System.out.print(options);
            System.out.print("Enter your choice: ");
            String userInput = scanner.nextLine();
            
     switch (userInput) {
     case "1":
     System.out.println("Your Account Balance: " + deposit(account_balance);
     break;
                    
     case "2":
      System.out.print("Enter your Amount to Deposit: ");
      String depositInput = scanner.nextInt();
           account_balance += depositAmount;
      System.out.println("Deposit was Successful");
                        }
                    break;
                    
                case "3":
                    System.out.print("Enter your Amount to Withdraw: ");
                    String withdrawInput = scanner.nextInt();
                            amount -= account_balance;
                    System.out.println("Withdrawal was Successful");
                    break;
            }
            
        }
        
    }
}

  
