package sem.g1092.dp.decorator;

import sem.g1092.dp.adapter.FantasySuperhero;
import sem.g1092.dp.adapter.SuperheroCharacter;

public class TestDecorator {

	public static void main(String[] args) {
		SuperheroCharacter fantasyHero=new FantasySuperhero("Blue Dragon", 1000, true);
		fantasyHero.move();
		fantasyHero.takeAHit(500);
		
		//the dragon should look and behave like a wounded one
		SuperheroCharacter woundedHero=new WoundedDecorator(fantasyHero);

		woundedHero.move();
		fantasyHero.heal(200);
		//add a shield/armour to the dragon 
		SuperheroCharacter heroWithShield=new ShieldDecorator(fantasyHero, 200);

		SuperheroCharacter woundedHeroWithShield=new ShieldDecorator(woundedHero, 250);
		woundedHeroWithShield.move();
		woundedHeroWithShield.takeAHit(260);
		
	}

}
