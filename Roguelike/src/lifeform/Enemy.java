package lifeform;

import item.BodyPart;

public class Enemy extends LifeForm
{
	public Enemy(BodyPart h, BodyPart t, BodyPart a, BodyPart l, String d)
	{
		head = h;torso = t;arms = a;legs = l;description = d;
	}
	
	public String toString()
	{
		String s;
		s = head.toString() + "\n";
		s += torso.toString() + "\n";
		s += arms.toString() + "\n";
		s += legs.toString() + "\n";
		s += description;
		
		return s;
	}

	@Override
	public char getRep()
	{
		return rep;
	}
}
