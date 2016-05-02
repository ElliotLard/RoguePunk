package lifeform;

import java.util.Random;
import environment.Cell;
import environment.Environment;

//Author: Aaron Gerber
//Gives a base to the states that monsters will be using for their AI

public class MonsterState
{
	protected Monster monster;
	protected int hpAtChangeState;
	protected boolean playerFound;
	protected Cell playerLoc;

	//Allows the states to changes
	public void changeState(MonsterState s)
	{
		monster.changeState(s);
		hpAtChangeState = monster.getCurhp();	//So that passive doesn't exit itself immediately 
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

		// Checks for out of bounds exceptions and for player location
		// that are north of the monster
		if (mY - 1 > 0)
		{
			if (Environment.getCell(mY - 1, mX).getLifeForm() != null
					&& Environment.getCell(mY - 1, mX).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY - 1, mX);
				return;
			} else if (mY - 2 > 0)
			{
				if (Environment.getCell(mY - 2, mX).getLifeForm() != null
						&& Environment.getCell(mY - 2, mX).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY - 2, mX);
					return;
				} else if (mY - 3 > 0)
				{
					if (Environment.getCell(mY - 3, mX).getLifeForm() != null
							&& Environment.getCell(mY - 3, mX).getLifeForm().getClass() == Player.class)
					{
						playerFound = true;
						playerLoc = Environment.getCell(mY - 3, mX);
						return;
					}
				}
			}

		}

		// Checks for out of bounds exceptions and for player location that
		// are north-east of the monster
		if (mY - 1 > 0 && mX + 1 < boundryX && playerFound == false)
		{
			if (Environment.getCell(mY - 1, mX + 1).getLifeForm() != null
					&& Environment.getCell(mY - 1, mX + 1).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY - 1, mX + 1);
				return;
			} else if (mY - 2 > 0)
			{
				if (Environment.getCell(mY - 2, mX + 1).getLifeForm() != null
						&& Environment.getCell(mY - 2, mX + 1).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY - 2, mX + 1);
					return;
				}
			} else if (mX + 2 < boundryX)
			{
				if (Environment.getCell(mY - 1, mX + 2).getLifeForm() != null
						&& Environment.getCell(mY - 1, mX + 2).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY - 1, mX + 2);
					return;
				}
			}
		}
		// Checks for out of bounds exceptions and for player location that
		// are east of the monster
		if (mX + 1 < boundryX && playerFound == false)
		{
			if (Environment.getCell(mY, mX + 1).getLifeForm() != null
					&& Environment.getCell(mY , mX+1).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY, mX + 1);
				return;
			} else if (mX + 2 < boundryX)
			{
				if (Environment.getCell(mY, mX + 2).getLifeForm() != null
						&& Environment.getCell(mY, mX + 2).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY, mX + 2);
					return;
				} else if (mX + 3 < boundryX)
				{
					if (Environment.getCell(mY, mX + 3).getLifeForm() != null
							&& Environment.getCell(mY, mX + 3).getLifeForm().getClass() == Player.class)
					{
						playerFound = true;
						playerLoc = Environment.getCell(mY, mX + 3);
						return;
					}
				}
			}
		}
		// Checks for out of bounds exceptions and for player location that
		// are south-east of the monster
		if (mY + 1 < boundryY && mX + 1 < boundryX && playerFound == false)
		{
			if (Environment.getCell(mY + 1, mX + 1).getLifeForm() != null
					&& Environment.getCell(mY + 1, mX + 1).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY + 1, mX + 1);
				return;
			} else if (mY + 2 < boundryY)
			{
				if (Environment.getCell(mY + 2, mX + 1).getLifeForm() != null
						&& Environment.getCell(mY + 2, mX + 1).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY + 2, mX + 1);
					return;
				}
			} else if (mX + 2 < boundryX)
			{
				if (Environment.getCell(mY + 1, mX + 2).getLifeForm() != null
						&& Environment.getCell(mY + 1, mX + 2).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY + 1, mX + 2);
					return;
				}
			}
		}
		// Checks for out of bounds exceptions and for player location
		// that are south of the monster
		if (mY + 1 < boundryY && playerFound == false)
		{
			if (Environment.getCell(mY+1, mX).getLifeForm() != null
					&& Environment.getCell(mY + 1, mX).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY + 1, mX);
				return;
			} else if (mY + 2 < boundryY)
			{
				if (Environment.getCell(mY + 2, mX).getLifeForm() != null
						&& Environment.getCell(mY + 2, mX).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY + 2, mX);
					return;
				} else if (mY + 3 < boundryY)
				{
					if (Environment.getCell(mY + 3, mX).getLifeForm() != null
							&& Environment.getCell(mY + 3, mX).getLifeForm().getClass() == Player.class)
					{
						playerFound = true;
						playerLoc = Environment.getCell(mY + 3, mX);
						return;
					}
				}
			}
		}
		// Checks for out of bounds exceptions and for player location that
		// are south-west of the monster
		if (mY + 1 < boundryY && mX - 1 > 0 && playerFound == false)
		{
			if (Environment.getCell(mY + 1, mX - 1).getLifeForm() != null
					&& Environment.getCell(mY + 1, mX - 1).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY + 1, mX - 1);
				return;
			} else if (mY + 2 < boundryY)
			{
				if (Environment.getCell(mY + 2, mX - 1).getLifeForm() != null
						&& Environment.getCell(mY + 2, mX - 1).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY + 2, mX - 1);
					return;
				}
			} else if (mX - 2 > 0)
			{
				if (Environment.getCell(mY + 1, mX - 2).getLifeForm() != null
						&& Environment.getCell(mY + 1, mX - 2).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY + 1, mX - 2);
					return;
				}
			}
		}
		// Checks for out of bounds exceptions and for player location that
		// are west of the monster
		if (mX - 1 > 0 && playerFound == false)
		{
			if (Environment.getCell(mY, mX - 1).getLifeForm() != null
					&& Environment.getCell(mY, mX - 1).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY, mX - 1);
				return;
			} else if (mX - 2 > 0)
			{
				if (Environment.getCell(mY, mX - 2).getLifeForm() != null
						&& Environment.getCell(mY, mX - 2).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY, mX - 2);
					return;
				} else if (mX - 3 > 0)
				{
					if (Environment.getCell(mY, mX - 3).getLifeForm() != null
							&& Environment.getCell(mY, mX - 3).getLifeForm().getClass() == Player.class)
					{
						playerFound = true;
						playerLoc = Environment.getCell(mY, mX - 3);
						return;
					}
				}
			}
		}
		// Checks for out of bounds exceptions and for player location that
		// are north-west of the monster
		if (mY - 1 > 0 && mX - 1 > 0 && playerFound == false)
		{
			if (Environment.getCell(mY - 1, mX - 1).getLifeForm() != null
					&& Environment.getCell(mY - 1, mX - 1).getLifeForm().getClass() == Player.class)
			{
				playerFound = true;
				playerLoc = Environment.getCell(mY - 1, mX - 1);
				return;
			} else if (mY - 2 > 0)
			{
				if (Environment.getCell(mY - 2, mX - 1).getLifeForm() != null
						&& Environment.getCell(mY - 2, mX - 1).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY - 2, mX - 1);
					return;
				}
			} else if (mX - 2 > 0)
			{
				if (Environment.getCell(mY - 1, mX - 2).getLifeForm() != null
						&& Environment.getCell(mY - 1, mX - 2).getLifeForm().getClass() == Player.class)
				{
					playerFound = true;
					playerLoc = Environment.getCell(mY - 1, mX - 2);
					return;
				}
			}
		}
	}

	//Moves the monster towards the player if there is an empty cell closer, or if not will move randomly
	protected void moveTowardPlayer()
	{
		if(playerLoc!=null)
		{
			Cell north = Environment.getCell(monster.getCell().getyLoc()-1, monster.getCell().getxLoc());
			Cell east = Environment.getCell(monster.getCell().getyLoc(), monster.getCell().getxLoc()+1);
			Cell south = Environment.getCell(monster.getCell().getyLoc()+1, monster.getCell().getxLoc());
			Cell west = Environment.getCell(monster.getCell().getyLoc()-1, monster.getCell().getxLoc());

			boolean moved = false;

			//Checks if the player is north of the monster
			if(monster.getCell().getyLoc()>playerLoc.getyLoc())
			{
				if(north.getRep()!='#'&&north.getLifeForm()==null)
				{
					monster.moveLifeForm(north);
					moved = true;
				}
			}
			//Checks if the player is east of the monster
			else if(monster.getCell().getxLoc()<playerLoc.getxLoc())
			{
				if(east.getRep()!='#'&&east.getLifeForm()==null)
				{
					monster.moveLifeForm(east);
					moved = true;
				}
			}
			//Checks if the player is south of the monster
			else if(monster.getCell().getyLoc()<playerLoc.getyLoc())
			{
				if(south.getRep()!='#'&&south.getLifeForm()==null)
				{
					monster.moveLifeForm(south);
					moved = true;
				}
			}	
			//Checks if the player is west of the monster
			else if(monster.getCell().getxLoc()>playerLoc.getxLoc())
			{
				if(west.getRep()!='#'&&south.getLifeForm()==null)
				{
					monster.moveLifeForm(west);
					moved = true;
				}
			}

			if(moved==false)
			{
				MoveRandomly();
			}
		}
	}

	//Moves the monster in a random direction
	protected void MoveRandomly()
	{
		Random ran = new Random();

		Cell north = Environment.getCell(monster.getCell().getyLoc()-1, monster.getCell().getxLoc());
		Cell east = Environment.getCell(monster.getCell().getyLoc(), monster.getCell().getxLoc()+1);
		Cell south = Environment.getCell(monster.getCell().getyLoc()+1, monster.getCell().getxLoc());
		Cell west = Environment.getCell(monster.getCell().getyLoc()-1, monster.getCell().getxLoc());

		boolean moved = false;

		//Will attempt to move 10 times before failing to move; to prevent an infinite loop from occurring
		for(int count = 0; count<10||moved==false; count++)
		{
			int direction = ran.nextInt(4)+1;

			switch(direction)
			{
			case 1:
				if(north.getRep()!='#'&&north.getLifeForm()==null)
				{
					monster.moveLifeForm(north);
					moved = true;
				}
				break;
			case 2:
				if(east.getRep()!='#'&&east.getLifeForm()==null)
				{
					monster.moveLifeForm(east);
					moved = true;
				}
				break;
			case 3:
				if(south.getRep()!='#'&&south.getLifeForm()==null)
				{
					monster.moveLifeForm(south);
					moved = true;
				}
				break;
			case 4:
				if(west.getRep()!='#'&&west.getLifeForm()==null)
				{
					monster.moveLifeForm(west);
					moved = true;
				}
				break;
			default:
				break;
			}		
		}
	}

	//Determines the distance between the player and the monster
	protected int getDistance()
	{
		int mX = monster.getCell().getxLoc();
		int mY = monster.getCell().getyLoc();
		int pX = playerLoc.getxLoc();
		int pY = playerLoc.getyLoc();
		int Distance = 0;


		if(mX>pX)
			Distance = mX-pX;
		else
			Distance = pX-mX;

		if(mY>pY)
			Distance = Distance + (mY-pY);
		else
			Distance = Distance + (pY-mY);

		return Distance;
	}

	public void attachMonster(Monster m)
	{
		monster = m;
		hpAtChangeState = monster.getCurhp();
	}
}
