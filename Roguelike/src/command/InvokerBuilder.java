package command;

import lifeform.LifeForm;
import lifeform.Player;

public class InvokerBuilder
{
	static Invoker invoker;
	
	public InvokerBuilder(Player player)
	{
		player = player;
		invoker = new Invoker(player);
	}
	
	public static Invoker getInvoker(){
		return invoker;
	}
}
