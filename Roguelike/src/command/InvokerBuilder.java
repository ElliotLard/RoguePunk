package command;

import GUI.Game;
import lifeform.Player;

public class InvokerBuilder
{
	static Invoker invoker = null;
	
	/**
	 * @author Christopher Wilson
	 * Creates the invoker, passing along the player and game
	 * so that MyKeyListener has access and can update
	 * the GUI as necessary.
	 * 
	 * Since we only need one invoker, it is a singleton.
	 * @param player
	 * @param g
	 */
	
	public InvokerBuilder(Player player, Game g)
	{
		invoker = new Invoker(player, g);
	}
	
	/**
	 * Checks to make sure this is the only instance of Invoker
	 * made.
	 * @param player
	 * @param g
	 * @return
	 */
	
	public static Invoker getInvoker(Player player, Game g){
		if (invoker == null){
			invoker = new Invoker(player, g);
		}
		return invoker;
	}
	
	public static void destroyInvoker(){
		invoker = null;
	}
}
