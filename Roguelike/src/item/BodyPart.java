package item;

public class BodyPart
{
	int type;
	ItemMaterial mat = null;
	ItemPrefix pref = null;
	String partName = "";
	String part = "";
	String rep;
	int hp, strength, weight;

	
	public BodyPart(ItemPrefix prefix, ItemMaterial material, String name)
	{
		partName = name;
		mat = material;
		pref = prefix;
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
