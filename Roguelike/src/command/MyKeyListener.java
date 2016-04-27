package command;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import lifeform.LifeForm;

public class MyKeyListener implements KeyListener
{
	LifeForm player;
	final Command move = new Move(player);

	public MyKeyListener(LifeForm player){
		this.player = player;
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		int entered = e.getKeyCode();
		switch (entered){
		case KeyEvent.VK_UP:
			System.out.println("Up");
//			move.execute(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN:
			System.out.println("Down");
//			move.execute(KeyEvent.VK_DOWN);
			break;
		case KeyEvent.VK_LEFT:
			System.out.println("Left");
//			move.execute(KeyEvent.VK_LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			System.out.println("Right");
//			move.execute(KeyEvent.VK_RIGHT);
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
	}

	@Override
	public void keyTyped(KeyEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
