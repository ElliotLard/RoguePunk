package command;

import lifeform.Player;

public class Move implements Command
{
	Player player;

	/**
	 * We give the command the player so it knows where to call to interact with
	 * the game.
	 * 
	 * @param player
	 */
	public Move(Player player)
	{
		this.player = player;
	}

	/**
	 * execute calls to the move method in player giving it the key value
	 * pressed.
	 */
	@Override
	public void execute(char key)
	{
		player.move(key);
	}
}
