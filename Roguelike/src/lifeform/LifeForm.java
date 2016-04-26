package lifeform;

import java.util.ArrayList;

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
	int[] healthPoints = new int[2]; // [0] is current HP, [1] is max HP
	int[] actionPoints = new int[2]; // [0] is current AP, [1] is max AP
	ArrayList<Item> Bodyparts; // Head, Torso, Arms, Legs
	ArrayList<Item> Inventory;
	
	int strength, speed;
	char rep; // How the LifeForm will appear on screen.
	String myName;
	
	/**
	 * Every LifeForm spawns with 4 items equipped.
	 * @param name
	 * @param rep
	 * @param health
	 * @param strength
	 * @param speed
	 * @param head
	 * @param torso
	 * @param arms
	 * @param legs
	 */
	public LifeForm(String name, char rep, int health, int strength, int speed)
	{
		for (int x = 0; x < healthPoints.length; x++)
		{
			healthPoints[x] = health;
		}
	}
	
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
		healthPoints[0] -= damage;
	}
	
	/**
	 * Round Observer method
	 */
	public void updateRound(int round){
		if (round % 1 == 0){
			actionPoints[0] = actionPoints[1];
		}
	}

	public void move(int key)
	{
		// TODO Auto-generated method stub
		
	}
}
