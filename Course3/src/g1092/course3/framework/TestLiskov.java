package g1092.course3.framework;

public class TestLiskov {
	public static void walk(ActionsInterface entity)
	{
		entity.walk();
		
	}
	public static void main(String[] args)
	{
		//for persons
		Person person=new Person();
		walk(person);
	}

}
