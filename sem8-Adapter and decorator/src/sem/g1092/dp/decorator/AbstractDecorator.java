package sem.g1092.dp.decorator;

import sem.g1092.dp.adapter.SuperheroCharacter;

public abstract class AbstractDecorator extends SuperheroCharacter {
	

	SuperheroCharacter decoratedObject;
	public AbstractDecorator(SuperheroCharacter decoratedObject) {
		super(decoratedObject.name, decoratedObject.power);
		this.decoratedObject=decoratedObject;
	}
	
	//its better to override all methods here
	@Override
	public void move() {
		//we do a callback to the decorated objects' equivalent method
		this.decoratedObject.move();
		
	}
	@Override
	public void crouch() {
		this.decoratedObject.crouch();		
	}
	@Override
	public void takeAHit(int points) {
		this.decoratedObject.takeAHit(points);		
	}
	@Override
	public void heal(int points) {
		this.decoratedObject.heal(points);
		
	}
	
	
	

}
