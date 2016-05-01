package environment;

import lifeform.LifeForm;
import java.util.ArrayList;
import GUI.Displayable;
import item.BodyPart;
import item.Item;


public class Cell implements Displayable
{	
	int xLoc, yLoc;
	LifeForm inhabitant;
	private ArrayList<Item> onGround = new ArrayList<Item>();;
	char rep;
	/**
	 * @author elliotlard
	 * 
	 * initiates a cell with an x and y location
	 * 
	 * @param  y	the y index of the cell to be created
	 * @param  x	the x index of the cell to be created
	 */
	public Cell(int y, int x, char r)
	{
		yLoc = y;
		xLoc = x;
		rep = r;
	}
	public Cell()
	{
	}
	
	/**
	 * @author elliotlard
	 * 
	 * Adds a LifeForm to the cell if it is not already holding one.
	 * 
	 * @param  lifeForm	the LifeForm you wish to add to the cell
	 */
	public void addLifeForm(LifeForm lifeForm)
	{
		if(inhabitant == null)
			inhabitant = lifeForm;
		else
			System.out.println("cell occupied");
	}
	
	/**
	 * @author elliotlard
	 * 
	 * removes the LifeForm from the cell if there is one in it.
	 */
	public void removeLifeForm()
	{
		inhabitant = null;
	}
	
	/**
	 * @author elliotlard
	 * 
	 * adds the desired item to the ground
	 * 
	 * @param  i	the item you wish to add to the cell
	 */
	public void addItem(Item i)
	{
		onGround.add(i);
	}
	
	/**
	 * @author elliotlard
	 * 
	 * removes a specific item from the ground
	 * 
	 * @param  i	the item to be taken off the ground
	 */
	public void removeItem(Item i)
	{
		onGround.remove(i);
	}
	
	/**
	 * @author elliotlard
	 * 
	 * @return      the y index of this cell
	 */
	public int getyLoc()
	{
		return this.yLoc;
	}
	
	/**
	 * @author elliotlard
	 * 
	 * @return      the x index of this cell
	 */
	public int getxLoc()
	{
		return this.xLoc;
	}
	/**
	 * @author elliotlard
	 * 
	 * @return		the character that will be used to display
	 * 				this character
	 */
	@Override
	public char getRep()
	{
		if(inhabitant != null)
			return inhabitant.getRep();
		return rep;
	}
	
	/**
	 * @author elliotlard
	 * 
	 * @return		the lifeForm that is in the cell	
	 */
	public LifeForm getLifeForm()
	{
		return inhabitant;
	}
	
	/**
	 * @author elliotlard
	 * 
	 * @param i		index of the item you want
	 * @return		the item at that index
	 */
	public Item getItem(int i)
	{
		if(onGround.isEmpty())
			return null;
		return onGround.get(0);
	}
}
