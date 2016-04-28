package lifeform;

import GUI.DisplayState;
import environment.Cell;
import environment.Environment;
import item.BodyPart;
import item.Item;

public class Player extends LifeForm
{
	DisplayState state;
	Item head, torso, arms, legs;

	public Player(String name, char rep, int health, int strength, int speed)
	{
		super();
	}
	
	public Player(){
		super();
		
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
	 * Gets a keyboard value in int form and 
	 * will move in whatever direction.
	 * @param key
	 */

	@Override
	public void move(int key){
		state.updateGame();
		if (key == 38) // 38 Value for UP
		{
			Cell up = Environment.getCell(this.getyLocation(), this.getxLocation()+1);
			moveLifeForm(up);
			System.out.println("Up");
		}
		else if (key == 40) // 40 Value for Down
		{
			Cell down = Environment.getCell(this.getyLocation(), this.getxLocation()-1);
			moveLifeForm(down);
			System.out.println("Down");
		}
		else if (key == 37) // 37 Value for Left
		{
			Cell left = Environment.getCell(this.getyLocation()-1, this.getxLocation());
			moveLifeForm(left);
			System.out.println("Left");
		}
		else if (key == 39) // 39 Value for Right
		{
			Cell right = Environment.getCell(this.getyLocation()+1, this.getxLocation());
			moveLifeForm(right);
			System.out.println("Right");
		}
	}
	
	public void setState(DisplayState s)
	{
		state = s;
	}
}