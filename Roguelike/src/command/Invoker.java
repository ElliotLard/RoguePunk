package command;

import java.awt.event.KeyListener;

import GUI.Game;
import lifeform.Player;

public class Invoker 
{
	KeyListener listener;
	
	public Invoker(Player player, Game g){
		listener = new MyKeyListener(player, g);
		/**
		 * Needs to be completed in the GUI.
		 * addKeyListener(listener);
		 * setFocusable(true);
		 */
	}	
	public KeyListener getKeyListener(){
		return listener;
	}
}
