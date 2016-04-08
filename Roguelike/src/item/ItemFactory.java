package item;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ItemFactory
{	
	/**
	 * 
	 * @param fileName
	 * @return
	 */
	@SuppressWarnings("resource")
	public ArrayList<ItemPrefix> make(String list)
	{
		ArrayList<ItemPrefix> prefixList = new ArrayList<ItemPrefix>();
		{
			try	
			{
	            Scanner input = new Scanner(System.in);
	            File file = new File(list);
	            input = new Scanner(file);
	            while (input.hasNextLine()) {
	            	ItemPrefix prefix;
	            	String[] lineSplit = new String[3];
	                String line = input.nextLine();
	                lineSplit = line.split(", ");
	                prefix = new ItemPrefix(lineSplit[0], lineSplit[1], lineSplit[2], lineSplit[3]);
	                prefixList.add(prefix);
	            }
	            input.close();
	        }
			catch (Exception ex) 
			{
	            ex.printStackTrace();
	        }
			return prefixList;
		}
	}
	
//	public BodyPart makePart(String prefix, String mats, String type){
//		ItemPrefix pref = null;
//		ItemMaterial material = null;
//		BodyPart part = null;
//		
//		if(prefix == "Goblin"){
//			pref = new ItemPrefix("Goblin", 2, 2, 2);
//		}
//		
//		if(mats == "Brass"){
//			material = new ItemMaterial("Brass", 4, 4, 4);
//		}
//		if (type == "Arms"){
//			String name = type;
//			part = new BodyPart(pref, material, name);
//		}
//		if (type == "Legs"){
//			String name = type;
//			part = new BodyPart(pref, material, name);
//		}
//		if (type == "Head"){
//			String name = type;
//			part = new BodyPart(pref, material, name);
//		}
//		if (type == "Torso"){
//			String name = type;
//			part = new BodyPart(pref, material, name);
//		}
//		return part;
//	}
}
