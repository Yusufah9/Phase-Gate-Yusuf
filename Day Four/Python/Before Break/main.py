

from transaction_log_app import *

def main_transaction_log_app():



    balance =  0
    
    
    print("Welcome to Transaction Log App")
    
    choices =  """
    
    
        1. Deposit 
        
        2. Withdraw
        
        3. Show Transactions
        
        0. Exit
    
    """
    
        choice =  input(f"{choices}\nEnter Your Choice:  ")

        match choice:

            case "1": 
                    deposit_amount  =  deposit(account_balance)
                    print(f"Deposited:  {deposit_amount}")
                    
            case "2":
                    withdraw  =  input("Enter withdrawal amount:  ")
                    
                    withdrawal_amount = float(amount)
                    
                    new_balance =  withdraw(amount, account_balance)
                    
                    if new_balance == account_balance:
                            print("Invalid Amount Inputted")
                            
                        else:
                            account_balance  =  new_balance
                            print("Withdraw was Successful")
                        
            case "3": 
                    
                transaction_so_far  =  int(input("Enter your choice:  "))   
               
                    if  ==  deposit(amount == withdraw(amount, account_balance)):
                        print("These are your transactions record")
                        
                        else:
                    deposit(amount, account_balance)  =  new_balance
                    print("No transactions yet")



    
    
    
    
    
    
    
    
