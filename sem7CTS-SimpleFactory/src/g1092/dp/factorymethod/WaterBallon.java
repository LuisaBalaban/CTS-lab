package g1092.dp.factorymethod;

import g1092.dp.simplefactory.AbstractWeapon;

public class WaterBallon extends AbstractWeapon {

	public WaterBallon(String desc)
	{
		this.description="A water ballon";
	}
	@Override
	public void pewPew() {

		System.out.println("Spalsh");
	}

}
