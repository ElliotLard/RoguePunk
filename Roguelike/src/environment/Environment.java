package environment;
import dungeon.DungeonMaker;

public class Environment
{
	public static final int HEIGHT = 60, WIDTH = 60;
	Cell tileMap[][];
	int map[][];
	static Environment level;
	
	private Environment()
	{
		map = new DungeonMaker().createDungeon();
		tileMap = new Cell[HEIGHT][WIDTH];
		for(int y = 0;y < HEIGHT;y++)
		{
			for(int x = 0;x < WIDTH;x++)
			{
				tileMap[y][x] = new Cell(y, x, map[y][x]);
			}
		}
	}
	
	public static Environment getLevel()
	{
		if(level == null)
			level = new Environment();
		return level;
	}
	
	public static Cell getCell(int y, int x)
	{
		return level.tileMap[y][x];
	}
	public static Cell[][] getTileMap()
	{
		return level.tileMap;
	}
	
}
