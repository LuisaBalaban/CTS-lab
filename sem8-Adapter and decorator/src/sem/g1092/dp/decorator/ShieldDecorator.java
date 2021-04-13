package sem.g1092.dp.decorator;

import sem.g1092.dp.adapter.SuperheroCharacter;

public class ShieldDecorator extends AbstractDecorator{

	int shieldPower;
	
	public ShieldDecorator(SuperheroCharacter decoratedObject, int shieldType) {
		super(decoratedObject);
		this.shieldPower=shieldType;
		
		
	}

	@Override
	public void takeAHit(int points) {
		int realPoints = points-shieldPower;
		if(realPoints<0)
			{realPoints=0;}
		else
		{
		this.decoratedObject.takeAHit(realPoints);}
	}
	

}
