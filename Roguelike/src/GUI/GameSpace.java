package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import dungeon.DungeonAdapter;
import environment.Environment;

public class GameSpace extends JPanel
{

	public static Tile tiles[][];
	public GameSpace()
	{
		super(new GridLayout(Environment.HEIGHT, Environment.WIDTH));	
		this.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		this.setBackground(Color.BLACK);
		fill();
	}
	
	public void fill()
	{
		char[][] tileMap = DungeonAdapter.getMap();
		tiles = new Tile[Environment.HEIGHT][Environment.WIDTH];
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tiles[y][x] = new Tile(y, x, tileMap[y][x]);
				this.add(tiles[y][x]);
			}
		}
	}
	
	public Tile getTile(int y, int x)
	{
		return tiles[y][x];
	}
	
}
