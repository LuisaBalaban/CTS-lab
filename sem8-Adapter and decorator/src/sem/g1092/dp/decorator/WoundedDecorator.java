package sem.g1092.dp.decorator;

import sem.g1092.dp.adapter.SuperheroCharacter;

public class WoundedDecorator extends AbstractDecorator{

	public WoundedDecorator(SuperheroCharacter decoratedObject) {
		super(decoratedObject);
		
	}

	@Override
	public void move() {
		System.out.println("The hero is barely moving because is wounded");
		//super.move();
	}
	

}
