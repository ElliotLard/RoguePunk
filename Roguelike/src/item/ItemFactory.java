package item;


public class ItemFactory
{
	public BodyPart makePart(String prefix, String mats, String type){
		ItemPrefix pref = null;
		ItemMaterial material = null;
		BodyPart part = null;
		
		if(prefix == "Goblin"){
			pref = new ItemPrefix("Goblin", 2, 2, 2);
		}
		
		if(mats == "Brass"){
			material = new ItemMaterial("Brass", 4, 4, 4);
		}
		if (type == "Arms"){
			String name = type;
			part = new BodyPart(pref, material, name);
		}
		if (type == "Legs"){
			String name = type;
			part = new BodyPart(pref, material, name);
		}
		if (type == "Head"){
			String name = type;
			part = new BodyPart(pref, material, name);
		}
		if (type == "Torso"){
			String name = type;
			part = new BodyPart(pref, material, name);
		}
		return part;
	}
}
