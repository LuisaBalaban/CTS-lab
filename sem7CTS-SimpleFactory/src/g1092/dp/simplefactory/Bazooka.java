package g1092.dp.simplefactory;

public class Bazooka extends AbstractWeapon {

	public Bazooka(String desc)
	{
		this.description=description;
		this.powerLevel=1000;
	}
	@Override
	public void pewPew() {
		System.out.println("Boom  ***");
		
	}

}
