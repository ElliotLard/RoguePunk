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
	
	/**
	 * In theory, this is getting a keyboard value in
	 * int form and will move in whatever direction.
	 * @param key
	 */
	@Override
	public void move(int key){
		if (key == 224) // 224 Value for UP
		{
			
		}
		else if (key == 225) // 225 Value for Down
		{
			
		}
		else if (key == 226) // 226 Value for Left
		{
			
		}
		else if (key == 227) // 227 Value for Right
		{
			
		}
	}
}