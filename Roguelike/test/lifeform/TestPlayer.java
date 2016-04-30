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
		 * tests to make sure the move method works on the player
		 * using "testLevel" since it has no obstructions.
		 */
		
		LifeForm player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(30, 40));
		
		assertEquals(player, Environment.getCell(30, 40).getLifeForm());
		
		player.moveLifeForm(Environment.getCell(30, 41));
		assertEquals(player, Environment.getCell(30, 41).getLifeForm());
		
		
		/**
		 * Initial equipment generates random stats so we cannot
		 * test for specific numbers. Instead we're just checking
		 * to see if the numbers generated are between 9 and 15.
		 */
		
		assertTrue(player.getCurhp() <= 20);
		assertTrue(player.getCurhp() >= 7);
		
		Environment.wipeLevel();
	}
	
	/**
	 * Since equipment stats are random, I'm testing
	 * for a range of values after player takes damage
	 */
	@Test
	public void testTakeDamage(){
		LifeForm player = new Player();
		player.takeDamage(5);
		assertTrue(player.getCurhp() <= 15);
		assertTrue(player.getCurhp() >= 1);
	}
	
	/**
	 * Checking if new equipment raises HP
	 */
	
	@Test
	public void testUpdateStats(){
		LifeForm player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(30, 40));
		assertTrue(player.getCurhp() <= 20);
		assertTrue(player.getCurhp() >= 7);
		
		BodyPart head = new BodyPart("TestHead", "A head", 5, 1, 0);
		player.equipPart(head);
		
		assertTrue(player.getCurhp() >= 10);
		
		Environment.wipeLevel();
	}
}
