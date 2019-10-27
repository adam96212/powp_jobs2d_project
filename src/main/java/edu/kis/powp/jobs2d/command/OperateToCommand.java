package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

	Job2dDriver job2dDriver;
	
	int x;
	int y;

	
	 public OperateToCommand(Job2dDriver j) {
		// TODO Auto-generated constructor stub
		 
		 job2dDriver = j;
		 
	}
	
	 
	@Override
	public void execute()
	{
		
		job2dDriver.operateTo(x, y);
	}
	
}
