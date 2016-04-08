package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import environment.Environment;

public class Window extends JFrame
{
	GameSpace gameSpace;
	
	public Window()
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(GUIConstants.WINDOWSIZE);
		this.setLayout(new BorderLayout());

		gameSpace = new GameSpace();

		this.add(gameSpace, BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}
}
