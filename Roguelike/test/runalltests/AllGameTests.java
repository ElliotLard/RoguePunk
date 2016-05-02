package runalltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import command.*;
import lifeform.*;
import item.*;


@RunWith(Suite.class)
@Suite.SuiteClasses(
{ TestPlayer.class, TestInvoker.class, TestItem.class, TestItemFactory.class,
	MonsterMakerTest.class, TestMonster.class})

public class AllGameTests
{
	
}
