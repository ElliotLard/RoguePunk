package item;

public class ItemPrefix
{
	String name;
	int strength, hitPoints, weight;
	
	public ItemPrefix (String n, int str, int hp, int w){
		name = n;
		strength = str;
		hitPoints = hp;
		weight = w;
	}
	public ItemPrefix (String name, String str, String hp, String w){
		this(name, Integer.parseInt(str), Integer.parseInt(hp), Integer.parseInt(w));
	}
		
	
	public String getName()
	{
		return name;
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

