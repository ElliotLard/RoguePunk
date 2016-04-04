package item;

import static org.junit.Assert.*;

import org.junit.Test;

import itemprefixes.GoblinPrefix;
import itemprefixes.ItemPrefixes;
import material.Brass;
import material.Material;

public class TestBodyPart
{
	@Test
	public void testInitialization()
	{
		ItemPrefixes goblin = new GoblinPrefix();
		Material brass = new Brass();
		BodyPart arms = new BodyPart(goblin, brass, "Arms");
		assertEquals("Goblin Brass Arms", arms.getPartName());
		assertEquals(2, arms.getType());
		assertEquals("|", arms.rep);
	}
}
