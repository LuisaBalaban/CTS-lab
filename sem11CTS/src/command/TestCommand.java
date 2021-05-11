package command;

public class TestCommand {

	public static void main(String[] args)
	{
		TaskManager manager=new TaskManager();
		manager.addAsyncTask(new AsyncCommand("Autosave", new BackupModule()));
		manager.addAsyncTask(new AsyncCommand("update 3D models", new UpdateModule()));
		System.out.println("game is running");
		manager.execute();
		manager.execute();
		manager.execute();
		System.out.println("game has started");
	}
}
