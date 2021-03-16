package g1092.refactor.test;

import g1092.refactor.exceptions.InvalidPriceException;
import g1092.refactor.exceptions.InvalidValueException;
import g1092.refactor.exceptions.InvalidYearsSinceRegistrationException;
import g1092.refactor.phase2.ProductType;
import g1092.refactor.phase5.SalesStrategy;
import g1092.refactor.phase5.marketing.MarketingStrategyInterface;
import g1092.refactor.phase5.services.Marketing2021Service;
import g1092.refactor.phase5.services.ValidatorService;

public class TestSalesStrategy {
	
	public static void main(String[] args)
	{
		Marketing2021Service mkService=new Marketing2021Service();
		ValidatorService validator=new ValidatorService();
		SalesStrategy sales=new SalesStrategy(mkService, validator);
		
		try {
			float finalPrice=sales.ComputeFinalPrice(ProductType.DISCOUNTED, 100, 5);
		System.out.println("The final price is: " + finalPrice);
		sales.setMarketingStratgey(new MarketingStrategyInterface() {
			public float getFidelityDiscount(int yearsSinceRegistration)
			{
				return 0.5f;
			}
		});
		finalPrice=sales.ComputeFinalPrice(ProductType.DISCOUNTED, 100, 5);
		System.out.println("The final price is: " + finalPrice);
		
		} catch (InvalidValueException | InvalidYearsSinceRegistrationException | InvalidPriceException e) {
			e.printStackTrace();
		}
	}

}
