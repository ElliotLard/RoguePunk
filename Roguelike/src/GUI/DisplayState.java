package GUI;

import javax.swing.JPanel;

public class DisplayState
{
	public Game game;
	JPanel displayPanel;
	public DisplayState()
	{
	}
	
	public void changeState(DisplayState s)
	{
		game.changeState(s);
	}
	
	public JPanel getFrame()
	{
		return displayPanel;
	}

}
