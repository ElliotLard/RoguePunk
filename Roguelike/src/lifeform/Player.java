package lifeform;

import java.util.ArrayList;

import item.BodyPart;
import item.Item;

public class Player extends LifeForm
{
	static Player player;
	private ArrayList<Item> inventory;
	
	private Player()
	{
		super('@', "player");
		inventory = new ArrayList<Item>();
	}
	
	public static Player getPlayer()
	{
		if(player == null)
			player = new Player();
		return player;
	}
	
	public void pickup(Item i)
	{
		inventory.add(i);
		location.removeItem(i);
	}
	
	public void equip(BodyPart b)
	{
//		switch(b.getType())
//		{
//		case HEAD:
//			if(head != null)
//				inventory.add(head);
//			head = b;
//			break;
//		case TORSO:
//			if(torso != null)
//				inventory.add(torso);
//			torso = b;
//			break;
//		case ARMS:
//			if(arms != null)
//				inventory.add(arms);
//			arms = b;
//			break;
//		case LEGS:
//			if(legs != null)
//				inventory.add(head);
//			legs = b;
//			break;
//		}
	}

	@Override
	public char getRep()
	{
		return rep;
	}
}
