package command;

import lifeform.Player;

public class Move implements Command
{
	Player player;
	
	public Move(Player player){
		this.player = player;
	}

	@Override
	public void execute(char key)
	{
		player.move(key);
		
	}
}
