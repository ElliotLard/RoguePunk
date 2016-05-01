package lifeform;

import java.util.Random;

public class PassiveState extends MonsterState
{
	public void activate()
	{
		//Checks if the monster was attacked
		if(monster.getCurhp()!= hpAtChangeState)
		{
			AggressiveState s = new AggressiveState();
			changeState(s);
		}
		
	}
}
