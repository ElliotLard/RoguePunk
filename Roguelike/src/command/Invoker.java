package command;

import java.awt.event.KeyListener;

import GUI.Game;
import lifeform.Player;

public class Invoker 
{
	KeyListener listener;
	
	/**
	 * @author Christopher Wilson
	 * 
	 * Builds MyKeyListener and passes along the player and
	 * instance of Game
	 * @param player
	 * @param g
	 */
	public Invoker(Player player, Game g){
		listener = new MyKeyListener(player, g);
	}	
	
	/**
	 * Returns the KeyListener to be passed along in Game
	 * @return
	 */
	public KeyListener getKeyListener(){
		return listener;
	}
}
