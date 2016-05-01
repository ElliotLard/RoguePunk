package lifeform;

//Author: Aaron Gerber
//An aggressive state that forms after the monster was hit with an attack.
//Will revert back to a passive state if the monster couldn't find the player after 3 turns

public class AggressiveState extends MonsterState
{
	int countDown = 3;
	
	public void activate()
	{
		//Checks the count down
		if(countDown==0)
		{
			PassiveState s = new PassiveState();
			changeState(s);
		}
		
		//Tries to find the player if its still aggressive
		searchPlayer();

		//Tries to move towards the player, or attack if it does find the player
		if(playerFound)
		{
			if(getDistance()==1)
				playerLoc.getLifeForm().takeDamage(monster.calcDamage());
			else
				moveTowardPlayer();
					
			countDown = 3;
		}
		//If the monster can't find the player, then start the count down
		else 
			countDown--;
	}


}
