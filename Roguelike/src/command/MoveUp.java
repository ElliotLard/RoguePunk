package command;

import lifeform.LifeForm;

public class MoveUp implements Command
{
	private LifeForm lifeForm;
	public MoveUp(LifeForm l)
	{
		lifeForm = l;
	}
	
	public void execute()
	{
		lifeForm.move(lifeForm.getCell().yLoc()-1, lifeForm.getCell().xLoc());
	}

}
