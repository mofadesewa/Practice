package lecture.lab1;

import lecture.lab1.BankAccount;
import lecture.lab1.BankAccountTest;
import lecture.lab1.InterestCalculator;

public class InterestCalculator
{
	public static double applyInterest(BankAccount a, int years, double interestRate) {

		double balance = a.getBalance();
		System.out.println(balance);
		for (int i = 0; i < years -1 ; i++) {
		balance += balance*(1+(interestRate/100));
		}
		
		System.out.println(balance);

		return balance;
	}
	}
