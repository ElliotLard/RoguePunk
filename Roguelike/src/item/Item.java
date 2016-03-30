package item;

public abstract class Item
{
	int weight, type;
	String name, description;
	
	public Item(int t, String n, String w)
	{
		name = n;type = t; weight = Integer.parseInt(w);
	}
	public Item()
	{
		
	}
	public String toString()
	{
		return name;
	}
}
