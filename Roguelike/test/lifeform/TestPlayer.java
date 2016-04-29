package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Environment;

public class TestPlayer
{
	@Test
	public void testInit()
	{
		LifeForm player = new Player();
		Environment.getLevel("testLevel");
		player.moveLifeForm(Environment.getCell(30, 40));
		
		assertEquals(player, Environment.getCell(30, 40).getLifeForm());
		
		player.moveLifeForm(Environment.getCell(30, 41));
		assertEquals(player, Environment.getCell(30, 41).getLifeForm());
	}
}
