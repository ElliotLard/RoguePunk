package factories;

import java.util.ArrayList;

import item.ItemFactory;
import item.ItemPrefix;


public class ObjectLists
{

	private ItemFactory itemFactory = new ItemFactory();
	ArrayList<ItemPrefix> materialLists = itemFactory.make("Assets/Monsters");
}
