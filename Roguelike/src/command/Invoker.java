package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lifeform.Player;

public class Invoker 
{
	KeyListener listener;
	
	public Invoker(Player player){
		listener = new MyKeyListener(player);
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
