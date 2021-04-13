package sem.g1092.dp.adapter.Disney;

import sem.g1092.dp.adapter.SuperheroCharacter;

public class Disney2SuperheroAdapter extends SuperheroCharacter {
	
	DisneyActions disneyCharacter=null;

	public Disney2SuperheroAdapter(	DisneyActions disneyCharacter ) {
		super(disneyCharacter.getName(), disneyCharacter.getPower());
		this.disneyCharacter=disneyCharacter;
	}

	@Override
	public void move() {
		this.disneyCharacter.chnageLocation(0, 0);
		
	}

	@Override
	public void crouch() {
		System.out.println(String.format("%s is crouching", disneyCharacter.getName()));
		
	}

	@Override
	public void takeAHit(int points) {
		this.disneyCharacter.isWounded(points);
		
	}

	@Override
	public void heal(int points) {
		this.disneyCharacter.isHealing(points);
		
	}

	
}
