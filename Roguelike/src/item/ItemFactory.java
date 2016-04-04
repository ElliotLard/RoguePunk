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
			String name = Arms.getBodyPart();
			part = new Arms(pref, material, name);
		}
		if (type == "Legs"){
			String name = Legs.getBodyPart();
			part = new Legs(pref, material, name);
		}
		if (type == "Head"){
			String name = Head.getBodyPart();
			part = new Head(pref, material, name);
		}
		if (type == "Chasis"){
			String name = Torso.getBodyPart();
			part = new Torso(pref, material, name);
		}
		return part;
	}
}
