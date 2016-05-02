package editor;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import environment.Environment;
/**
 * this class translates between the text files the levels are saved to
 * and the environment
 * 
 * @author elliotlard
 *
 */
public class DungeonAdapter
{
	private char[][] tileMap = new char[Environment.HEIGHT][Environment.WIDTH];
	/**
	 * 
	 * @return the char[][] tilemap
	 */
	public char[][] getMap()
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
	/**
	 * writes the dungeon you have made in the editor to a file in the assets folder
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 * @throws UnsupportedEncodingException
	 */
	public void writeDungeon(String fileName) throws FileNotFoundException, UnsupportedEncodingException
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
					tileMap[y][x] = Editor.tiles[y][x].getRep();
					writer.print(tileMap[y][x] + " ");
				}
			}

			writer.close();
		} catch (FileNotFoundException | UnsupportedEncodingException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
}
