package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import editor.DungeonAdapter;
import environment.Environment;
/**
 * The GameState holds all of the visuals of the environment
 * 
 * @author elliotlard
 *
 */
public class GameState extends DisplayState
{

	DungeonAdapter adapter;
	public static GameTile tiles[][];
	/**
	 * initializes the GameState
	 * @param g the game to be added to
	 */
	public GameState(Game g)
	{
		super(g);
		adapter = new DungeonAdapter();
		displayPanel = new JPanel(new GridLayout(Environment.HEIGHT, Environment.WIDTH));
		displayPanel.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		displayPanel.setBackground(Color.BLACK);
		fill();
	}
	/**
	 * initializes the tilemap array
	 */
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
	
	/**
	 * updates the tilemap array to be current info
	 */
	public void updateGame()
	{
		Environment.observe.updateObserver();
		char [][] tileMap = adapter.getMap();
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tiles[y][x].setChar(tileMap[y][x]);
			}
		}
	}
	/**
	 * returns an individual tile
	 * @param y
	 * @param x
	 * @return
	 */
	public GameTile getTile(int y, int x)
	{
		return tiles[y][x];
	}
}