package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lifeform.LifeForm;

public class Move implements Command
{
	LifeForm player;
	
	public Move(LifeForm player){
		this.player = player;
	}

	@Override
	public void execute(int enter)
	{
		player.move(enter);
		
	}
}
