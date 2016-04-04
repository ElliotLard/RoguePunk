package item;

import itemprefixes.ItemPrefixes;
import material.Material;

public class Torso extends BodyPart
{
	public Torso(ItemPrefixes prefix, Material material, String name)
	{
		super(prefix, material, name);
		type = 1;
	}
	
	public static String getBodyPart(){
		return "Chasis";
	}
}
