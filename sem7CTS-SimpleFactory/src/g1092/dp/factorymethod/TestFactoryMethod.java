package g1092.dp.factorymethod;

import g1092.dp.simplefactory.AbstractWeapon;
import g1092.dp.simplefactory.SuperHero;
import g1092.dp.simplefactory.WeaponType;

public class TestFactoryMethod {

	public static void main(String[] args) {
		SuperHero superman=new SuperHero("Superman");
		boolean kidsMode=true;
		AbstractWeaponFactory abstractFactory=null;
		if(kidsMode)
		{
			abstractFactory=new WaterWeaponsFactory();
		}
		else
			abstractFactory=new RealWeaponsFactory();
		
		AbstractWeapon bazooka=abstractFactory.getWeapon(WeaponType.BAZOOKA, "BOOM");
		superman.setWeapon(bazooka);
		superman.setWeapon(abstractFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
		
	}

}
