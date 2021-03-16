package g1092.refactor.phase5;

import g1092.refactor.exceptions.InvalidPriceException;
import g1092.refactor.exceptions.InvalidValueException;
import g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;

public interface SalesValidatorsInterface {
	
	public abstract void validatePrice(float initialPrice) throws InvalidPriceException;
	public abstract void validateYearsSinceRegistration(int acccountAge) throws InvalidYearsSinceRegistrationException;
}
