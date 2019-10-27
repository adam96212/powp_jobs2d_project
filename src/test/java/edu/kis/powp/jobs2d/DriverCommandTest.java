package edu.kis.powp.jobs2d;

import java.util.ArrayList;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.drivers.adapter.MyAdapter;

public class DriverCommandTest {

	public static void main(String[] args) {
		
		
		
		OperateToCommand o = new OperateToCommand(new MyAdapter());
		SetPositionCommand s = new SetPositionCommand(new MyAdapter());
		
		ArrayList<DriverCommand> list = new ArrayList<>();
		list.add(o);
		list.add(s);
		
		for(DriverCommand member : list)
		{
			member.execute();
		}

	}

}
