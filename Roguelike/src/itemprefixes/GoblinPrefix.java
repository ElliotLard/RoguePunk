package itemprefixes;

public class GoblinPrefix implements ItemPrefixes
{

	@Override
	public String getPrefix()
	{
		return "Goblin ";
	}

	@Override
	public int addStrength()
	{
		return 2;
	}

	@Override
	public int addHitPoints()
	{
		return 2;
	}

	@Override
	public int addSpeed()
	{
		return 2;
	}

	@Override
	public int addWeight()
	{
		return 2;
	}
}
