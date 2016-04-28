package item;

import static org.junit.Assert.*;
import item.*;
import lifeform.*;

import org.junit.Test;

//Author: Aaron Gerber

public class TestItem
{

	@Test
	public void testReinforncement()
	{
		Item potion = new HealingItem();
		Item reinforcer = new Reinforcer();

		// Tests the default strength to confirm the potion was built correctly
		assertEquals(0, potion.getSTR());

		potion.Strengthen((Reinforcer) reinforcer);

		// Confirms that the reinforcement worked
		assertEquals(5, potion.getSTR());
		assertTrue(potion.getName().contains("+1"));

		potion.Strengthen((Reinforcer) reinforcer);

		// Confirms that the reinforcement failed because it ran out of uses
		assertEquals(5, potion.getSTR());
	}

	@Test
	public void testHealing()
	{
		Item potion = new HealingItem();
		LifeForm timmy = new Monster();

		assertEquals(timmy.getCurhp(), timmy.getCurhp());

		timmy.takeDamage(1);

		assertEquals((timmy.getCurhp() - 1), timmy.getCurhp());

		potion.PickedUp(timmy);

		potion.UseItem();

		assertEquals(timmy.getCurhp(), timmy.getCurhp());

	}

}
