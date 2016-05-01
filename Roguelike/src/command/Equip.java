package command;

import lifeform.Player;

public class Equip implements Command
{
	Player player;
	
	/**
	 * We give the command the player so it knows where
	 * to call to interact with the game.
	 * @param player
	 */
	public Equip(Player player){
		this.player = player;
	}

	/**
	 * execute calls to the pickUp method in player
	 * which uses pickUp method.
	 */
	@Override
	public void execute(char key)
	{
		player.pickUp(player.getCell(), player.getCell().getItem(0));		
	}
}
