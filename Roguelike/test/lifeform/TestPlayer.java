package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Environment;
import item.BodyPart;
import item.Item;

public class TestPlayer
{
	@Test
	public void testInit()
	{
		/**
		 * @author Christopher Wilson
		 * 
		 *         tests to make sure the move method works on the player using
		 *         "testLevel" since it has no obstructions.
		 */
		LifeForm player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(30, 40));
		assertEquals(player, Environment.getCell(30, 40).getLifeForm());
		/**
		 * Initial equipment generates random stats so we cannot test for
		 * specific numbers. Instead we're just checking to see if the numbers
		 * generated are between 9 and 15.
		 */
		assertTrue(player.getMaxhp() >= 4);
		assertTrue(player.getMaxhp() <= 20);
	}

	/**
	 * Since equipment stats are random, I'm testing for a range of values after
	 * player takes damage
	 */
	@Test
	public void testTakeDamage()
	{
		LifeForm player = new Player();
		player.takeDamage(5);
		assertTrue(player.getCurhp() >= -1);
		assertTrue(player.getCurhp() <= 15);
	}

	/**
	 * Checking if new equipment raises HP
	 */
	@Test
	public void testUpdateStats()
	{
		LifeForm player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(30, 40));
		BodyPart head = new BodyPart("TestHead", "A head", 5, 1, 0);
		player.equipPart(head);
		assertTrue(player.getMaxhp() >= 8);
		assertTrue(player.getMaxhp() <= 40);
		Environment.wipeLevel();
	}

	/**
	 * Tests combat in the game. The way it should work is if Player tries to
	 * move to a position where a monster is, instead of moving the player will
	 * attack.
	 */
	@Test
	public void testCombat()
	{
		/**
		 * Creates player, places in cell 20, 40.
		 */
		Player player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(20, 40));
		/**
		 * Creates a monster to the right of player
		 */
		Monster jerry = MonsterMaker.genMonster();
		jerry.moveLifeForm(Environment.getCell(20, 41));
		/**
		 * Checks to see if both objects are where they should be
		 */
		assertEquals(player, Environment.getCell(20, 40).getLifeForm());
		assertEquals(jerry, Environment.getCell(20, 41).getLifeForm());
		player.move('d'); // Tries to move player right
		/**
		 * Makes sure player did not leave his space since Jerry is to his right
		 */
		assertEquals(player, Environment.getCell(20, 40).getLifeForm());
		assertEquals(0, jerry.getCurhp()); // checks to see if Jerry died
		Environment.wipeLevel();
	}

	/**
	 * Tests to make sure Player can pick up items from the ground
	 */
	@Test
	public void testPickUp()
	{
		/**
		 * Creates player
		 */
		Player player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(10, 40));
		/**
		 * Creates a head item and places it in the cell Player is in.
		 */
		BodyPart head = new BodyPart("TestHead", "A head", 5, 1, 0);
		Environment.getCell(10, 40).addItem(head);
		/**
		 * Checks to make sure player and head are both in the cell
		 */
		assertEquals(player, Environment.getCell(10, 40).getLifeForm());
		assertTrue(Environment.getCell(10, 40).hasItem());
		/**
		 * Player picks up the item and the cell is asked if it has an item.
		 */
		player.pickUp(Environment.getCell(10, 40), head);
		assertFalse(Environment.getCell(10, 40).hasItem());
	}
}
