package lifeform;

import java.util.Random;

import item.*;

//Author: Aaron Gerber
//Makes a monster named Jerry... or some other monster if you want
public class MonsterMaker
{
	//Makes a generic jerry
	public static Monster genMonster()
	{
		Item legs = ItemGenerator.genLegs(1);
		Item arms = ItemGenerator.genArms(1);
		Item torso = ItemGenerator.genTorso(1);
		Item head = ItemGenerator.genHead(1);
		
		Monster jerry = new Monster("Jerry", 'j', 1, head, torso, arms, legs);
		
		jerry.changeState(new FullyAggressiveState());
		
		return jerry;
	}
	
	//Makes a difficulty scaled jerry
	public static Monster genMonster(int d)
	{
		Random ran = new Random();
		int agro = ran.nextInt(10)+1;
		Monster jerry;
		Item legs;
		Item arms;
		Item torso;
		Item head;
		int r;
		
		//Has a one in ten chance of becoming Jerry the Destroyer
		switch(agro)
		{
			case 10:
				d+=(ran.nextInt(3)+1);
				r = ran.nextInt(3) + d-1;
				
				legs = ItemGenerator.genLegs(r);
				arms = ItemGenerator.genArms(r);
				torso = ItemGenerator.genTorso(r);
				head = ItemGenerator.genHead(r);
				
				jerry = new Monster("Jerry the Destroyer", 'j', d, head, torso, arms, legs);
				
				jerry.changeState(new PassiveState());
				break;
			default:
				r = ran.nextInt(3) + d-1;
				
				legs = ItemGenerator.genLegs(r);
				arms = ItemGenerator.genArms(r);
				torso = ItemGenerator.genTorso(r);
				head = ItemGenerator.genHead(r);
				
				jerry = new Monster("Jerry", 'j', d, head, torso, arms, legs);
				
				jerry.changeState(new FullyAggressiveState());
				break;
		}
		return jerry;
	}
}
