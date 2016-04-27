package runner;

import java.awt.event.KeyListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import GUI.DungeonAdapter;
import GUI.DungeonEditor;
import GUI.Game;
import command.InvokerBuilder;
import environment.Environment;
import lifeform.LifeForm;
import lifeform.Player;


public class Runner
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		Environment world = Environment.getLevel("testLevel");
		Game gui = new Game();
		
	}
}
