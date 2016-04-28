package command;

import lifeform.LifeForm;
import lifeform.Player;

public class InvokerBuilder
{
	static Invoker invoker;
	
	public InvokerBuilder(LifeForm player)
	{
		invoker = new Invoker(player);
	}
	
	public Invoker getInvoker(){
		return invoker;
	}
}
