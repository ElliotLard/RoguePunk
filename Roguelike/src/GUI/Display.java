package GUI;


import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import environment.Cell;

public class Display
{
	JFrame gameWindow;
	JPanel playSpace;
	JPanel legend;

	
	public Display()
	{
		gameWindow = new JFrame();
		gameWindow.setLayout(new BorderLayout());
		gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel console = new JPanel();
		console.setPreferredSize(new Dimension(10, 20));
		JLabel c = new JLabel();
		c.setText("feedback will be written here");
		console.add(c);
		
		playSpace = makePlaySpace();

		legend = makeLegend();
		
		gameWindow.getContentPane().add(console, BorderLayout.NORTH);
		gameWindow.getContentPane().add(legend, BorderLayout.WEST);
		gameWindow.getContentPane().add(playSpace, BorderLayout.CENTER);
		
		gameWindow.pack();
	}
	
	private JPanel makeLegend()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(20, 1));
			JLabel tile = new JLabel();
			tile.setText("character Display");
			panel.add(tile);
			
			panel.setPreferredSize(GUIConstants.LEGENDSIZE);
			panel.setBackground(Color.YELLOW);
		return panel;
	}
	private JPanel makePlaySpace()
	{
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(GUIConstants.PLAYSPACESIZE.height/GUIConstants.TILESIZE.height,GUIConstants.PLAYSPACESIZE.width/GUIConstants.TILESIZE.width));
		panel.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		panel.setBackground(Color.GREEN);
		return panel;
	}
	public void updatePlaySpace(Cell[][] tileMap)
	{
		playSpace.removeAll();
		for(int y = 0;y < GUIConstants.PLAYSPACESIZE.height/GUIConstants.TILESIZE.height;y++)
		{
			for(int x = 0;x < GUIConstants.PLAYSPACESIZE.width/GUIConstants.TILESIZE.width;x++)
			{
				Tile tile = new Tile(tileMap[y][x]);
				playSpace.add(tile);
			}

		}
	}
	
	public void draw()
	{
		gameWindow.setVisible(true);
	}
}
