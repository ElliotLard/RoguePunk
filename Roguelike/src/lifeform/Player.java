package lifeform;

import item.BodyPart;
import item.Item;

public class Player extends LifeForm
{
	Item head, torso, arms, legs;

	public Player(String name, char rep, int health, int strength, int speed)
	{
		super(name, rep, health, strength, speed);
	}
	
	public Player(){
		super("Player", '@', 100, 10, 10);
		Item starterHead = new BodyPart();
		Item starterTorso = new BodyPart();
		Item starterArms = new BodyPart();
		Item starterLegs = new BodyPart();
		equipPart(starterHead);
		equipPart(starterTorso);
		equipPart(starterArms);
		equipPart(starterLegs);
	}
}
