package g1092.dp.factorymethod;

import g1092.dp.simplefactory.AbstractWeapon;
import g1092.dp.simplefactory.WeaponType;

public class WaterWeaponsFactory extends AbstractWeaponFactory {

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String desc) {
		AbstractWeapon weapon=null;
		switch(type) {
		case BAZOOKA: 
			weapon=new WaterBallon("Water Ballon");
			break;
		default:
			throw new UnsupportedOperationException("Not implemented yet");
		}
		return weapon;
	}

	
}
