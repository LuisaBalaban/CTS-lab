package g1092.refactor.phase5.services;

import g1092.refactor.exceptions.InvalidPriceException;
import g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import g1092.refactor.phase5.SalesValidatorsInterface;

public class ValidatorService implements SalesValidatorsInterface{

	@Override
	public void validatePrice(float initialPrice) throws InvalidPriceException {
		if(initialPrice<=0)
		{
			throw new InvalidPriceException();
		}
		
	}

	@Override
	public void validateYearsSinceRegistration(int acccountAge) throws InvalidYearsSinceRegistrationException {
		if(acccountAge<0) {
			throw new InvalidYearsSinceRegistrationException();
			
		}
		
	}

}
