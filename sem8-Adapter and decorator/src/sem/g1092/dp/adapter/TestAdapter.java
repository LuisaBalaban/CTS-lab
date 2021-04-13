package sem.g1092.dp.adapter;

import java.util.ArrayList;

import sem.g1092.dp.adapter.Disney.Disney2SuperheroAdapter;
import sem.g1092.dp.adapter.Disney.DisneyActions;
import sem.g1092.dp.adapter.Disney.DonaldDuck;

public class TestAdapter {

	public static void main(String[] args) {

		//simulate the game by using the existing characters frameowkr
		SuperheroCharacter fantasyHero=new FantasySuperhero("Blue Dragon", 1000, true);
		fantasyHero.move();
		fantasyHero.takeAHit(500);
		fantasyHero.heal(200);
		
		//use a disney character as a superhero character one
		DisneyActions donald=new DonaldDuck(500);
		donald.chnageLocation(100,500);
		donald.isWounded(100);
		donald.isHealing(50);
		
		
		ArrayList<SuperheroCharacter> gameHeroes=new ArrayList<>();
		gameHeroes.add(fantasyHero);
		
		Disney2SuperheroAdapter donaldAdapter=new Disney2SuperheroAdapter(donald);
		gameHeroes.add(donaldAdapter);
		
		System.out.println("---------------------------------------");
		
		for(SuperheroCharacter hero : gameHeroes)
		{
			hero.crouch();
			hero.takeAHit(50);
			hero.heal(50);
		}
	}

}
