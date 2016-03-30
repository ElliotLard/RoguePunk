package lifeform;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

public class TestSimpleFactory
{
	@Test
	public void test()// throws FileNotFoundException
	{
		SimpleFactory factory = new SimpleFactory();
		factory.buildMonster("CogGoblin", 'D', 10, 10, 10);
	}
}
