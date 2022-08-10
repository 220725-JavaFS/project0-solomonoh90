/*import com.revature.Account;

public class SavingsAccount extends Account {

	private double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(int accountNumber, double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calcInterest() {
		return balance * interestRate;
	}
	
	public void applyInterest() {
		double interest = calcInterest();
		System.out.println("Interest amount added to balance");
		deposit(interest);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
			balance += amount;
			System.out.println("Current Balance is: " + balance);
			
			
		}else {
			System.out.println("Invalid deposit amount");
		}
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount > 0) {
			balance -= amount;
			System.out.println("Current Balance is:" + balance);
		}else {
			System.out.println("Invalid withdrawal amount");
		}
	}
	}
	
}
*/
