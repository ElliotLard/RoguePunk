package lifeform;

import item.Item;

public class Player extends LifeForm
{
	Item head, torso, arms, legs;

	public Player(String name, char rep, int health, int strength, int speed, Item head, Item torso, Item arms,
			Item legs)
	{
		super(name, rep, health, strength, speed, head, torso, arms, legs);
	}
	
	public Player(){
		super("Player", '@', 100, 10, 10, head, torso, arms, legs);
	}
}
