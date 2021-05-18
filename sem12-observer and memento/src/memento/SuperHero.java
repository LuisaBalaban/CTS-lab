package memento;

public class SuperHero {

	String name;
	int lifePoints;
	String magic;
	public void attack()
	{
		System.out.println("Is attacking");
	}
	public void heal()
	{
		System.out.println("Is healing");
	}
	public void move()
	{
		System.out.println("is moving");
	}
	public SuperHero(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
	}
	
	public HeroRestorePoints saveData()
	{
		return new HeroRestorePoints(this.name, this.lifePoints, this.magic);
	}
	public void restoreData(HeroRestorePoints memento)
	{//now game can create restore points and load them back later
		this.name=memento.name;
		this.lifePoints=memento.lifePoints;
		this.magic=memento.getMagic();
	}
}
