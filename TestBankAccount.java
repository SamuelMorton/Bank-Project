
public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba = new BankAccount("Rich Bank Guy");
		SavingsAccount sa = new SavingsAccount("5%");
		CheckingAccount ca = new CheckingAccount("10000");
		
		System.out.println(ba.toString());
		System.out.println(ca.toString());
		System.out.println(sa.toString());
	}

}
