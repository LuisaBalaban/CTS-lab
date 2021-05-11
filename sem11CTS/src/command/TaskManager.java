package command;

import java.util.ArrayList;

public class TaskManager {

	ArrayList<AsyncTask> tasks=new ArrayList<>();
	public void addAsyncTask(AsyncTask task)
	{
		tasks.add(task);
	}
	public void execute()
	{
		if(tasks.size()>0)
		{
		AsyncTask taskToExec=tasks.get(0);
		if(taskToExec!=null)
		{
			tasks.remove(0);
			taskToExec.awaitExecute();
		}
		}
	}
	
}
