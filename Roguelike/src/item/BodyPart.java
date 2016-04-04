package item;

public class BodyPart
{
	final int HEAD = 0, TORSO = 1, ARMS = 3, LEGS = 3;
	int type;
	ItemPrefix prefix, material;
	String partName, name, rep;
	int hp, strength, weight;

	
	public BodyPart(ItemPrefix pref, ItemPrefix mat, String name)
	{
		partName = name;
		material = mat;
		prefix = pref;
		hp = material.addHitPoints() + prefix.addHitPoints();
		strength = material.addStrength() + prefix.addStrength();
		weight = material.addWeight() + prefix.addWeight();
		rep = "|";
		
		if (partName == "Head"){
			type = HEAD;
		}
		if (partName == "Torso"){
			type = TORSO;
		}
		if (partName == "Arms"){
			type = ARMS;
		}
		if (partName == "Legs"){
			type = LEGS;
		}
	}

	public int getType()
	{
		return type;
	}
	
	public String getName(){
		name = name + prefix.getName() + material.getName() + partName;
		return name;
	}
	
	public String displayString()
	{
		return rep;
	}
}
