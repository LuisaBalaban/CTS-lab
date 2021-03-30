package sem6Ctsg1092.dp.builder;

public class Superhero {

	String name;
	int lifePoints;
	boolean isVillain;
	boolean isCriticalWounded;
	
	Weapon leftHandWeapon;
	Weapon  rightHandWeapon;
	String superPower;
	String superSuperPower;
	
	private Superhero()
	{
		
	}

	public Superhero(String name, int lifePoints, boolean isVillain, boolean isCriticalWounded, Weapon leftHandWeapon,
			Weapon rightHandWeapon, String superPower, String superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isCriticalWounded = isCriticalWounded;
		this.leftHandWeapon = leftHandWeapon;
		this.rightHandWeapon = rightHandWeapon;
		this.superPower=superPower;
		this.superSuperPower = superSuperPower;
	}
	public static class SuperHeroBuilder{
		Superhero superhero=null;//reference of the superhero
		public SuperHeroBuilder(String name, int lifePoints)
		{
			this.superhero=new Superhero();
			this.superhero.name=name;
			this.superhero.lifePoints=lifePoints;
			this.superhero=new Superhero(name, lifePoints, false, false, null, null, "","");
		}
		public SuperHeroBuilder isVillain()
		{
			this.superhero.isVillain=true;
			return this;//we return the ref to the builder
		}
		public SuperHeroBuilder isWounded()
		{
			this.superhero.isCriticalWounded=true;
			return this;
		}
		public SuperHeroBuilder setleftWeapon(Weapon weapon)
		{
			this.superhero.leftHandWeapon=weapon;
			return this;
		}
		public SuperHeroBuilder setRightWeapon(Weapon weapon)
		{
			this.superhero.rightHandWeapon=weapon;
			return this;
		}
		public SuperHeroBuilder setSuperPower(String superPower)
		{
			this.superhero.superPower=superPower;
			return this;
		}
		public SuperHeroBuilder setSuperSuperPower(String superSuperPower)
		{
			this.superhero.superSuperPower=superSuperPower;
			return this;
		}
		//the only method that allows other devs to get the superhero
		public Superhero build()
		{
			return this.superhero;
		}
	}
	
	
}
