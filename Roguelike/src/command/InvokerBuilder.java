package command;

import GUI.Game;
import lifeform.Player;

public class InvokerBuilder
{
	static Invoker invoker;
	
	/**
	 * Creates the invoker, passing along the player and game
	 * so that MyKeyListener has access and can update
	 * the GUI as necessary.
	 * @param player
	 * @param g
	 */
	
	public InvokerBuilder(Player player, Game g)
	{
		invoker = new Invoker(player, g);
	}
	
	/**
	 * Returns invoker for use outside of the class
	 * @return
	 */
	
	public Invoker getInvoker(){
		return invoker;
	}
}
