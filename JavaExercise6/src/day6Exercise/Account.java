package day6Exercise;

/*Question1
Create a class called Account  that includes four pieces of information as instance variables
First Name (String)
Last Name (String)
Account Number (long) 
Balance  (double)*/

public class Account {

	private String firstName;
	private String lastName;
	private long accountNumber;
	private double balance;
	
	public static long accountIncrement = 10000;
	
	/*Your class should have a constructor that initializes the four instance variables. 
	Provide a set and a get method for each instance variable.*/

	
	public Account(String firstName, String lastName, double balance) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		//this.accountNumber = accountNumber;
		this.balance = balance;
		accountIncrement = accountIncrement + 1;
		this.accountNumber = accountIncrement;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//add methods called debit and credit

	double wdAmount;
	public void  debit(double wdAmount) {
		if (balance >  wdAmount) {
			balance = balance - wdAmount;
			System.out.println("Your have withdrawn " + "$" + wdAmount + "," + " your available balance now is: " + "$" + balance + "," + " please collect your money and card!" );
		}
		else  {
			System.out.println("Insufficient Balance!");
		}
	}
	public void  credit(double addMoney)  {
		balance = balance + addMoney;
		System.out.println("You added " + "$" + addMoney + " and your available balance is: " + balance);
	}

	public String toString() {
		return "Account [firstName=" + firstName + ", lastName=" + lastName + ", accountNumber=" + accountNumber
				+ ", balance=" + balance + "]";
	}
	

}
