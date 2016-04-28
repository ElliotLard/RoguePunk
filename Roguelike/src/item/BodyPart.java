package item;

import java.util.Random;

//Author: Aaron Gerber
//The body parts of any LifeForm; almost no body part should be the same.

public class BodyPart extends Item
{
	int BodySlot;			//0 for head; 1 for torso; 2 for arms; 3 for legs
	
	//A customizable body part constructor
	public BodyPart(String n, String d, int r, int u, int s)
	{
		super(n, d, r, u);
		BodySlot = s;
		GenerateStats();
	}
	
	//A default constructor with a customizable body slot
	public BodyPart(int s)
	{
		super("Generic Body Part","Just a piece of garbage", 1, 1);
		Random rand = new Random();
		BodySlot = s;
		GenerateStats();
	}
	
	//A default constructor of a body part
	public BodyPart()
	{
		super("Generic Body Part","Just a piece of garbage", 1, 1);
		Random rand = new Random();
		BodySlot = rand.nextInt(4);
		GenerateStats();
	}
	
	
	//Generates the stats to the body part using the rarity as a guide
	private void GenerateStats()
	{
		Random rand = new Random();
		str = rand.nextInt((50)/(5/rarity))+1;
		hp = rand.nextInt(5)+1;
		if(BodySlot == 3)
			spd = 1;
	}
	
	@Override
	public void UseItem()
	{
		//Empty because a body part cannot be used; only equipped
	}
}
