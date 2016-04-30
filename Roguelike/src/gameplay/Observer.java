package gameplay;

import java.util.ArrayList;

public class Observer implements RoundCounter
{
	/**
	 * @author Christopher Wilson
	 */
	
	/**
	 * This is an ArrayList of everything in the game that will observe
	 * the "rounds" variable. It should only be LifeForms as they are
	 * the only ones implementing RoundObserver.
	 */
	private ArrayList<RoundObserver> theObservers = new ArrayList<RoundObserver>();
	int round = 0;
	
	/**
	 * Adds an observer to the ArrayList
	 */
	
	@Override
	public void addObserver(RoundObserver observer)
	{
		theObservers.add(observer);
		
	/**
	 * Removes a specific observer from the list. Probably means
	 * it died.
	 */
	}
	@Override
	public void removeObserver(RoundObserver observer)
	{
		theObservers.remove(observer);
		
	}
	
	/**
	 * Updates the round for all observers so they can execute
	 * applicable actions.
	 */
	
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
