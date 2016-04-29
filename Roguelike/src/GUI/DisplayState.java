package GUI;

import javax.swing.JPanel;

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
		System.out.println("bad");
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
