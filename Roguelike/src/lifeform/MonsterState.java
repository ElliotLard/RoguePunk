package lifeform;

import javax.swing.JPanel;
import java.util.Random;
import GUI.DisplayState;

//Author: Aaron Gerber
//Gives a base to the states that monsters will be using for their AI

public class MonsterState
{
	public Monster monster;
	
	public void changeState(MonsterState s)
	{
		monster.changeState(s);
		s.activate();
	}

	public void activate()
	{
		//Default state does nothing
	}
}
