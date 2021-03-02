package g1092.cts.sem2;

import g1092.cts.sem2.exceptions.IllegalTransferException;
import g1092.cts.sem2.exceptions.InsufficientFundsException;

public abstract class Account {
	public abstract void deposit(double amount);
	public abstract void withdrawl(double amount) throws InsufficientFundsException;
	public abstract void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException;
	public abstract double getBalance();

}
