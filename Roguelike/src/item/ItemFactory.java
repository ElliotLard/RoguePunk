package item;

import itemprefixes.GoblinPrefix;
import itemprefixes.ItemPrefixes;
import material.Brass;
import material.Material;

public class ItemFactory
{
	public BodyPart makePart(String prefix, String mats, String type){
		ItemPrefixes pref = null;
		Material material = null;
		BodyPart part = null;
		
		if(prefix == "Goblin"){
			pref = new GoblinPrefix();
		}
		
		if(mats == "Brass"){
			material = new Brass();
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
