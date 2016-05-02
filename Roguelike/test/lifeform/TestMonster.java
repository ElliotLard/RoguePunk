package lifeform;

import static org.junit.Assert.*;

import org.junit.*;

import environment.Cell;
import environment.Environment;
import gameplay.Observer;
import item.*;


//Author:Aaron Gerber
//Tests the monster class
public class TestMonster
{
	@Test
	public void testInit()
	{
		//Creates all the objects we need for the test
		Environment.getLevel("testLevel");
		Cell testCell = Environment.getCell(5, 5);
		Item slimeHead = new BodyPart(0);
		Item slimeBody = new BodyPart(1);
		Item slimeArms = new BodyPart(2);
		Item slimeLegs = new BodyPart(3);
		MonsterState passive = new PassiveState();
		MonsterState aggressive = new AggressiveState();
		Observer observe = new Observer();
	
		Player mario = new Player();
		Monster jerry = new Monster("Jerry the Slime", 'j', 5, slimeHead, slimeBody, slimeArms, slimeLegs);
		observe.addObserver(jerry);
		
		//asserts that jerry does have health
		assertTrue(jerry.getCurhp()>0);
		
		//adds jerry to the cell
		jerry.moveLifeForm(testCell);
		
		//Confirms that jerry was added to the cell
		assertEquals(testCell.getLifeForm(), jerry);
		
		//Makes jerry passive
		jerry.changeState(passive);
		
		//Confirms that jerry is now passives
		assertEquals(jerry.getState(), passive);
		
		observe.updateObserver();

		assertEquals(jerry.getState(), passive);
		
		
		//Checks that jerry will change states if hit
		jerry.takeDamage(1);
		
		observe.updateObserver();
		assertEquals(jerry.getState().getClass(), aggressive.getClass());
		
		mario.moveLifeForm(Environment.getCell(7, 5));
		
		observe.updateObserver();
		
		if(jerry.getCurhp()>=1)
		{
		//Confirms that jerry did move towards mario
		assertEquals(jerry.getCell(), Environment.getCell(6, 5));
		
		observe.updateObserver();
				
		//Confirms jerry hit mario
		assertTrue(mario.getCurhp()!=mario.getMaxhp());
		
		testCell = jerry.getCell();
		
		//Kills jerry off
		jerry.takeDamage(jerry.getCurhp());
		
		observe.updateObserver();
		
		assertTrue(jerry.getCell()==null);
		
		//Every once in a while this WILL fail, since monsters do not always drop an item
		assertTrue(testCell.hasItem());
		}
	}
}
