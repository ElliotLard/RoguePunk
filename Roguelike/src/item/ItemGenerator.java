package item;

import java.util.Random;

//Author: Aaron Gerber
//Generates an item of varying quality
public class ItemGenerator
{
	private static Random ran = new Random();
	public static Item makeItem()
	{
		
		Item drop = null;
	
		
		//Loot table for the monsters
		switch(ran.nextInt(6)+1)
		{
			case 1:
				drop = genHead(1);
				break;
			case 2:
				drop = genTorso(1);
				break;
			case 3:
				drop = genArms(1);
				break;
			case 4:
				drop = genLegs(1);
				break;
			case 5:
				drop = new HealingItem();
				break;
			case 6:
				int roll = ran.nextInt(5)+1;
				int bodypart = ran.nextInt(4)+1;
				Reinforcer reinforcer = new Reinforcer(5);
				
				Item head = genHead(1);
				Item torso = genTorso(1);
				Item arms = genHead(1);
				Item legs = genTorso(1);

				while(roll>0)
				{
					switch(bodypart)
					{
						case 1:
							head.Strengthen(reinforcer);
							drop = head;
							break;
						case 2:
							torso.Strengthen(reinforcer);
							drop = torso;
							break;
						case 3:
							arms.Strengthen(reinforcer);
							drop = arms;
							break;
						case 4:
							legs.Strengthen(reinforcer);
							drop = legs;
							break;
						default:
							break;
					}
					roll-=1;
				}
			default:
				drop = new HealingItem();
				break;
		}
		return drop;
		
	}
	
	public static Item makeItem(int rarity)
	{
		Item drop = null;
	
		
		//Loot table for the monsters
		switch(ran.nextInt(7)+1)
		{
			case 1:
				drop = genHead(rarity);
				break;
			case 2:
				drop = genTorso(rarity);
				break;
			case 3:
				drop = genArms(rarity);
				break;
			case 4:
				drop = genLegs(rarity);
				break;
			case 5:
				drop = new HealingItem();
				break;
			case 6:
				drop = new HealingItem('p', 1, "Potion of Health", "Heals the user", ((ran.nextInt(5)+1)*5));
				break;
			//If a nine is rolled, reinforce the bodypart rolled before dropping it
			case 7:
				int roll = ran.nextInt(5)+1;
				int bodypart = ran.nextInt(4)+1;
				Reinforcer reinforcer = new Reinforcer(5);
				
				Item head = genHead(rarity);
				Item torso = genTorso(rarity);
				Item arms = genHead(rarity);
				Item legs = genTorso(rarity);

				while(roll>0)
				{
					switch(bodypart)
					{
						case 1:
							head.Strengthen(reinforcer);
							drop = head;
							break;
						case 2:
							torso.Strengthen(reinforcer);
							drop = torso;
							break;
						case 3:
							arms.Strengthen(reinforcer);
							drop = arms;
							break;
						case 4:
							legs.Strengthen(reinforcer);
							drop = legs;
							break;
						default:
							break;
					}
					roll-=1;
				}
			default:
				drop = new HealingItem();
				break;
		}
		return drop;
		
	}

	public static Item genLegs(int rarity)
	{
		return new BodyPart("Clockwork Legs", "A mechanical wonder in the shape of two legs", rarity, 1 ,3);
	}

	public static Item genArms(int rarity)
	{
		return new BodyPart("Clockwork Arms", "A mechanical wonder in the shape of two arms", rarity, 1 ,2);
	}

	public static Item genTorso(int rarity)
	{
		return new BodyPart("Clockwork Torso", "A mechanical wonder in the shape of a torso", rarity, 1 ,1);
	}

	public static Item genHead(int rarity)
	{
		return new BodyPart("Clockwork Legs", "A mechanical wonder in the shape of a leg", rarity, 1 ,0);
	}
}
