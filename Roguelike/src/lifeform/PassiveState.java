package lifeform;

//Author: Aaron Gerber
//A passive state that does nothing unless attacked

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
