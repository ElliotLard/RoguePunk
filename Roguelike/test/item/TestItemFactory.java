package item;

import static org.junit.Assert.*;

import org.junit.Test;


//Author: Aaron Gerber
//Tests the item factory
public class TestItemFactory
{
	@Test
	public void testItemCreation()
	{
		assertTrue(ItemGenerator.makeItem().getClass()!= null);
		
		assertTrue(ItemGenerator.makeItem(2).getClass()!= null);
		
		assertEquals(ItemGenerator.genLegs(1).getClass(), BodyPart.class);
		assertEquals(ItemGenerator.genArms(1).getClass(), BodyPart.class);
		assertEquals(ItemGenerator.genTorso(1).getClass(), BodyPart.class);
		assertEquals(ItemGenerator.genHead(1).getClass(), BodyPart.class);
	}
}
