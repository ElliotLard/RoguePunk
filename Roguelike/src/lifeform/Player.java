package lifeform;
import environment.Cell;
import environment.Environment;
import item.BodyPart;
import item.Item;

public class Player extends LifeForm
{
	Item head, torso, arms, legs;

	public Player(String name, char rep, int health, int strength, int speed)
	{
		super();
	}
	
	public Player(){
		super();
		rep = '@';
		
		BodyPart starterHead = new BodyPart(0);
		BodyPart starterTorso = new BodyPart(1);
		BodyPart starterArms = new BodyPart(2);
		BodyPart starterLegs = new BodyPart(3);
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

	public void move(char key){
		if (key == 'w')
		{
			Cell up = Environment.getCell(this.getyLocation()-1, this.getxLocation());
			moveLifeForm(up);
		}
		else if (key == 's')
		{
			Cell down = Environment.getCell(this.getyLocation()+1, this.getxLocation());
			moveLifeForm(down);
		}
		else if (key == 'a')
		{
			Cell left = Environment.getCell(this.getyLocation(), this.getxLocation()-1);
			moveLifeForm(left);
		}
		else if (key == 'd')
		{
			Cell right = Environment.getCell(this.getyLocation(), this.getxLocation()+1);
			moveLifeForm(right);
		}
	}
}