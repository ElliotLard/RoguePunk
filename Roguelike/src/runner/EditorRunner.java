package runner;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import GUI.Game;
import editor.DungeonEditor;
import environment.Environment;

public class EditorRunner
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		Environment world = Environment.getLevel("testLevel");
		DungeonEditor gui = new DungeonEditor();
	}
}
