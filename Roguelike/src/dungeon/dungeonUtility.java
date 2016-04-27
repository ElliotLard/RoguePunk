package dungeon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import GUI.GameState;
import environment.Environment;

public class dungeonUtility
{
	public static int[][] toTileMap()
	{
		int[][] tileMap = new int[Environment.HEIGHT][Environment.WIDTH];
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tileMap[y][x] = Environment.getCell(y, x).getRep();
			}
		}
		return tileMap;
	}
	
//	public static void writeDungeon(String fileName) throws FileNotFoundException, UnsupportedEncodingException
//	{
//		fileName = "Assets/" + fileName;
//		PrintWriter writer;
//		try
//		{
//			writer = new PrintWriter(fileName, "UTF-8");
//			for (int y = 0; y < Environment.HEIGHT; y++)
//			{
//				for (int x = 0; x < Environment.WIDTH; x++)
//				{
//					writer.print);
//				}
//				writer.println();
//			}
//
//			writer.close();
//		} catch (FileNotFoundException | UnsupportedEncodingException e1)
//		{
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//	}

//	public static void setDungeon(String fileName) throws FileNotFoundException, UnsupportedEncodingException
//	{
//		fileName = "Assets/" + fileName;
//		Environment.getLevel();
//		try
//		{
//			Scanner input = new Scanner(System.in);
//			File file = new File(fileName);
//			input = new Scanner(file);
//
//			for (int y = 0; y < Environment.HEIGHT; y++)
//			{
//				String[] parse;
//				if (input.hasNextLine())
//				{
//					parse = (input.nextLine().split(" "));	
//					for (int x = 0; x < Environment.WIDTH; x++)
//					{
//						Environment.getCell(y, x).set(parse[x]);
//					}
//				}
//			}
//			input.close();
//		} catch (Exception ex)
//		{
//			ex.printStackTrace();
//		}
//	}

}