package sem6Ctsg1092.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {

		//Option1
		//1. Create
		//Superhero superHero=new Superhero();
		//2. Init
		//TODDO: dont forgert to init obj with values
		
		//Option 2
		Weapon pistol=new Weapon("pistol");
		Superhero superhero=new Superhero("Superman", 100, false,false,pistol, null, "fly","");
		Superhero superhero2=new Superhero("Batman", 100, false,false,null, null, "","");

		
		//OPTION 3 - builder version
		Superhero superman=
				new Superhero.SuperHeroBuilder("Superman", 100)
				.setleftWeapon(pistol)
				.setSuperPower("fly")
				.setSuperSuperPower("laser eyes")
				.build();//forcing us not to forget to init the obj values
		Superhero joker=new Superhero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.setRightWeapon(pistol)
				.build();
		Superhero dummyHero=new Superhero.SuperHeroBuilder("Dummy", 50).build();
	}

}
