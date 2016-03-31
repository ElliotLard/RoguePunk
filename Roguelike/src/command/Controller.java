package command;

public class Controller
{

	Command[] move;
	public Controller()
	{
		
	}
	
	public void setCommand(Command c)
	{
		
	}
	
	public void pressed()
	{
		move[0].execute();
	}
}
