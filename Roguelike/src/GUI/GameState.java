package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import command.InvokerBuilder;
import environment.Environment;
import lifeform.Player;

public class GameState extends DisplayState implements KeyListener
{
	DungeonAdapter adapter;
	public static GameTile tiles[][];
	public GameState(Game g)
	{
		super(g);
		adapter = new DungeonAdapter();
		displayPanel = new JPanel(new GridLayout(Environment.HEIGHT, Environment.WIDTH));
		displayPanel.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		displayPanel.setBackground(Color.BLACK);
		fill();
		
		Player player = new Player();
		InvokerBuilder builder = new InvokerBuilder(player);
		KeyListener listener = builder.getInvoker().getKeyListener();
		displayPanel.setFocusable(true);
		displayPanel.addKeyListener(listener);
		player.moveLifeForm(Environment.getCell(30, 40));	
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
	public void updateGame()
	{
		System.out.println("good");
		char [][] tileMap = adapter.getMap();
		for(int y = 0;y < Environment.HEIGHT;y++)
		{
			for(int x = 0;x < Environment.WIDTH;x++)
			{
				tiles[y][x].setChar(tileMap[y][x]);
			}
		}
	}
	public GameTile getTile(int y, int x)
	{
		return tiles[y][x];
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		this.updateGame();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}