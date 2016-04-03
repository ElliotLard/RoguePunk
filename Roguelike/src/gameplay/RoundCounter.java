package gameplay;

import lifeform.LifeForm;

public interface RoundCounter
{
	public void addObserver(RoundObserver observer);
	public void removeObserver(RoundObserver observer);
	public void updateObserver();
}
