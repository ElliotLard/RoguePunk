package lifeform;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class SimpleFactory
{
	int x;
	String[] text = new String[x];
	File check;
	
	public Monster buildMonster(String name, char rep, int str, int hp, int speed) throws FileNotFoundException{
		
		return null;
	}
	
	public void testRead() throws FileNotFoundException{
		File file = new File("/Roguelike/Assets/Monsters");
		check = file;
		Scanner in = new Scanner(new FileReader(file));
		
		System.out.print(in);	
	}
}
