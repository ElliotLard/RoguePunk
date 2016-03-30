package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMonster
{
	@Test
	public void testInit()
	{
		/**
		 * Test initialization of a monster
		 */
		MockLifeForm m1 = new Monster('D', "Douglas", 10, null);
		assertEquals('D', m1.representation);
		assertEquals("Douglas", m1.name);
		assertEquals(10, m1.speed);
		assertNull(m1.location);
	}
}
