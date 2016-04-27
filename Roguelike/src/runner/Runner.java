package runner;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import GUI.DungeonAdapter;
import GUI.DungeonEditor;
import GUI.Game;
import environment.Environment;


public class Runner
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		Environment world = Environment.getLevel("testLevel");
		Game gui = new Game();
	}
}
