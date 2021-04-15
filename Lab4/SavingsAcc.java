package e1;

public class SavingsAcc extends Account{
	
	private double minimumBalance=500;

	
	public SavingsAcc() {
		super();
		
	}

	
	public SavingsAcc(long accNum, double balance) {
		super(accNum, balance);
	
	}

	@Override
	public void withdraw(double withdrawCash) {
		super.withdraw(withdrawCash);
		
		if((super.getBalance() - withdrawCash) <= minimumBalance) {
	        super.withdraw(withdrawCash);
	}else {
		System.out.println("Cannot Withdraw minimum Balance is 500/-");
	}
		
	}


	public double getMinimumBalance() {
		return minimumBalance;
	}


	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

}
