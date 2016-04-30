package lifeform;

import environment.*;

public class AggressiveState extends MonsterState
{
	int countDown = 3;
	boolean playerFound;
	Cell playerLoc;
	
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
			if(getDistance(monster.getCell(), ))
		}
	}
	
	//Searches for the player within a 4 cell radius
	private void searchPlayer()
	{
		//Searches north of the monster
		boolean searchComplete = false;
		while(searchComplete)
		{
			int Y = Environment.HEIGHT-1;
			int X = Environment.WIDTH-1;
			
			int mX = monster.getxLocation();
			int mY = monster.getyLocation();
			
			//Checks for out of bounds
			if(mY-1>0)
			{
				if(Environment.getCell(mY-1, mX).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-1, mX);
				}
			}
				
		}
	}
}
