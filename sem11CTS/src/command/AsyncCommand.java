package command;

public class AsyncCommand extends AsyncTask{

	String task;
	GameModuleInterface module=null;
	
	
	public AsyncCommand(String task, GameModuleInterface module) {
		super();
		this.task = task;
		this.module = module;
	}


	@Override
	public void awaitExecute() {
		this.module.doTask(task);
		
	}

	
}
