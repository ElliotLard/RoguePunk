package dungeon;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import GUI.GameSpace;
import environment.Environment;

public class DungeonAdapter
{
	public static char[][] tileMap = new char[Environment.HEIGHT][Environment.WIDTH];
	
	public static char[][] getMap()
	{
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tileMap[y][x] = Environment.getCell(y, x).getRep();
			}
		}
		return tileMap;
	}
	
	public static void writeDungeon(String fileName) throws FileNotFoundException, UnsupportedEncodingException
	{
		fileName = "Assets/" + fileName;
		PrintWriter writer;
		try
		{
			writer = new PrintWriter(fileName, "UTF-8");
			for (int y = 0; y < Environment.HEIGHT; y++)
			{
				for (int x = 0; x < Environment.WIDTH; x++)
				{
					tileMap[y][x] = GameSpace.tiles[y][x].getRep();
					writer.print(tileMap[y][x] + " ");
				}
				writer.println();
			}

			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
