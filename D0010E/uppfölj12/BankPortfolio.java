package uppfölj12;

import java.util.ArrayList;

public class BankPortfolio {
	ArrayList<Account> accounts;

	public BankPortfolio() {
		accounts = new ArrayList<Account>();
	}

	public void add(Account a) {
		accounts.add(a);
	}

	public void delete(int anum) throws NoSuchAccountException {
		for (Account a : accounts) {
			if (a.accountNumber() == anum) {
				accounts.remove(a);
				return;
			}
		}
		throw new NoSuchAccountException();
	}

	public void depositInto(int anum, double amount) throws NoSuchAccountException, NegativeAmountException {
		for (Account a : accounts) {
			if (a.accountNumber() == anum) {
				a.deposit(amount);
				return;
			}
		}
		throw new NoSuchAccountException();
	}

	public void withdrawFrom(int anum, double amount)
			throws NegativeAmountException, NoSuchAccountException, WouldExceedCreditLimitException {
		for (Account a : accounts) {
			if (a.accountNumber() == anum) {
				a.withdraw(amount);
				return;
			}
		}
		throw new NoSuchAccountException();
	}

	public double totalCreditGiven() {
		double result = 0;
		for (Account a : accounts) {
			result += a.creditLimit();
		}
		return result;
	}
	
	public double creditUsed() {
		double result=0,n;
		for (Account a : accounts) {
			result += (n=a.balance())<0?n:0;
		}
		return result;
	}
	
	public double positiveBalance() {
		double result=0,n;
		for (Account a : accounts) {
			result += (n=a.balance())>0?n:0;
		}
		return result;
	}
	
	public void payInterest() throws NegativeAmountException {
		for(Account a : accounts) {
			a.deposit(a.getInterest()*a.balance());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Account {
	int accountNumber() {
		return 5;
	}

	void deposit(double amount) throws NegativeAmountException {

	}

	void withdraw(double amount) throws NegativeAmountException, WouldExceedCreditLimitException {

	}

	double creditLimit() {
		return 5.0d;
	}
	
	double balance() {
		return 4.3d;
	}
	
	double getInterest() {
		return 5.0d;
	}
}

class NoSuchAccountException extends Exception {
	NoSuchAccountException() {

	}
}

class NegativeAmountException extends Exception {
	NegativeAmountException() {

	}
}

class WouldExceedCreditLimitException extends Exception {
	WouldExceedCreditLimitException() {

	}
}