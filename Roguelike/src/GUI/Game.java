package GUI;

import java.awt.BorderLayout;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import command.InvokerBuilder;
import environment.Environment;
import lifeform.Player;

/**
 * The Game class holds the JFrame that contains the whole game
 * It also initializes everythign that will be in the game
 * @author elliotlard
 *
 */
public class Game
{
	JFrame game;
	DisplayState state;
	Legend legend;

	/**
	 * initializes the player, legend, state, and Invoker
	 */
	public Game()
	{
		Player player = new Player();
		legend = new Legend(player);
		Environment.getLevel("level1");
		InvokerBuilder.getInvoker(player, this);
		KeyListener listener = InvokerBuilder.getInvoker(player, this).getKeyListener();
		state = new MenuState(this);
		game = new JFrame();
		game.addKeyListener(listener);
		game.setFocusable(true);
		player.moveLifeForm(Environment.getSpawn());	
		update();
	}
	/**
	 * changes the state of the game to s
	 * so far generally only used to go from menu to game
	 * @param s
	 */
	public void changeState(DisplayState s)
	{
		game.remove(state.get());
		state = s;
		update();
	}
	
	/**
	 * encapsulates much of the initialization
	 */
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
	
	/**
	 * tells the state when to update
	 */
	public void updateState()
	{
		if(state instanceof GameState)
		{
			state.updateGame();
		}
	}
}
	