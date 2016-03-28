package lifeform;

import environment.Cell;
import item.BodyPart;

public abstract class LifeForm
{
	final static int HEAD = 0, TORSO = 1, ARMS = 2, LEGS = 3;
	Cell location;
	int speed, hp;
	String name;
	char representation;
	BodyPart head, torso, arms, legs;

	public LifeForm(char r, String n, int s, Cell l)
	{
		representation = r;
		name = n;
		speed = s;
		location = l;
	}
	public LifeForm(char r, String n, int s)
	{
		this(r, n, s, new Cell());
	}
	public LifeForm(char r, String n)
	{
		this(r, n, 1, new Cell());
	}
	public LifeForm(char r)
	{
		this(r, "monster", 1, new Cell());
	}
	public LifeForm()
	{
		this('@', "monster", 1, new Cell());
	}
	
	public void move(Cell destination)
	{
		location = destination;
		destination.addLifeForm(this);
	}
	
	private int calculateDamage()
	{
		int damage = 0;
		return damage;
	}
	
	public void attack(LifeForm l)
	{
		l.takeHit(calculateDamage());
	}
	
	public void takeHit(int damage)
	{
		hp -= damage;
	}
	
}
