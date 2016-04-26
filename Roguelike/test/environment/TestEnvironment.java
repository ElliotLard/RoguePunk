package environment;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEnvironment
{

	@Test
	public void testConstructor_GetLevel_LoadLevel_getCell_getTileMap()
	{
		Environment world = Environment.getLevel("testLevel");
		assertFalse(world == null);
		assertFalse(Environment.getCell(5, 5) == null);
		assertFalse(Environment.getTileMap() == null);
	}

	@Test
	public void test_addLifeForm_GetLifeForm()
	{
		Environment world = Environment.getLevel("testLevel");
		assertFalse(world == null);
		assertFalse(Environment.getCell(5, 5) == null);
		assertFalse(Environment.getTileMap() == null);
	}

}
