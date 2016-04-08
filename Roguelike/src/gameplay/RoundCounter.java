package gameplay;

public interface RoundCounter
{
	public void addObserver(RoundObserver observer);
	public void removeObserver(RoundObserver observer);
	public void updateObserver();
}
