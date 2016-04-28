package GUI;

import javax.swing.JPanel;

import environment.Environment;

public class DisplayState
{
	public Game game;
	JPanel displayPanel;
	
	public DisplayState(Game g)
	{
		game = g;
	}
	
	public void updateGame()
	{

	}
	
	public void changeState(DisplayState s)
	{
		game.changeState(s);
	}
	
	public JPanel get()
	{
		return displayPanel;
	}

}
