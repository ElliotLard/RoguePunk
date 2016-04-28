package environment;

import static org.junit.Assert.*;

import org.junit.Test;

import item.HealingItem;
import item.Item;
import lifeform.LifeForm;
import lifeform.Player;

public class TestCell
{

	@Test
	public void testConstructor_gety_getx_getrep()
	{
		Cell c = new Cell(5, 3, '1');
		assertEquals(5, c.getyLoc());
		assertEquals(3, c.getxLoc());
		assertEquals('1', c.getRep());

	}
//	TODO add back in once lifeForm works
//	@Test
//	public void test_addLifeForm_GetLifeForm()
//	{
//
//		Cell c = new Cell(5, 3, '1');
//		LifeForm player = new Player();
//		assertNull(c.getLifeForm());
//		c.addLifeForm(player);
//		assertEquals(player, c.getLifeForm());
//		c.removeLifeForm();
//		assertNull(c.getLifeForm());
//	}
	
//	TODO add back in once lifeForm works
	@Test
	public void test_addItem_getItem_removeLifeForm()
	{

		Cell c = new Cell(5, 3, '1');
		Item wrench = new HealingItem();
		assertNull(c.getItem(wrench));
		c.addItem(wrench);
		assertEquals(wrench, c.getItem(wrench));
		c.removeItem();
		assertNull(c.getItem(wrench));
	}

}
