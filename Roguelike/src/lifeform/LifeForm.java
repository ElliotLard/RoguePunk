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
	public LifeForm(String name, char rep, Item head, Item torso, Item arms,
			Item legs)
	{
		hp[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP());
		hp[1] = hp[0];
	}
	
	public LifeForm(){}
	
	/**
	 * Passes the item on the ground to be equipped
	 * then removes the item from the ArrayList in the
	 * cell.
	 * @param loc
	 * @param i
	 */
	public void pickUp(Cell loc, BodyPart i){
		equipPart(i);
		loc.removeItem(i);
	}
	
	/**
	 * Adds the item in to the ArrayList of the Cell
	 * to be on the ground.
	 * @param loc
	 * @param i
	 */
	public void dropItem(Cell loc, BodyPart i){
		loc.addItem(i);	
	}
	
	/**
	 * When a BodyPart is equipped it checks for each BodySlot
	 * value and equips it in the proper item slot. It then
	 * drops whichever item was just replaced on to the ground.
	 * 
	 * It then updates the stats of the LifeForm
	 * @param i
	 */
	public void equipPart(BodyPart i){
		if (i.getBodySlot() == 0){
			head = i;
			dropItem(location, head);
		} else if (i.getBodySlot() == 1){
			torso = i;
			dropItem(location, torso);
		} else if (i.getBodySlot() == 2){
			arms = i;
			dropItem(location, arms);
		} else if (i.getBodySlot() == 3){
			legs = i;
			dropItem(location, legs);
		}
		updateStats();
	}
	
	/**
	 * Reads the values of each item and updates the players stats accordingly.
	 */
	public void updateStats(){
		str = (head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR());
		spd = (head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD());
		hp[0] = (head.getHP()+torso.getHP()+arms.getHP()+legs.getHP());
		hp[1] = hp[0];
		ap[0] = 1;
		ap[1] = ap[0];

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
	/**
	 * Gives the LifeForm a cell to move to
	 * it checks to make sure the cell is not
	 * null, removes the LifeForm, and adds
	 * the LifeForm in to the new cell.
	 * 
	 * This lets LifeForm keep track of its location.
	 * @param c
	 */
	
	public void moveLifeForm(Cell c)
	{
		if (location != null)
			location.removeLifeForm();
		location = c;
		c.addLifeForm(this);
	}
	
	/**
	 * Returns the location of the LifeForm
	 * @return
	 */
	public Cell getCell(){
		return location;
	}
	
	/**
	 * Gets the Y value of the location coords
	 * @return
	 */
	public int getyLocation()
	{
		return location.getyLoc();
	}
	
	/**
	 * Gets the X value of the location coords
	 * @return
	 */
	public int getxLocation()
	{
		return location.getxLoc();
	}
	
	/**
	 * These methods return the current and max health of a lifeForm
	 * @return
	 */
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
