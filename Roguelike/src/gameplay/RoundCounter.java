package gameplay;

public interface RoundCounter
/**
 * @author Christopher Wilson
 * 
 * Interface abstract methods for Observer
 */
{
	public void addObserver(RoundObserver observer);
	public void removeObserver(RoundObserver observer);
	public void updateObserver();
}
