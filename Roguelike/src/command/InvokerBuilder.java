package command;

import lifeform.LifeForm;
import lifeform.Player;

public class InvokerBuilder
{
	public InvokerBuilder(Player player)
	{
		player = player;
		Invoker invoker = new Invoker(player);
	}
}
