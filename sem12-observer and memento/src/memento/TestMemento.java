package memento;

public class TestMemento {

	public static void main(String[] args)
	{
		SuperHero hero=new SuperHero("Superman", 500,"Fly");
		//creating a memento
		HeroRestorePoints initial=hero.saveData();
		hero.lifePoints+=500;
		System.out.println("lifepoints: "+hero.lifePoints);
		hero.restoreData(initial);
		System.out.println("lifepoints: "+hero.lifePoints);

	}
}
