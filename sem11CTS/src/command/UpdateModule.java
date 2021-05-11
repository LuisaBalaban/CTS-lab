package command;

public class UpdateModule implements GameModuleInterface{

	@Override
	public void doTask(String taskName) {
		System.out.println("Updating...."+taskName);
		
	}

}
