package lifeform;

import java.util.Random;

import gameplay.*;
import item.*;

//Author: Aaron Gerber
//Monsters that will populate the dungeons and attack the player.

public class Monster extends LifeForm implements RoundObserver
{
	//Difficulty can never be 0
	int difficulty;
	MonsterState state;
	
	//A fully customizable monster
	public Monster(String name, char rep, int d, Item head, Item torso, Item arms,
			Item legs)
	{
		super(name, rep, head, torso, arms, legs);
		
		if(d<1)
			d = 1;
		
		difficulty = d;
		str = (int)((head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR())/((double)10/(double)difficulty));
		spd = (int)((head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD())/((double)10/(double)difficulty));
		hp[0] = (int)((head.getHP()+torso.getHP()+arms.getHP()+legs.getHP())/((double)5/(double)difficulty));
		hp[1] = hp[0];
		ap[0] = 1;
		ap[1] = ap[0];
	}
	
	//Generates a default monster with extremely basic stats
	public Monster()
	{
		difficulty = 1;
		
		BodyPart h = new BodyPart(0);
		BodyPart t = new BodyPart(1);
		BodyPart a = new BodyPart(2);
		BodyPart l = new BodyPart(3);
		head = h;
		torso = t;
		arms = a;
		legs = l;
		
		//Sets the monsters default stats; THEY WILL VARY EACH TIME
		str = (int)((head.getSTR()+torso.getSTR()+arms.getSTR()+legs.getSTR())/((double)10/(double)difficulty));
		spd = (int)((head.getSPD()+torso.getSPD()+arms.getSPD()+legs.getSPD())/((double)10/(double)difficulty));
		hp[0] = (int)((head.getHP()+torso.getHP()+arms.getHP()+legs.getHP())/((double)5/(double)difficulty));
		hp[1] = hp[0];
		ap[0] = 1;
		ap[1] = ap[0];
	}

	//A default for changing the state of the monster
	public void changeState(MonsterState s)
	{
		state = s;
		s.attachMonster(this);
	}
	
	//activates the monsters state
	@Override
	public void updateRound(int round)
	{
		if(hp[0]<=0)
		{
			dropItem(location, rollDrop());
			location = null;
		}
		else
			state.activate();
	}

	//Calculates a drop for the player
	private Item rollDrop()
	{
		Random ran = new Random();
		Item drop = null;
		
		//Loot table for the monsters
		switch(ran.nextInt(10)+1)
		{
			case 1:
				drop = head;
				break;
			case 2:
				drop = torso;
				break;
			case 3:
				drop = arms;
				break;
			case 4:
				drop = legs;
				break;
			case 6:
				drop = new HealingItem();
				break;
			case 7:
				drop = new HealingItem('p', 1, "Potion of Health", "Heals the user", (ran.nextInt(3)+(difficulty-1)*5));
				break;
			//If a nine is rolled, reinforce the bodypart rolled before dropping it
			case 9:
				int roll = ran.nextInt(10)+1;
				int bodypart = ran.nextInt(4)+1;
				Reinforcer reinforcer = new Reinforcer(5);
				
				roll += difficulty;
				while(roll>5||reinforcer.getUses()!=1)
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
					roll-=5;
				}
			default:
				break;
		}
		
		return drop;
	}
	
	public MonsterState getState()
	{
		return state;
	}
}
