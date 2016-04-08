package item;

public abstract class Item
{
	int weight, type;
	String name, description, rep;
	
	public Item(int t, String n, String w)
	{
		name = n;type = t; weight = Integer.parseInt(w);
		rep = "|";
	}
	public Item()
	{
		
	}
	public String toString()
	{
		return name;
	}
	public int getType()
	{
		return type;
	}
	public String displayString()
	{
		return rep;
	}
}
