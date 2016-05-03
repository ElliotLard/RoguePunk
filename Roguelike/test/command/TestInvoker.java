package command;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

import GUI.Game;
import environment.Environment;
import lifeform.LifeForm;
import lifeform.Player;

public class TestInvoker
{
	/**
	 * @author Christopher Wilson
	 */
	/**
	 * Test Initialization of Invoker. Should be a singleton.
	 * 
	 * game value is null because we don't need to instantiate a game for this
	 * test.
	 */
	@Test
	public void testInit()
	{
		Player player = new Player();
		InvokerBuilder.getInvoker(player, null);
		Invoker invoke1 = InvokerBuilder.getInvoker(player, null); // Invoker #1
		Invoker invoke2 = InvokerBuilder.getInvoker(player, null); // Invoker #2
		assertTrue(invoke1 == invoke2); // Should be equal to each other because
										// only one invoker
		InvokerBuilder.destroyInvoker(); // Since it's a Singleton, we must
											// destroy it when we are done.
	}

	/**
	 * Testing key inputs to use player commands for movement We are using WASD
	 * movement because the arrow key values do not seem universal.
	 */
	@Test
	public void testSendCommand()
	{
		Player player = new Player();
		Command move = new Move(player);
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(30, 40));
		move.execute('w'); // Should move the player up.
		assertEquals(player, Environment.getCell(29, 40).getLifeForm());
		move.execute('d'); // Should move the player right.
		assertEquals(player, Environment.getCell(29, 41).getLifeForm());
		move.execute('s'); // Should move the player down.
		assertEquals(player, Environment.getCell(30, 41).getLifeForm());
		move.execute('a'); // Should move the player left.
		assertEquals(player, Environment.getCell(30, 40).getLifeForm());
		Environment.wipeLevel();
		InvokerBuilder.destroyInvoker();
	}

	/**
	 * We'd have to isntantiate the game and basically run it to test and that's
	 * a lot to do. Instead we're using a dialogue box to ask if it has worked
	 * or not when used in the game.
	 */
	@Test
	public void testInitialization()
	{
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"Do movement keys function\nproperly and move\nthe player on screen?"));
	}
}
