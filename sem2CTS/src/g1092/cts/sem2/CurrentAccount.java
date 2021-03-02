package g1092.cts.sem2;

import g1092.cts.sem2.exceptions.IllegalTransferException;
import g1092.cts.sem2.exceptions.InsufficientFundsException;

public class CurrentAccount extends BankAccount {

	public static final double MAX_CREDIT=5000;
	
	public CurrentAccount(String IBAN)
	{
		super(CurrentAccount.MAX_CREDIT, IBAN);
	}
	@Override
	public void deposit(double amount) {
		this.balance+=amount;
		

	}

	@Override
	public void withdrawl(double amount) throws InsufficientFundsException{
		if(amount>this.balance)
			throw new InsufficientFundsException("You dont have the available amount");
		else
			this.balance-=amount;

	}

	@Override
	public void transfer(Account destination, double amount) throws InsufficientFundsException, IllegalTransferException {
		//deposit and transfer in same time
		if(this==destination)
		   throw new IllegalTransferException();
		this.withdrawl(amount);
		destination.deposit(amount);
		
		

	}

}
