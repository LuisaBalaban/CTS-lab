package g1092.refactor.phase4;

import g1092.refactor.exceptions.InvalidValueException;
import g1092.refactor.phase2.ProductType;

public class SalesStrategy {
	public static final int FIDELITY_YEARS_THRESHOLD=10;
	public static final float MAX_FIDELITY_DISCOUNT=0.15f;
	
	public static float getFidelityDiscount(int yearsSinceRegistration) {
		return (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 

	}
	public static float getPriceWithDiscount(
		float initialPrice, float discount, float fidelityDiscount)
	{
		float initialDiscount=initialPrice - (discount * initialPrice);
	    return initialDiscount * (1-initialDiscount);
	
	}
	public float ComputeFinalPrice(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	  {
		if(initialPrice<=0 || yearsSinceRegistration<0)
		{
			throw new InvalidValueException();
		}
		
	    float finalPrice = 0;
	    float fidelityDiscount = (productType !=ProductType.NEW) ? getFidelityDiscount(yearsSinceRegistration):0;
	    finalPrice = getPriceWithDiscount(initialPrice,productType.getDisocunt(),fidelityDiscount); 
	    return finalPrice;
	  }
}