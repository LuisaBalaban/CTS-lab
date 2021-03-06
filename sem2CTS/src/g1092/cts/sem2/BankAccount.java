package g1092.cts.sem2;

public abstract class BankAccount extends Account {

	protected double balance;
	protected final String iban;
	
	public BankAccount(double balance, String iban)
	{
		this.balance=balance;
		this.iban=iban;
	}
	
	@Override
	public double getBalance()
	{
		return this.balance;
	}
	
}
