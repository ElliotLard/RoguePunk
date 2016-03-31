package runner;

import GUI.Display;
import environment.Environment;

public class Runner
{
	public static void main(String[] args)
	{
		Environment.getLevel();
		Display game = new Display();
		game.updatePlaySpace(Environment.getTileMap());
		game.draw();
	}
}
