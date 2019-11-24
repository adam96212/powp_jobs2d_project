package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {

	int _x;
	int _y;
	Job2dDriver job2dDriver;
	
	 public OperateToCommand(Job2dDriver j, int x, int y) {
		// TODO Auto-generated constructor stub
		 job2dDriver = j;
		 _x = x;
		 _y = y;
	}
	
	@Override
	public void execute()
	{
		System.out.println("execute z OperateTo");
		job2dDriver.operateTo(_x, _y);
	}
	
}
