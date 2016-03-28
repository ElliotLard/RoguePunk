package item;

public class Item
{
	int weight, type;
	String name;
	char rep;
	
	public Item(String n, int t, char r, int w)
	{
		name = n;
		type = t;
		rep = r;
		weight = w;
	}
	public Item(String n, int t, char r)
	{
		this(n, t, r, 5);
	}
	public Item(String n, int t)
	{
		this(n, t, '%', 5);
	}
	public Item(String n)
	{
		this(n, -1, '%', 5);
	}
	public Item()
	{
		this("unnamed", -1, '%', 5);
	}
}
