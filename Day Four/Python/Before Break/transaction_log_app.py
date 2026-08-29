    
    
def deposit(amount, account_balance, transactions):

    if amount > 0.0:
       account_balance +=  amount
    
    return account_balance


    	
def withdraw(amount, account_balance, transactions):

    if account_balance >= amount > 0:

        account_balance -= amount
    
    return account_balance


def show_transactions(transactions):
    if transactions == deposit and tranasctions == withdraw:
    elif transactions != deposit and tranasctions == withdraw:
        return transactions
      


