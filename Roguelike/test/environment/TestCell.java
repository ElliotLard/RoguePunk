package environment;

import static org.junit.Assert.*;

import org.junit.Test;

import lifeform.LifeForm;

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
	@Test
	public void test_addLifeForm_removeLifeForm()
	{
		Cell c = new Cell(5, 3, '1');
		LifeForm l = new LifeForm();
		assertEquals(5, c.getyLoc());
		assertEquals(3, c.getxLoc());
		assertEquals('1', c.getRep());
	}

//	@Test
//	public void test_addItem_removeItem()
//	{
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testGetters()
//	{
//		fail("Not yet implemented");
//	}

}
