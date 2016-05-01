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
	Legend legend;

	
	public Game()
	{
		legend = new Legend();
		Player player = new Player();
		InvokerBuilder.getInvoker(player, this);
		KeyListener listener = InvokerBuilder.getInvoker(player, this).getKeyListener();
		state = new MenuState(this);
		game = new JFrame();
		game.addKeyListener(listener);
		game.setFocusable(true);
		player.moveLifeForm(Environment.getCell(30, 40));	
		update();
	}
	public void changeState(DisplayState s)
	{
		game.remove(state.get());
		state = s;
		update();
	}

	public void update()
	{
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setPreferredSize(GUIConstants.WINDOWSIZE);
		game.setLayout(new BorderLayout());
		game.add(legend.get(), BorderLayout.EAST);
		game.add(state.get(), BorderLayout.WEST);
		game.pack();
		game.setVisible(true);
	}
	
	public void updateState()
	{
		if(state instanceof GameState)
		{
			state.updateGame();
		}
	}
}