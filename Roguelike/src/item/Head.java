package item;

public class Head extends BodyPart
{
	String name;
	char rep;

	public Head (String headName, char represent){
		name = headName;
		rep = represent;
	}
	
	public String getHeadName(){
		return name;
	}
}
