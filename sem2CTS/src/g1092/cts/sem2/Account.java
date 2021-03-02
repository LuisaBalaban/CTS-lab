package g1092.cts.sem2;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdrawl(double amount);
	public abstract void transfer(Account destination, double amount);
	public abstract double getBalance();

}
