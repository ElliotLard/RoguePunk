package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GUI.Game;
import lifeform.LifeForm;
import lifeform.Player;

public class MyKeyListener implements KeyListener
{
	Game game;
	Player player;
	KeyListener myKeyListener;

	public MyKeyListener(Player player, Game g){
		this.player = player;
		game = g;
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		Command move = new Move(player);
		char entered = e.getKeyChar();
		switch (entered){
		case 'w':
			move.execute(entered);
			break;
		case 's':
			move.execute(entered);
			break;
		case 'a':
			move.execute(entered);
			break;
		case 'd':
			move.execute(entered);
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
