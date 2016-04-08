package lifeform;

import dungeon.displayable;
import environment.Cell;
import environment.Environment;
import gameplay.RoundObserver;
import item.BodyPart;

public abstract class LifeForm implements RoundObserver, displayable
{
	final static int HEAD = 0, TORSO = 1, ARMS = 2, LEGS = 3;
	Cell location;
	int speed, hp, strength, round;
	String name, description;
	char rep;
	BodyPart head, torso, arms, legs;

	public LifeForm(char r, String n, int s, Cell l)
	{
		rep = r;
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
		this('.', "monster", 1, new Cell());
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
	
	public void updateRound(int round)
	{
		this.round = round;
	}
	
}
