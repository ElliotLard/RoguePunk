package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayState
{
	public Game game;
	JPanel displayPanel;
	public DisplayState()
	{
	}
	public JPanel update()
	{
		// TODO Auto-generated method stub
		return null;
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
