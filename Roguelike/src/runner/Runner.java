package runner;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import GUI.Game;
import environment.Environment;



public class Runner
{
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException
	{
		Environment world = Environment.getLevel("worldstar");
		Game gui = new Game();
	}
}
