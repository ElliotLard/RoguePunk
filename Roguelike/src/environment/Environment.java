package environment;


public class Environment
{
	public static final int HEIGHT = 80, WIDTH = 200;
	Cell tileMap[][];
	static Environment level;
	
	private Environment()
	{
		for(int y = 0;y < HEIGHT;y++)
		{
			for(int x = 0;x < WIDTH;x++)
			{
				tileMap[y][x] = new Cell(y, x);
			}
		}
	}
	
	public static Environment getLevel()
	{
		if(level == null)
			level = new Environment();
		return level;
	}
	
}
