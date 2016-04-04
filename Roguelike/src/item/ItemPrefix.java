package item;

public class ItemPrefix
{
	String prefName;
	int strength, hitPoints, weight;
	
	public ItemPrefix (String name, int str, int hp, int w){
		prefName = name + " ";
		strength = str;
		hitPoints = hp;
		weight = w;
	}
		
	
	public String getPrefix()
	{
		return prefName;
	}

	public int addStrength()
	{
		return strength;
	}

	public int addHitPoints()
	{
		return hitPoints;
	}

	public int addWeight()
	{
		return weight;
	}
}

