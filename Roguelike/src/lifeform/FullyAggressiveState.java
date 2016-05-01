package lifeform;

//Author: Aaron Gerber
//An aggressive state that doesn't get changed; will actively search for the player
// and move around the map

public class FullyAggressiveState extends MonsterState
{

	public void activate()
	{
		//Tries to find the player before doing anything
		searchPlayer();

		//Moves toward the player if found or attacks the player if it is close enough
		if(playerFound)
		{
			if(getDistance()==1)
				playerLoc.getLifeForm().takeDamage(monster.calcDamage());
			else
				moveTowardPlayer();
					
		}
		//If the monster couldn't find the player, it moves randomly
		else
			MoveRandomly();
	}

}
