package p3;

public class MyBankApp {
	public static void main(String[] args) {
		Accounts Acc = new Accounts(0, "Raksha", 0,null);

		Policy sbi = new Policy(28, "life insurance", 900000,6889,6546);

		Acc.addPolicy(sbi);

		Acc.acc_Details();

	    sbi.showDetails();

		Acc.getPolicyById(1);

	}

}
