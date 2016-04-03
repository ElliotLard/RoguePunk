package lifeform;

import environment.Cell;
import environment.Environment;
import gameplay.RoundObserver;
import item.BodyPart;

public abstract class LifeForm implements RoundObserver
{
	final static int HEAD = 0, TORSO = 1, ARMS = 2, LEGS = 3;
	Cell location;
	int speed, hp, strength, round;
	String name, description;
	String representation;
	BodyPart head, torso, arms, legs;

	public LifeForm(String r, String n, int s, Cell l)
	{
		representation = r;
		name = n;
		speed = s;
		location = l;
	}
	public LifeForm(String r, String n, int s)
	{
		this(r, n, s, new Cell());
	}
	public LifeForm(String r, String n)
	{
		this(r, n, 1, new Cell());
	}
	public LifeForm(String r)
	{
		this(r, "monster", 1, new Cell());
	}
	public LifeForm()
	{
		this("@", "monster", 1, new Cell());
	}
	
	public void move(Cell destination)
	{
		location.removeLifeForm();
		location = destination;
		location.addLifeForm(this);
	}
	public void move(int y, int x)
	{
		this.move(Environment.getCell(y, x));
	}
	
	private int calculateDamage()
	{
		int damage = 0;
		return damage;
	}
	public Cell getCell()
	{
		return location;
	}
	
	public void attack(LifeForm l)
	{
		l.takeHit(calculateDamage());
	}
	
	public void takeHit(int damage)
	{
		hp -= damage;
	}
	
	public String displayString()
	{
		return representation;
	}
	
	public void updateRound(int round)
	{
		this.round = round;
	}
	
}
