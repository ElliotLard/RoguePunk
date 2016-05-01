package lifeform;

import javax.swing.JPanel;
import java.util.Random;
import GUI.DisplayState;
import environment.Cell;
import environment.Environment;

//Author: Aaron Gerber
//Gives a base to the states that monsters will be using for their AI

public class MonsterState
{
	public Monster monster;
	int hpAtChangeState;
	boolean playerFound;
	Cell playerLoc;

	public void changeState(MonsterState s)
	{
		monster.changeState(s);
		hpAtChangeState = monster.getCurhp();
		s.activate();
	}

	public void activate()
	{
		//Default state does nothing
	}

	//Searches for the player within a 3 cell radius
	protected void searchPlayer()
	{

		int boundryY = Environment.HEIGHT;
		int boundryX = Environment.WIDTH;

		int mX = monster.getxLocation();
		int mY = monster.getyLocation();

		//Checks for out of bounds exceptions and for player location
		// that are north of the monster
		if(mY-1>0)
		{
			if(Environment.getCell(mY-1, mX).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY-1, mX);
			}
			else if(mY-2>0)
			{
				if(Environment.getCell(mY-2, mX).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-2, mX);
				}
				else if(mY-3>0)
				{
					if(Environment.getCell(mY-3, mX).getLifeForm().getClass()==Player.class)
					{
						playerFound=true;
						playerLoc = Environment.getCell(mY-3, mX);
					}
				}
			}

		}

		//Checks for out of bounds exceptions and for player location that
		// are north-east of the monster
		if(mY-1>0&&mX+1<boundryX&&!playerFound)
		{
			if(Environment.getCell(mY-1, mX+1).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY-1, mX+1);
			}
			else if(mY-2>0)
			{
				if(Environment.getCell(mY-2, mX+1).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-2, mX+1);
				}
			}
			else if(mX+2<boundryX)
			{
				if(Environment.getCell(mY-1, mX+2).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-1, mX+2);
				}
			}
		}

		//Checks for out of bounds exceptions and for player location that
		// are east of the monster
		if(mX+1<boundryX&&!playerFound)
		{
			if(Environment.getCell(mY, mX+1).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY, mX+1);
			}
			else if(mX+2<boundryX)
			{
				if(Environment.getCell(mY, mX+2).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY, mX+2);
				}
				else if(mX+3<boundryX)
				{
					if(Environment.getCell(mY, mX+3).getLifeForm().getClass()==Player.class)
					{
						playerFound=true;
						playerLoc = Environment.getCell(mY, mX+3);
					}
				}
			}	
		}

		//Checks for out of bounds exceptions and for player location that
		// are south-east of the monster
		if(mY+1<boundryY&&mX+1<boundryX&&!playerFound)
		{
			if(Environment.getCell(mY+1, mX+1).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY+1, mX+1);
			}
			else if(mY+2<boundryY)
			{
				if(Environment.getCell(mY+2, mX+1).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY+2, mX+1);
				}
			}
			else if(mX+2<boundryX)
			{
				if(Environment.getCell(mY+1, mX+2).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-1, mX+2);
				}
			}
		}

		//Checks for out of bounds exceptions and for player location
		// that are south of the monster
		if(mY+1<boundryY&&!playerFound)
		{
			if(Environment.getCell(mY+1, mX).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY+1, mX);
			}
			else if(mY+2<boundryY)
			{
				if(Environment.getCell(mY+2, mX).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY+2, mX);
				}
				else if(mY+3<boundryY)
				{
					if(Environment.getCell(mY+3, mX).getLifeForm().getClass()==Player.class)
					{
						playerFound=true;
						playerLoc = Environment.getCell(mY+3, mX);
					}
				}
			}
		}

		//Checks for out of bounds exceptions and for player location that
		// are south-west of the monster
		if(mY+1<boundryY&&mX-1>0&&!playerFound)
		{
			if(Environment.getCell(mY+1, mX-1).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY+1, mX+1);
			}
			else if(mY+2<boundryY)
			{
				if(Environment.getCell(mY+2, mX-1).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY+2, mX-1);
				}
			}
			else if(mX-2>0)
			{
				if(Environment.getCell(mY+1, mX-2).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-1, mX-2);
				}
			}
		}

		//Checks for out of bounds exceptions and for player location that
		// are west of the monster
		if(mX-1>0&&!playerFound)
		{
			if(Environment.getCell(mY, mX-1).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY, mX-1);
			}
			else if(mX-2>0)
			{
				if(Environment.getCell(mY, mX+2).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY, mX-2);
				}
				else if(mX-3>0)
				{
					if(Environment.getCell(mY, mX-3).getLifeForm().getClass()==Player.class)
					{
						playerFound=true;
						playerLoc = Environment.getCell(mY, mX-3);
					}
				}
			}	
		}

		//Checks for out of bounds exceptions and for player location that
		// are north-west of the monster
		if(mY-1>0&&mX-1>0&&!playerFound)
		{
			if(Environment.getCell(mY-1, mX-1).getLifeForm().getClass()==Player.class)
			{
				playerFound=true;
				playerLoc = Environment.getCell(mY-1, mX-1);
			}
			else if(mY-2>0)
			{
				if(Environment.getCell(mY-2, mX-1).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-2, mX-1);
				}
			}
			else if(mX-2>0)
			{
				if(Environment.getCell(mY-1, mX-2).getLifeForm().getClass()==Player.class)
				{
					playerFound=true;
					playerLoc = Environment.getCell(mY-1, mX-2);
				}
			}
		}

	}
}
