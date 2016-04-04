package item;

import itemprefixes.ItemPrefixes;
import material.Material;

public abstract class BodyPart
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
