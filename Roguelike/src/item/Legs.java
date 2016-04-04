package item;

import itemprefixes.ItemPrefixes;
import material.Material;

public class Legs extends BodyPart
{
	public Legs(ItemPrefixes prefix, Material material, String name)
	{
		super(prefix, material, name);
		type = 3;
	}
	
	public static String getBodyPart(){
		return "Legs";
	}
}
