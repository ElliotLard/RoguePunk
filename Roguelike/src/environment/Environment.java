package environment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import gameplay.Observer;
import lifeform.Monster;
import lifeform.MonsterMaker;

public class Environment
{
	public static final int HEIGHT = 60, WIDTH = 80;
	private Cell tileMap[][];
	static Environment level;
	//trying this - Aaron Gerber
	public static Observer observe = new Observer();
	//End of my try
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
	
	public static void wipeLevel(){
		level = null;
	}
	
	@SuppressWarnings("resource")
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
						char c = parse[x].charAt(0);
						if(c != '#' && c != '.')
						{
							Monster m = MonsterMaker.genMonster();
							tileMap[y][x] = new Cell(y, x, '.');
							m.moveLifeForm(tileMap[y][x]);
							observe.addObserver(m);
						}
						else
							tileMap[y][x] = new Cell(y, x, c);
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
	
	//Aaron Gerber - doing stuff
	public static Cell getSpawn()
	{
		int x = 0, y =0;

		Cell spawn = null;
		
		for(boolean searchComp = false; !searchComp;)
		{
			if(x==WIDTH)
			{
				x = 0;
				y++;
			}
			if(y==HEIGHT)
				searchComp = true;
			else if(level.tileMap[y][x].getRep()=='@')
			{
				spawn= level.tileMap[y][x];
				searchComp = true;
			}
			x++;
		}
		
		if(spawn==null)
			spawn = level.tileMap[40][30];
			
		return spawn;
	}
	
}
