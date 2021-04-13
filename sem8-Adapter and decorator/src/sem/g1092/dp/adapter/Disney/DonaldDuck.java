package sem.g1092.dp.adapter.Disney;

public class DonaldDuck implements DisneyActions {

	String name;
	int lifePoints;
	
	
	
	public DonaldDuck(int lifePoints) {
		super();
		this.name="Donald Duck";
		this.lifePoints = lifePoints;
	}

	@Override
	public void chnageLocation(int x, int y) {
		System.out.println("Is moving to a new location");
		
	}

	@Override
	public void isWounded(int lostLifePoints) {
		System.out.println(String.format("%s lost %d points", name, lostLifePoints));
		
	}

	@Override
	public void isHealing(int recoveredPoints) {
		System.out.println(String.format("%s recovered %d points", name,recoveredPoints));
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getPower() {
		return lifePoints;
	}

}
