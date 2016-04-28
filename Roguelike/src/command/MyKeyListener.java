package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GUI.DisplayState;
import GUI.GameState;
import lifeform.LifeForm;

public class MyKeyListener implements KeyListener
{
	LifeForm player;
	DisplayState state;

	public MyKeyListener(LifeForm player){
		this.player = player;
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		Command move = new Move(player);
		
		int entered = e.getKeyCode();
		switch (entered){
		case KeyEvent.VK_UP:
			move.execute(KeyEvent.VK_UP);
			state.updateGame();
			break;
		case KeyEvent.VK_DOWN:
			move.execute(KeyEvent.VK_DOWN);
			state.updateGame();
			break;
		case KeyEvent.VK_LEFT:
			move.execute(KeyEvent.VK_LEFT);
			state.updateGame();
			break;
		case KeyEvent.VK_RIGHT:
			move.execute(KeyEvent.VK_RIGHT);
			state.updateGame();
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	
	public void setGameState(DisplayState state){
		this.state = state;
	}
}
