package item;

//Author: Aaron Gerber
//A material that can reinforce an item

public class Reinforcer extends Item
{

	int Modifier;
	
	//Allows the setting of the material
	public Reinforcer(String n, String d, int r, int u, int mod)
	{
		super(n, d, r, u);
		Modifier = mod;
	}
	
	//Sets the default for a material
	public Reinforcer()
	{
		super("Reinforcer","Makes an item stronger!", 3, 1);
		Modifier = 5;
	}

	@Override
	public void UseItem()
	{
		//Calls a gui to choose an item		
	}
	

	//Reinforces the item sent to the material
	public void ReinforceItem(Item item)
	{
		if(uses>0&&!(item.name.contains("+5")))
		{
			//Increases the strength of the item
			item.str+=Modifier;
			//For every 5 points it increases the hp stat on an item
			if(item.str==(item.hp+1)*5||item.str>(item.hp+1)*5)
				item.hp++;
			//For every 50 points of str + hp increases the spd by one
			if((item.str+item.hp)==(item.spd+1)*50||(item.str+item.hp)>(item.spd+1)*50)
				item.spd++;

			//Changes the name to fit the class of reinforcement it is
			if(item.name.contains("+1"))
				item.name = item.name.replace("+1", "+2");
			else if(item.name.contains("+2"))
				item.name = item.name.replace("+2", "+3");
			else if(item.name.contains("+3"))
				item.name = item.name.replace("+3", "+4");
			else if(item.name.contains("+4"))
				item.name = item.name.replace("+4", "+5");
			else
				item.name = item.name + " +1";
			
			uses--;
		}
	}

}
