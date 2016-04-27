package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class Game
{
	JFrame game;
	DisplayState state;
	
	public Game()
	{
		game = new JFrame();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setPreferredSize(GUIConstants.WINDOWSIZE);
		game.setLayout(new BorderLayout());
		state = new GameState();
		game.add(state.getFrame(), BorderLayout.WEST);
		game.pack();
		game.setVisible(true);
	}
	public void changeState(DisplayState s)
	{
		state = s;
	}
}