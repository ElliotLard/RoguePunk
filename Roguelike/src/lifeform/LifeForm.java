package lifeform;

import java.util.ArrayList;

import GUI.Displayable;
import environment.Cell;
import gameplay.RoundObserver;
import item.BodyPart;
import item.Item;

/**
 * 
 * @author Christopher Wilson
 * Class provides base stats and characteristics of all
 * LifeForms in the game.
 *
 */

public abstract class LifeForm implements RoundObserver, Displayable
{
	int[] hp = new int[2]; // [0] is current hp, [1] is max hp
	int[] ap = new int[2]; // [0] is current ap, [1] is max ap
	BodyPart head, torso, arms, legs;
	
	int str, spd;
	char rep; // How the LifeForm will appear on screen.
	String myName;
	
	Cell location; // Location of the player
	
	/**
	 * Every LifeForm spawns with 4 items equipped.
	 * @param name
	 * @param rep
	 * @param health
	 * @param strength
	 * @param speed
	 */
	public LifeForm(String name, char rep, Item h, Item t, Item a,
			Item l)
	{
		hp[0] = (h.getHP()+t.getHP()+a.getHP()+l.getHP());
		hp[1] = hp[0];
		str = h.getSTR()+t.getSTR()+a.getSTR()+l.getSTR();
		spd = h.getSPD()+t.getSPD()+a.getSPD()+l.getSPD();
	}
	
	public LifeForm(){}
	
	/**
	 * This is mostly Commands.
	 * @param i
	 */
	
	public void pickUp(Cell loc, Item i){
		
	}
	
	public Item dropItem(Cell loc, Item i){
		return i;
		
	}
	
	public void equipPart(BodyPart i){
		if (i.getBodySlot() == 0){
			head = i;
		} else if (i.getBodySlot() == 1){
			torso = i;
		} else if (i.getBodySlot() == 2){
			arms = i;
		} else if (i.getBodySlot() == 3){
			legs = i;
		}
		updateStats();
	}
	
	/**
	 * Once items are implemented we will use this
	 * method to update stats.
	 */
	public void updateStats(){
		hp[1] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP());
		str = head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR();
		spd = head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD();
	}
	
	/**
	 * Generic damage calculation
	 * @param damage
	 */
	public void takeDamage(int damage){
		hp[0] -= damage;
		if(hp[0]<0)
			hp[0]=0;
		if(hp[0]>hp[1])
			hp[0] = hp[1];
	}
	
	/**
	 * Round Observer method
	 */
	public void updateRound(int round){
		if (round % 1 == 0){
			ap[0] = ap[1];
		}
	}
	
	public void moveLifeForm(Cell c)
	{
		if (location != null)
			location.removeLifeForm();
		location = c;
		c.addLifeForm(this);
	}
	
	public Cell getCell(){
		return location;
	}
	
	public int getyLocation()
	{
		return location.getyLoc();
	}

	public int getxLocation()
	{
		return location.getxLoc();
	}
	
	public int getCurhp()
	{
		return hp[0];
	}
	
	public int getMaxhp()
	{
		return hp[1];
	}
	
	@Override
	public char getRep()
	{
		return rep;
	}
}
