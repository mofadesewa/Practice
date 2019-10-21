package lecture.lab1;

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
