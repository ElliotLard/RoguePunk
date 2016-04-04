package environment;

import lifeform.LifeForm;
import java.util.ArrayList;

import GUI.GUIConstants;
import item.BodyPart;
import item.Item;


public class Cell
{	
	int xLoc, yLoc;
	LifeForm inhabitant;
	private ArrayList<BodyPart> onGround;
	public String rep;
	int type;
	public Cell(int y, int x)
	{
		yLoc = y;
		xLoc = x;
		onGround = new ArrayList<BodyPart>();
		type = 2;
	}
	public Cell(int y, int x, int t)
	{
		yLoc = y;
		xLoc = x;
		onGround = new ArrayList<BodyPart>();
		type = t;
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
	public void removeLifeForm()
	{
		inhabitant = null;
	}
	public void addItem(BodyPart i)
	{
		onGround.add(i);
	}
	public void removeItem(BodyPart i)
	{
		onGround.remove(i);
	}
	public int yLoc()
	{
		return yLoc;
	}
	public int xLoc()
	{
		return xLoc;
	}
	
	public String displayString()
	{
		if(inhabitant!= null)
			return inhabitant.displayString();
		else if(onGround.size()>0)
			return onGround.get(0).displayString();
		switch(type)
		{
			case GUIConstants.WALL:
				return "#";
			case GUIConstants.EMPTY:
				return ".";
			case GUIConstants.NULL:
				return "%";
		}
		return "!";
	}
}
