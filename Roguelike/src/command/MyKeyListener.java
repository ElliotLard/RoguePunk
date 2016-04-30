package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import GUI.Game;
import lifeform.Player;

public class MyKeyListener implements KeyListener
{
	/**
	 * @author Christopher Wilson
	 * 
	 * Sets the KeyListener to be able to call
	 * commands to the player and update the game
	 * GUI.
	 */
	Game game;
	Player player;

	public MyKeyListener(Player player, Game g){
		this.player = player;
		game = g;
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		/**
		 * Reads in the key the player uses and uses the cases
		 * accordingly to call to the command to execute.
		 * 
		 * After every key press the GUI is updated.
		 */
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
		case 'x':
			move.execute(entered);
			break;
		}
		game.updateState();
	}

	/**
	 * not used methods
	 */
	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub		
	}
	
	
	/**
	 * Allows us to set the game value
	 * @param g
	 */
	public void setGame(Game g)
	{
		game = g;
	}

}
