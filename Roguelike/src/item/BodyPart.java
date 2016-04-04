package item;

import itemprefixes.ItemPrefixes;
import material.Material;

public class BodyPart
{
	int type;
	Material mat = null;
	ItemPrefixes pref = null;
	String partName = "";
	String part = "";
	String rep;
	int speed, hp, strength, weight;

	
	public BodyPart(ItemPrefixes prefix, Material material, String name)
	{
		partName = name;
		mat = material;
		pref = prefix;
		speed = material.addSpeed() + prefix.addSpeed();
		hp = material.addHitPoints() + prefix.addHitPoints();
		strength = material.addStrength() + prefix.addStrength();
		weight = material.addWeight() + prefix.addWeight();
		rep = "|";
	}

	public int getType()
	{
		if (partName == "Head"){
			type = 0;
		}
		if (partName == "Torso"){
			type = 1;
		}
		if (partName == "Arms"){
			type = 2;
		}
		if (partName == "Legs"){
			type = 3;
		}
		return type;
	}
	
	public String getPartName(){
		part = part + pref.getPrefix() + mat.getMaterial() + partName;
		return part;
	}
	
	public String displayString()
	{
		return rep;
	}
}
