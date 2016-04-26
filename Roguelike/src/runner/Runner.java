package runner;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import GUI.GameGUI;
import GUI.Window;
import dungeon.DungeonAdapter;
import dungeon.DungeonEditor;
import dungeon.dungeonUtility;
import environment.Environment;


public class Runner
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		Environment world = Environment.getLevel("blankLevel");
		GameGUI gui = new GameGUI();
	}
}
