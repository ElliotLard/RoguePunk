package item;

//Author: Aaron Gerber
//Heals the life form that picks the item up by hitting them with negative points of damage

public class HealingItem extends Item
{
	private int hpRestore;
	
	//A fully customizable healing item
	public HealingItem(int r, int u, String n, String d, int hp)
	{
		super(n,d,r,u);
		hpRestore = hp*-1;
		
	}
	
	//A default constructor
	public HealingItem()
	{
		super("Healing Potion","Heals the user",1,3);
		hpRestore = -5;
	}

	@Override
	public void UseItem()
	{
		if(uses>0)
		{
			hold.takeDamage(hpRestore);
			uses--;
		}
	}

}
