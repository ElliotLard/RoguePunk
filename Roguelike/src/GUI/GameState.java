package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import dungeon.DungeonAdapter;
import environment.Environment;

public class GameState extends DisplayState
{
	DungeonAdapter adapter;
	public static GameTile tiles[][];
	public GameState()
	{
		//super();
		adapter = new DungeonAdapter();
		displayPanel = new JPanel(new GridLayout(Environment.HEIGHT, Environment.WIDTH));
		displayPanel.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		displayPanel.setBackground(Color.BLACK);
		fill();
	}

	private void fill()
	{
		char[][] tileMap = adapter.getMap();
		tiles = new GameTile[Environment.HEIGHT][Environment.WIDTH];
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tiles[y][x] = new GameTile(y, x, tileMap[y][x]);
				displayPanel.add(tiles[y][x].get());
			}
		}
	}

	public GameTile getTile(int y, int x)
	{
		return tiles[y][x];
	}

	public void update()
	{
		displayPanel.removeAll();
		fill();
	}

}
