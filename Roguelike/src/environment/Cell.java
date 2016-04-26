package environment;

import lifeform.LifeForm;
import java.util.ArrayList;

import GUI.GUIConstants;
import GUI.displayable;
import item.Item;


public class Cell implements displayable
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
		if(inhabitant != null)
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
	 * @param  item	the item you wish to add to the cell
	 */
	public void addItem(Item item)
	{
		onGround.add(item);
	}
	
	/**
	 * @author elliotlard
	 * 
	 * removes a specific item from the ground
	 * 
	 * @param  item	the item to be taken off the ground
	 */
	public void removeItem(Item item)
	{
		onGround.remove(item);
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
	
	@Override
	public char getRep()
	{
		return rep;
	}
	public LifeForm getLifeForm()
	{
		return inhabitant;
	}
}
