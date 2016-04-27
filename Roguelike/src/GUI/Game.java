package GUI;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class Game implements KeyListener
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
		game.addKeyListener(this);
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