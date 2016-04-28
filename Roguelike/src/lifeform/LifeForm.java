package lifeform;

import java.util.ArrayList;

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

public abstract class LifeForm implements RoundObserver
{
	int[] HP = new int[2]; // [0] is current HP, [1] is max HP
	int[] AP = new int[2]; // [0] is current AP, [1] is max AP
	ArrayList<Item> Bodyparts = new ArrayList<Item>(); // Head, Torso, Arms, Legs
	ArrayList<Item> Inventory = new ArrayList<Item>();
	
	int STR, SPD;
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
		HP[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP());
		HP[1] = HP[0];
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
		HP[0] -= damage;
		if(HP[0]<0)
			HP[0]=0;
		if(HP[0]>HP[1])
			HP[0] = HP[1];
	}
	
	/**
	 * Round Observer method
	 */
	public void updateRound(int round){
		if (round % 1 == 0){
			AP[0] = AP[1];
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
	
	public int getCurHP()
	{
		return HP[0];
	}
	
	public int getMaxHP()
	{
		return HP[1];
	}
}
