package material;

public class Brass implements Material
{

	@Override
	public String getMaterial()
	{
		return "Brass ";
	}

	@Override
	public int addStrength()
	{
		return 10;
	}

	@Override
	public int addHitPoints()
	{
		return 10;
	}

	@Override
	public int addSpeed()
	{
		return 1;
	}

	@Override
	public int addWeight()
	{
		return 2;
	}
}
