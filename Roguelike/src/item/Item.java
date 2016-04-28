package item;

//Author: Aaron Gerber
//Description: Provides a base for all items to be able to work	

import lifeform.LifeForm;

public abstract class Item
{
	//All characteristics of items; set to protected so any Item can access them freely
	protected int STR, HP, SPD, rarity, uses;
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
		STR = 0;
		HP = 0;
		SPD = 0;
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
	}
	
	
	//Getters for testing purposes
	
	public int getSTR()
	{
		return STR;
	}

	public int getHP()
	{
		return HP;
	}

	public int getSPD()
	{
		return SPD;
	}

	public int getRarity()
	{
		return rarity;
	}

	public int getUses()
	{
		return uses;
	}

	public char getRep()
	{
		return rep;
	}

	public String getName()
	{
		return name;
	}

	public String getDescription()
	{
		return description;
	}
	
	
}
