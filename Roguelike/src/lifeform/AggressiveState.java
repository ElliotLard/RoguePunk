package lifeform;

import environment.*;

public class AggressiveState extends MonsterState
{
	int countDown = 3;
	
	public void activate()
	{
		if(countDown==0)
		{
			PassiveState s = new PassiveState();
			changeState(s);
		}
		
		if(!playerFound)
			searchPlayer();
		else
		{
			if(getDistance(monster.getCell(), playerLoc)>1);
			
		}
	}
	
	private int getDistance(Cell cell, Cell playerLoc2)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
