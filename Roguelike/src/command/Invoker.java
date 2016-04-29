package command;

import java.awt.event.KeyListener;

import GUI.Game;
import lifeform.LifeForm;

public class Invoker 
{
	KeyListener listener;
	
	public Invoker(LifeForm player, Game g){
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
