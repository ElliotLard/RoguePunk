package lifeform;

import item.*;

public class Monster extends LifeForm
{
	//Difficulty can never be 0
	int difficulty;
	
	public Monster(String name, char rep, Item head, Item torso, Item arms,
			Item legs)
	{
		super(name, rep, head, torso, arms, legs);
		
	}
	
	public Monster()
	{
		difficulty = 1;
		
		Item head = new BodyPart(0);
		Item torso = new BodyPart(1);
		Item arms = new BodyPart(2);
		Item legs = new BodyPart(3);
		Bodyparts.add(head);
		Bodyparts.add(torso);
		Bodyparts.add(arms);
		Bodyparts.add(legs);
		
		//Sets the monsters default stats; THEY WILL VARY EACH TIME
		str = (head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR())/(10/difficulty);
		spd = (head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD())/(10/difficulty);
		hp[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP())/(5/difficulty);
		hp[1] = hp[0];
		ap[0] = 1;
		ap[1] = ap[0];
	}
}
