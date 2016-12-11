
public class CheckingAccount extends BankAccount {
	private int checkNumber = 1000;

	public CheckingAccount(String Santa, int elves) {
		super(Santa);
		if (Santa > 0)
			;
	}

	int checkNumber() {
		return checkNumber;

	}

	public String toString() {
		return ("Check Number" + checkNumber + super.toString());
	}

	public void writtenchecks() {
		checkNumber++;
	}
}
