package g1092.dp.factorymethod;

import g1092.dp.simplefactory.AbstractWeapon;
import g1092.dp.simplefactory.Bazooka;
import g1092.dp.simplefactory.MachineGun;
import g1092.dp.simplefactory.Pistol;
import g1092.dp.simplefactory.WeaponType;

public class RealWeaponsFactory extends AbstractWeaponFactory{

	@Override
	public AbstractWeapon getWeapon(WeaponType type, String desc) {
		AbstractWeapon weapon=null;
		switch(type)
		{
		case PISTOL:
			weapon=new Pistol(desc, 100);
			break;
		case MACHINE_GUN:
			weapon=new MachineGun(desc, 500, 1000);
			break;
		case BAZOOKA:
			weapon=new Bazooka(desc);
			break;
		default:
			throw new UnsupportedOperationException();
			
			}
		return weapon;
	}

}
