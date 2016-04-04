package item;

import itemprefixes.ItemPrefixes;
import material.Material;

public class Arms extends BodyPart
{

	public Arms(ItemPrefixes prefix, Material material, String name)
	{
		super(prefix, material, name);
		type = 2;
	}
	
	public static String getBodyPart(){
		return "Arms";
	}
}
