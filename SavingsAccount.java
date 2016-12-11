
public class SavingsAccount extends BankAccount {
	private double interestRate = .01;

	public SavingsAccount(String name, double Santa) {
		super(name);
		if (Santa > 0.0 && Santa < .1)
			;
		interestRate = name;

	}

	public double getRate() {
		return interestRate;
	}

	public String toStringt() {
		return ("Interest Rate" + "%1.3f" + interestRate + super.toString());
	}

	public void addInterest() {
		balance += (interestRate * balance);
	}
}
