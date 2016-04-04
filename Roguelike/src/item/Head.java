package item;

import itemprefixes.ItemPrefixes;
import material.Material;

public class Head extends BodyPart
{
	public Head(ItemPrefixes prefix, Material material, String name)
	{
		super(prefix, material, name);
		type = 0;
	}
	
	public static String getBodyPart(){
		return "Head";
	}
}
