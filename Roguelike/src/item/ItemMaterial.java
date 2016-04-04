package item;

public class ItemMaterial
{
	String matName;
	int strength, hitPoints, weight;
	
	public ItemMaterial(String name, int str, int hp, int w){
		matName = name + " ";
		strength = str;
		hitPoints = hp;
		weight = w;
	}
		
	
	public String getMaterial()
	{
		return matName;
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

