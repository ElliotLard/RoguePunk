package GUI;

import javax.swing.JPanel;
/**
 * 
 * @author elliotlard
 *
 *This is the abstract for the gamestate
 *as of now there is a gameState and a menuState
 */
public class DisplayState
{
	public Game game;
	JPanel displayPanel;
	/**
	 * 
	 * @param g the Game this state will be a part of
	 */
	public DisplayState(Game g)
	{
		game = g;
	}
	/**
	 * the abstract method for updategame will be used in subclasses
	 */
	public void updateGame()
	{
	}
	/**
	 * changes the displaystate in the Game
	 * @param s
	 */
	public void changeState(DisplayState s)
	{
		game.changeState(s);
	}
	/**
	 * returns the JPanel in the state
	 * @return
	 */
	public JPanel get()
	{
		return displayPanel;
	}
}
