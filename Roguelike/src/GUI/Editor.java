package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import environment.Environment;

public class Editor
{
	JPanel displayPanel;
	DungeonAdapter adapter;
	public static EditorTile tiles[][];
	public Editor()
	{
		adapter = new DungeonAdapter();
		displayPanel = new JPanel(new GridLayout(Environment.HEIGHT, Environment.WIDTH));
		displayPanel.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		displayPanel.setBackground(Color.BLACK);
		fill();
	}
	private void fill()
	{
		char[][] tileMap = adapter.getMap();
		tiles = new EditorTile[Environment.HEIGHT][Environment.WIDTH];
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tiles[y][x] = new EditorTile(y, x, tileMap[y][x]);
				displayPanel.add(tiles[y][x]);
			}
		}
	}	

	public JPanel get()
	{
		return displayPanel;
	}
}