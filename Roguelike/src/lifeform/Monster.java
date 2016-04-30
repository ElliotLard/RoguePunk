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
		
		BodyPart head = new BodyPart(0);
		BodyPart torso = new BodyPart(1);
		BodyPart arms = new BodyPart(2);
		BodyPart legs = new BodyPart(3);
		equipPart(head);
		equipPart(torso);
		equipPart(arms);
		equipPart(legs);
		
		//Sets the monsters default stats; THEY WILL VARY EACH TIME
		str = (head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR())/(10/difficulty);
		spd = (head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD())/(10/difficulty);
		hp[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP())/(5/difficulty);
		hp[1] = hp[0];
		ap[0] = 1;
		ap[1] = ap[0];
	}
}
