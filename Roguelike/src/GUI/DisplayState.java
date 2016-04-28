package GUI;

import javax.swing.JPanel;

import lifeform.Player;

public class DisplayState
{
	public Game game;
	JPanel displayPanel;
	Player player;
	
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
		player.setState(this);
	}
	
	public JPanel get()
	{
		return displayPanel;
	}
	
	public void setPlayer(Player p)
	{
		player = p;
	}

}
