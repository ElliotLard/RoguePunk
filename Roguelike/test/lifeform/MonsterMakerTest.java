package lifeform;

import static org.junit.Assert.*;

import org.junit.Test;

import environment.Environment;
import gameplay.Observer;

public class MonsterMakerTest
{

	@Test
	public void testInit()
	{
		assertEquals(MonsterMaker.genMonster().getClass(), Monster.class);
		assertEquals(MonsterMaker.genMonster(4).getClass(), Monster.class);
		
		Monster jerry = MonsterMaker.genMonster();
		
		//Confirms that Jerry was generated
		assertTrue(jerry!=null);
		
		assertTrue(jerry.getCurhp()>1);
		assertTrue(jerry.getCell()==null);
		
		Environment.getLevel("testLevel");
		jerry.moveLifeForm(Environment.getCell(5, 5));
		
		Observer observe = new Observer();
		
		observe.addObserver(jerry);
		
		//Makes it so that jerry will move, since passive and aggressive states don't move randomly
		jerry.changeState(new FullyAggressiveState());
		
		observe.updateObserver();
		
		assertTrue(jerry.getCell()!=Environment.getCell(5, 5));
	}

}
