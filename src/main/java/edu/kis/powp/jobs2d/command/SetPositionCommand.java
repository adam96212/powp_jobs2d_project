package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
		
	
	int x;
	int y;
	Job2dDriver job2dDriver;
	
	 public SetPositionCommand(Job2dDriver j) {
		// TODO Auto-generated constructor stub
		 job2dDriver = j;
	}
	
	@Override
	public void execute()
	{
		System.out.println("execute z SetPosition");
		job2dDriver.setPosition(x, y);
	}
	
}
