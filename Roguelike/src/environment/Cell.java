package environment;

import lifeform.LifeForm;
import java.util.ArrayList;
import item.Item;


public class Cell
{	
	int xLoc, yLoc;
	LifeForm inhabitant;
	private ArrayList<Item> onGround;
	public Cell(int y, int x)
	{
		yLoc = y;
		xLoc = x;
		onGround = new ArrayList<Item>();
	}
	public Cell()
	{
		
	}
	
	public void addLifeForm(LifeForm l)
	{
		if(inhabitant != null)
			inhabitant = l;
		else
			System.out.println("cell occupied");
	}
	public void removeLifeForm(LifeForm l)
	{
		inhabitant = null;
	}
	public void addItem(Item i)
	{
		onGround.add(i);
	}
	public void removeItem(Item i)
	{
		onGround.remove(i);
	}
}
