package item;

public class HealingItem extends Item
{
	int hpRestore;
	
	public HealingItem(int r, int u, String n, String d, int hp)
	{
		super(n,d,r,u);
		hpRestore = hp*-1;
		
	}
	
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
