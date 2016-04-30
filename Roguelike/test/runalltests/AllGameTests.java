package runalltests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import command.TestInvoker;
import lifeform.TestPlayer;


@RunWith(Suite.class)
@Suite.SuiteClasses(
{ TestPlayer.class, TestInvoker.class })

public class AllGameTests
{
	
}
