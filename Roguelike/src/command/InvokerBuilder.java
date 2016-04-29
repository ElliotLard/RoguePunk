package command;

import GUI.Game;
import lifeform.Player;

public class InvokerBuilder
{
	static Invoker invoker;
	
	public InvokerBuilder(Player player, Game g)
	{
		invoker = new Invoker(player, g);
	}
	
	public Invoker getInvoker(){
		return invoker;
	}
}
