package g1092.dp.factorymethod;

import g1092.dp.simplefactory.AbstractWeapon;
import g1092.dp.simplefactory.WeaponType;

public abstract class AbstractWeaponFactory {

	public abstract AbstractWeapon getWeapon(WeaponType type, String desc);
	
}
