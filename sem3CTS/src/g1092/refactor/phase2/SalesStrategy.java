package g1092.refactor.phase2;

import g1092.refactor.exceptions.InvalidValueException;

public class SalesStrategy {
	public static final int FIDELITY_YEARS_THRESHOLD=10;
	public static final float MAX_FIDELITY_DISCOUNT=0.15f;
	public float ComputeFinalPrize(
			ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	  {
		if(initialPrice<=0 || yearsSinceRegistration<0)
		{
			throw new InvalidValueException();
		}
		
	    float finalPrice = 0;
	    float fidelityDiscount = (yearsSinceRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSinceRegistration/100; 
	    switch(productType) {
	    case NEW:
	    	finalPrice = initialPrice;
	    	break;
	    case DISCOUNTED:
		      finalPrice = (initialPrice - (ProductType.DISCOUNTED.getDisocunt() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.DISCOUNTED.getDisocunt() * initialPrice));
		      break;
	    case LIMITED_STOCK:
		      finalPrice = (initialPrice - (ProductType.LIMITED_STOCK.getDisocunt() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LIMITED_STOCK.getDisocunt() * initialPrice));
		      break;
	    case LEGACY:
		      finalPrice = (initialPrice - (ProductType.LEGACY.getDisocunt() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LEGACY.getDisocunt() * initialPrice));
		      break;
		default:
			throw new UnsupportedOperationException("Type not managed");    
	    }
	    return finalPrice;
	  }
}