package lecture.lab1;

public class BankAccount {
	private String name;
	private double balance;
	private String checkingsOrSavings;
	private double overdrawLimit;
/* method to check if balance >= withdrawal limit*/
	public BankAccount(String name, double balance, String checkingsOrSavings, double overdrawLimit) {
		
		double nBalance = balance;
		double nOverDrawLimit = overdrawLimit;
		
		if (nBalance >= nOverDrawLimit) {
			this.name = name;
			this.balance = balance;
			this.checkingsOrSavings = checkingsOrSavings;
			this.overdrawLimit = overdrawLimit;
		}
		//*****
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String nName) {
		name = nName;
	}
	public double getBalance() {
		System.out.println(balance);

		return balance;
	}
	
	public void setBalance(double nBalance) {
		balance = nBalance;
	}
	
	public String getCheckingsOrSavings() {
		return checkingsOrSavings;
	}
	
	public void setCheckingsOrSavings(String nCheckingsOrSavings) {
		checkingsOrSavings = nCheckingsOrSavings;
	}

	public double getOverdrawLimit() {
		return overdrawLimit;
	}
	
	public void setOverdrawLimit (double nOverdrawLimit) {
		overdrawLimit = nOverdrawLimit;
	}
	
	public double withDraw(double amount) {
		
		double nAmount = amount;
		double y = 0;
		
		if ((balance-amount)>= overdrawLimit) {
			
			if (checkingsOrSavings.equals("savings")) {
		
			balance = balance-amount;
			balance = balance-3;
			
			}
		
			else if (checkingsOrSavings.equals("checkings")) {
				
					balance = balance-amount;
		}
				

		}
			
		else if ((balance-amount) < overdrawLimit) {
				
			System.out.println("Can't Withdraw");
			nAmount = 0;
			}	
		return nAmount;
	
	}
	
	public void deposit(double amount) {
		balance += amount;
		
}
	public boolean transfer(BankAccount to, double amount) {
		boolean x = false;
		if ((balance-amount)>= overdrawLimit) {
			balance = balance-amount;
			x = true;
			System.out.println(x);

			return true;
}
		else {
			System.out.println(x);

			return false;
			}
		}
}
public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount Alice = new BankAccount("Alice", 100, "savings", 50);
		BankAccount Bob = new BankAccount("Bob", 350, "checkings", 30);
		
		Bob.getBalance();
		System.out.println("");


		Bob.withDraw(200);

		
		Bob.getBalance();
		System.out.println("");
		

		Alice.getBalance();
		System.out.println("");
		
		Alice.deposit(50);
		System.out.println("");

		Alice.getBalance();
		System.out.println("");

		Bob.getBalance();
		System.out.println("");

		Bob.withDraw(1000);
		System.out.println("");

		Bob.transfer(Alice, 75);
		System.out.println("");

	}

}
