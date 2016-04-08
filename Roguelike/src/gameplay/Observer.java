package gameplay;

import java.util.ArrayList;

public class Observer implements RoundCounter
{
	private ArrayList<RoundObserver> theObservers = new ArrayList<RoundObserver>();
	int round = 0;
	
	@Override
	public void addObserver(RoundObserver observer)
	{
		theObservers.add(observer);
		
	}
	@Override
	public void removeObserver(RoundObserver observer)
	{
		theObservers.remove(observer);
		
	}
	@Override
	public void updateObserver()
	{
		round++;
		for (int x = 0; x < theObservers.size(); x++)
		{
			theObservers.get(x).updateRound(round);
		}
		
	}
}
