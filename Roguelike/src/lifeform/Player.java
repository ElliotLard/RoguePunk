package lifeform;
import environment.*;
import item.*;

public class Player extends LifeForm
{

	/**
	 * @author Christopher Wilson
	 */
	public Player(String name, char rep, int health, int strength, int speed)
	{
		super();
	}
	
	public Player(){
		super();
		myName = "Popskonovich";
		rep = '@';
		
		BodyPart starterHead = new BodyPart(0);
		BodyPart starterTorso = new BodyPart(1);
		BodyPart starterArms = new BodyPart(2);
		BodyPart starterLegs = new BodyPart(3);
		head = starterHead;
		torso = starterTorso;
		arms = starterArms;
		legs = starterLegs;
		
		str = (head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR());
		spd = (head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD());
		hp[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP());
		hp[1] = hp[0];
		ap[0] = 1;
		ap[1] = ap[0];
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
			if (up.getRep()!='#'){
				if(up.getLifeForm()!=null)
					up.getLifeForm().takeDamage(calcDamage());
				else
					moveLifeForm(up);
			}
		}
		else if (key == 's')
		{
			Cell down = Environment.getCell(this.getyLocation()+1, this.getxLocation());
			if(down.getRep()!='#'){
				if(down.getLifeForm()!=null)
					down.getLifeForm().takeDamage(calcDamage());
				else
					moveLifeForm(down);
			}
		}
		else if (key == 'a')
		{
			Cell left = Environment.getCell(this.getyLocation(), this.getxLocation()-1);
			if(left.getRep()!='#'){
				if(left.getLifeForm()!=null)
					left.getLifeForm().takeDamage(calcDamage());
				else
					moveLifeForm(left);
			}
		}
		else if (key == 'd')
		{
			Cell right = Environment.getCell(this.getyLocation(), this.getxLocation()+1);
			if(right.getRep()!='#'){
				if(right.getLifeForm()!=null)
					right.getLifeForm().takeDamage(calcDamage());
				else
					moveLifeForm(right);
			}
		}
	}
}