package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GUI.Game;
import lifeform.LifeForm;
import lifeform.Player;

public class MyKeyListener implements KeyListener
{
	Game game;
	LifeForm player;
	KeyListener myKeyListener;

	public MyKeyListener(LifeForm player, Game g){
		this.player = player;
		game = g;
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		Command move = new Move(player);
		int entered = e.getKeyCode();
		switch (entered){
		case KeyEvent.VK_UP:
			move.execute(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN:
			move.execute(KeyEvent.VK_DOWN);
			break;
		case KeyEvent.VK_LEFT:
			move.execute(KeyEvent.VK_LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			move.execute(KeyEvent.VK_RIGHT);
			break;
		}
		game.updateState();
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
	
	public void setGame(Game g)
	{
		game = g;
	}

}
