package edu.kis.powp.jobs2d.drivers.adapter;


import javax.swing.JPanel;

import edu.kis.legacy.drawer.panel.DrawPanelController;
import edu.kis.legacy.drawer.shape.ILine;
import edu.kis.legacy.drawer.shape.LineFactory;
import edu.kis.legacy.drawer.shape.line.DottedLine;
import edu.kis.powp.jobs2d.Job2dDriver;

public class LineDrawerAdapter extends DrawPanelController implements Job2dDriver  {

	private int startX = 0, startY = 0;
	static private ILine _line;
//	public LineDrawerAdapter() {
//		super();
//	}
	
	public LineDrawerAdapter(JPanel panel, ILine line)
	{
		super();
		_line = line;
		initialize(panel);
	}

	@Override
	public void setPosition(int x, int y) {
		this.startX = x;
		this.startY = y;
	}

	@Override
	public void operateTo(int x, int y) {
		_line.setStartCoordinates(this.startX, this.startY);
		_line.setEndCoordinates(x, y);

		drawLine(_line);
		this.setPosition(x, y);
	}

	@Override
	public String toString() {
		return "LINELINELINE";
	}
}
