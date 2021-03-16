package g1092.refactor.phase5.marketing;

import g1092.refactor.exceptions.InvalidValueException;

public interface SalesValidatorsInterafce {
	
	public abstract void validatePrice(float initialPrice) throws InvalidPriceException;
	public abstract void validateYearsSinceRegistration(int acccountAge) throws InvalidYearsSinceRegistrationException;
}
