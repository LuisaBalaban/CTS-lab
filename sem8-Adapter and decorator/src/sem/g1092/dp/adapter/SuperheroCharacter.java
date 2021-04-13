package sem.g1092.dp.adapter;
//existing framework
public abstract class SuperheroCharacter {

	public String name;
	public int power;
	
	public SuperheroCharacter(String name, int power) {
		super();
		this.name = name;
		this.power = power;
	}
	public abstract void move();
	public abstract void crouch();
	public abstract void takeAHit(int points);
	public abstract void heal(int points);
	
}
