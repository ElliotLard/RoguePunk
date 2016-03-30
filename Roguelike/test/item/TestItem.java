package item;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestItem
{
	@Test
	public void testInit()
	{
		/**
		 * Tests creating a default item with
		 * no special values input.
		 */
		Item item = new BodyPart(); // Creates a default item with
								// no special values
		assertEquals("unnamed", item.name); // Default name is "unnamed"
		assertEquals(-1, item.type); // Default type is -1
		assertEquals('%', item.rep); // Default char to represent
									 // item is '%'
		assertEquals(5, item.weight); // Default weight is 5
	}
}
