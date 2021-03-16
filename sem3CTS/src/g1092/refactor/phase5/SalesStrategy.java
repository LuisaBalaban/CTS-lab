package g1092.refactor.phase5;

import g1092.refactor.exceptions.InvalidPriceException;
import g1092.refactor.exceptions.InvalidValueException;
import g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import g1092.refactor.phase2.ProductType;
import g1092.refactor.phase5.marketing.MarketingStrategyInterface;

public class SalesStrategy {

	MarketingStrategyInterface mkStrategy=null ;
	SalesValidatorsInterface validator=null;
	
	public SalesStrategy(MarketingStrategyInterface mkStrategy, SalesValidatorsInterface validator)
	{
		if(mkStrategy==null | validator==null)
		{ throw new NullPointerException();
		
		}
		this.mkStrategy=mkStrategy;
		this.validator=validator;
		
	}
	//optional - depend on design specs
	//allowing the change at runtime of the marketing stratgey
	public void setMarketingStratgey(MarketingStrategyInterface mkStrategy)
	{
		if(mkStrategy==null)
		{
			throw new NullPointerException();
		}
		this.mkStrategy=mkStrategy;
	}
	
	public static float getPriceWithDiscount(
		float initialPrice, float discount, float fidelityDiscount)
	{
		float initialDiscount=initialPrice - (discount * initialPrice);
	    return initialDiscount * (1-initialDiscount);
	
	}
	public float ComputeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException, InvalidYearsSinceRegistrationException, InvalidPriceException
	  {
		validator.validatePrice(initialPrice);
		validator.validateYearsSinceRegistration(yearsSinceRegistration);
	    float finalPrice = 0;
	    float fidelityDiscount = (productType !=ProductType.NEW) ? mkStrategy.getFidelityDiscount(yearsSinceRegistration):0;
	    finalPrice = getPriceWithDiscount(initialPrice,productType.getDisocunt(),fidelityDiscount); 
	    return finalPrice;
	  }
}