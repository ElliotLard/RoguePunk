package GUI;

import java.awt.BorderLayout;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import command.InvokerBuilder;
import environment.Environment;
import lifeform.Player;


public class Game
{
	JFrame game;
	DisplayState state;

	
	public Game()
	{
		state = new MenuState(this);
		game = new JFrame();
		update();

	}
	public void changeState(DisplayState s)
	{
		game.remove(state.get());
		state = s;
		//game.removeAll();
		update();
	}

	public void update()
	{
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setPreferredSize(GUIConstants.WINDOWSIZE);
		game.setLayout(new BorderLayout());
		game.add(state.get(), BorderLayout.WEST);
		game.pack();
		game.setVisible(true);
	}
}