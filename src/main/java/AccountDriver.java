/*import java.util.Scanner;

import com.revature.Account;

public class AccountDriver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Account accounts[] = new Account[10];
		int numAccounts = 0;
		
		int choice;
		
		do {
			choice = menu(sc);
			System.out.println();
			
			if (choice == 1) {
				accounts[numAccounts++] = createAccount(sc);
			} else if (choice == 2) {
				doDeposit(accounts, numAccounts, sc);
			} else if (choice == 3) {
				doWithdraw(accounts, numAccounts, sc);
			} else if (choice == 4) {
				applyInterest(accounts, numAccounts, sc);
			} else {
				System.out.println("GoodBye");
			}
			System.out.println();
		} while(choice != 5);
	}
	


	public static int accountMenu(Scanner sc) {
		System.out.println("Select Account Type: ");
		System.out.println("1. Checking");
		System.out.println("2. Savings Account");
		
		int choice;
		
		do {
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
		} while (choice < 1 || choice > 2);
		
		return choice;
	}
	
	public static int searchAccount(Account accounts [], int count, int accoutNumber) {
		
		for(int i=0; i< count; i++) {
			if(accounts[i].getAccountNumber() == accountNumber) {
				return i;
			}
		}
		return -1;
	}
	
	public static void doDeposit(Account accounts [], int count, Scanner sc) {
		
		System.out.println("\n Please enter account number: ");
		int accountNumber = sc.nextInt();
		
	
		//search for account
		int index = searchAccount(accounts, count, accountNumber);
		
		if(index >=0) {
		//Amount
		System.out.println("Please enter Deposit Amount: ");
		double amount = sc.nextDouble();	
		
		accounts[index].deposit(amount);
		} else {
			System.out.println("No account exists with AccoutNumber: " + accountNumber);
		}
	 
	public static doWithdraw(Account accounts [], int count, Scanner sc) {
		// Get the account number
		System.out.println("\n Please enter account number: ");
		int accountNumber = sc.nextInt();
		
		//search for account
		
		int index = searchAccount(accounts, count, accountNumber);
		
		if(index >= 0) {
			
			System.out.println("Please ener Withdrawal Amount: ");
			double amount = sc.nextDouble();
			accounts[index].withdraw(amount);
		}
			
		} else {
			System.out.println("No account exists with AccountNumber: " + accountNumber);
		}
	}
	
	public static void applyInterest(Account accounts [], int count, Scanner sc) {
		System.out.println("\n Please enter account number: ");
		int accountNumber = sc.nextInt();
		
		//search for account
		
		int index = searchAccount(accounts, count, accountNumber);
		
		if(index >= 0) {
			
			if(accounts[index] instanceof SavingsAccount) {
			((SavingsAccount)accounts[index]).applyInterest();
		}
			
		} else {
			System.out.println("No account exists with AccountNumber: " + accountNumber);
		}
	}
	
	
	
	
	public static Account createAccount(Scanner sc) {
		
		Account account = null;
		int choice = accountMenu(sc);
		
		int accountNumber;
		System.out.println("Enter Account Number: ");
		accountNumber = sc.nextInt();
		
		if(choice == 1) {
			System.out.println("Enter Transaction amount: ");
			account = new CheckingAccount(accountNumber, fee);
		} else {
			
			System.out.println("Please Enter Interest Rate: ");
			double ir = sc.nextDouble();
			account = new SavingsAccount(accountNumber, ir);
			
		}
		
		return account;
		
	}
	
	public static int menu(Scanner sc) {
		System.out.println("Bank Accout Menu");
		System.out.println("1. Create New Account");
		System.out.println("2. Deposit Funds");
		System.out.println("3. Withdraw Funds");
		System.out.println("4. Transfer Funds");
		System.out.println("5. Exit");
		
		int choice;
		
		do {
			System.out.println("Enter option");
			choice = sc.nextInt();
			
		} while(choice < 1 || choice > 5);
		 
		return choice;
	}
}

*/
