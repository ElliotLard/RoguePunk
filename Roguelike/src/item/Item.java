package item;

import GUI.Displayable;

//Author: Aaron Gerber
//Description: Provides a base for all items to be able to work	

import lifeform.LifeForm;

public abstract class Item implements Displayable
{
	//All characteristics of items; set to protected so any Item can access them freely
	protected int str, hp, spd, rarity, uses;
	protected char rep;
	protected String name, description;
	protected LifeForm hold = null;
	
	//A Constructor for Items that is customizable; Stats cannot be customized
	public Item(String n, String d, int r, int u)
	{
		rarity  = r;
		uses = u;
		name = n;
		description = d;
		str = 0;
		hp = 0;
		spd = 0;
		rep = 'i';
	}
	
	public abstract void UseItem();
	
	
	//Uses a material to strengthen an item
	public void Strengthen(Reinforcer material)
	{
		material.ReinforceItem(this);
	}
	
	//All items have this
	public void PickedUp(LifeForm newHold)
	{
		hold = newHold;
		UseItem();
	}
	
	
	//Getters for testing purposes
	
	public int getSTR()
	{
		return str;
	}

	public int getHP()
	{
		return hp;
	}

	public int getSPD()
	{
		return spd;
	}

	public int getRarity()
	{
		return rarity;
	}

	public int getUses()
	{
		return uses;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}
	
	@Override
	public char getRep()
	{
		return rep;
	}
	
	
}
