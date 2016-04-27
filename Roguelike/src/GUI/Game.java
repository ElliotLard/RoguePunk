package GUI;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import command.InvokerBuilder;
import environment.Environment;
import lifeform.LifeForm;
import lifeform.Player;


public class Game implements KeyListener
{
	JFrame game;
	DisplayState state;

	
	public Game()
	{
		LifeForm player = new Player();
		InvokerBuilder builder = new InvokerBuilder(player);
		KeyListener listener = builder.getInvoker().getKeyListener();
		Environment.getCell(30, 40).addLifeForm(player);
		state = new MenuState(this);
		game = new JFrame();
		game.addKeyListener(listener);
		game.setFocusable(true);
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
	
	@Override
	public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar() == 'w')
			System.out.println("move up");
		else if(e.getKeyChar() == 'a')
			System.out.println("move left");
		else if(e.getKeyChar() == 's')
			System.out.println("move down");
		else if(e.getKeyChar() == 'd')
			System.out.println("move right");
		else if(e.getKeyChar() == ' ')
			System.out.println("pressed space");
		else
			System.out.println(e);
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