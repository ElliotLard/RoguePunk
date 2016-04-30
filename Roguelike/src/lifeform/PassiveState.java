package lifeform;

import java.util.Random;

public class PassiveState extends MonsterState
{
	public void activate()
	{
		//Checks if it was attacked
		if(monster.getCurhp()!=monster.getMaxhp())
		{
			AggressiveState s = new AggressiveState();
			changeState(s);
		}
		
			
		
	}
}
