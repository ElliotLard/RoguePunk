package environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import dungeon.DungeonMaker;
import dungeon.dungeonUtility;

public class Environment
{
	public static final int HEIGHT = 60, WIDTH = 80;
	private Cell tileMap[][];
	static Environment level;
	
	private Environment(String fileName)
	{
		tileMap = new Cell[HEIGHT][WIDTH];
		loadLevel(fileName);
	}
	/**
	 * @author elliotlard
	 * 
	 * instantiates the environment if it is null and then returns it
	 * @return      The one and only instance of environment
	 * @throws UnsupportedEncodingException 
	 * @throws FileNotFoundException 
	 */
	public static Environment getLevel(String fileName)
	{
		if(level == null)
			level = new Environment(fileName);
		return level;
	}
	
	private void loadLevel(String fileName)
	{
		fileName = "Assets/" + fileName;
		try
		{
			Scanner input = new Scanner(System.in);
			File file = new File(fileName);
			input = new Scanner(file);

			for (int y = 0; y < HEIGHT; y++)
			{
				String[] parse;
				if (input.hasNextLine())
				{
					parse = (input.nextLine().split(" "));	
					for (int x = 0; x < Environment.WIDTH; x++)
					{
						tileMap[y][x] = new Cell(y, x, parse[x].charAt(0));
					}
				}
			}
			input.close();
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	/**
	 * @author elliotlard
	 * used to access a specific cell in the environments tileMap
	 * @param  y	the y index of the desired cell
	 * @param  x	the x index of the desired cell 
	 * @return      the cell at [y][x]
	 */
	public static Cell getCell(int y, int x)
	{
		return level.tileMap[y][x];
	}
	
	/**
	 * @author elliotlard
	 * grants access to the entire 2d array of cells tileMap
	 * @return      the 2d array tileMap
	 */
	public static Cell[][] getTileMap()
	{
		return level.tileMap;
	}
	
}
