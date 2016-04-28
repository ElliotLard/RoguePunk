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
	ArrayList<Item> Bodyparts = new ArrayList<Item>(); // Head, Torso, Arms, Legs
	ArrayList<Item> Inventory = new ArrayList<Item>();
	
	int str, spd;
	char rep; // How the LifeForm will appear on screen.
	String myName;
	
	Cell location;
	
	/**
	 * Every LifeForm spawns with 4 items equipped.
	 * @param name
	 * @param rep
	 * @param health
	 * @param strength
	 * @param speed
	 */
	public LifeForm(String name, char rep, Item head, Item torso, Item arms,
			Item legs)
	{
		hp[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP());
		hp[1] = hp[0];
	}
	
	public LifeForm(){}
	
	/**
	 * This is mostly Commands.
	 * @param i
	 */
	
	public void pickUp(Item i){
		Inventory.add(i);
	}
	
	public Item dropItem(int loc, Item i){
		for (int x = 0; x < Inventory.size(); x++)
		{
			if (i == Inventory.get(x)){
				Inventory.remove(i);
				return i;
			}
		}
		return null;
		
	}
	
	public void equipPart(Item i){
		Bodyparts.add(i);
	}
	
	/**
	 * Once items are implemented we will use this
	 * method to update stats.
	 */
	public void updateStats(){
		
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

	public void move(int key){
		
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
