package g1092.refactor.phase2;

public class SalesStrategy {
	public static final int FIDELITY_YEARS_THRESHOLD=10;
	public static final float MAX_FIDELITY_DISCOUNT=0.15f;
	public float ComputeFinalPrize(
			int productType, float initialPrice, int yearsSincerRegistration)
	  {
	    float rezultat = 0;
	    float fidelityDiscount = (yearsSincerRegistration > FIDELITY_YEARS_THRESHOLD) ? MAX_FIDELITY_DISCOUNT : (float)yearsSincerRegistration/100; 
	    if (productType == 1)
	    {
	      rezultat = initialPrice;
	    }
	    else if (productType == 2)
	    {
	      rezultat = (initialPrice - (0.1f * initialPrice)) - fidelityDiscount * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	      rezultat = (initialPrice - (0.25f * initialPrice)) - fidelityDiscount * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	      rezultat = (initialPrice - (0.35f * initialPrice)) - fidelityDiscount * (initialPrice - (0.35f * initialPrice));
	    }
	    return rezultat;
	  }
}