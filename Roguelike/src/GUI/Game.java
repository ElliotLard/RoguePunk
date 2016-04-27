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
		game = new JFrame();
		game.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		game.setPreferredSize(GUIConstants.WINDOWSIZE);
		game.setLayout(new BorderLayout());
		state = new GameState();
		game.add(state.getFrame(), BorderLayout.WEST);
		game.pack();
		game.setVisible(true);
		game.addKeyListener(this);;
	}
	public void changeState(DisplayState s)
	{
		state = s;
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar() == 'w')
			System.out.println("move up");
		if(e.getKeyChar() == 'a')
			System.out.println("move left");
		if(e.getKeyChar() == 's')
			System.out.println("move down");
		if(e.getKeyChar() == 'd')
			System.out.println("move right");
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