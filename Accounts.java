package p3;

public class Accounts {
	private int accNumber;
	private String accHolderName;
	private int balance;
	
	private Policy policies[];//collections
	
	public Accounts(int accNumber, String accHolderName , int balance, Policy[] policies) 
	{
	super();	
	this.accNumber = accNumber;
	this.accHolderName = accHolderName;
	this.balance = balance;
	this.policies= policies;
	}
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Policy[] getPolicies() {
		return policies;
	}

	public void setPolicies(Policy[] policies) {
		this.policies = policies;
	}
	public void showDetails() {
		System.out.println("Account Details");
		System.out.println("Account Number  " + this.getAccNumber());
		System.out.println("Account Holder Name  " + this.getAccHolderName());
		System.out.println("Account Balance" + this.getBalance());
	}
	public void addPolicy(Policy sbi) {
		
	}
	public void acc_Details() {

	}
	public void getPolicyById(int i) {
	}
}
