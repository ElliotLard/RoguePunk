package lifeform;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;


public class SimpleFactory
{
	File monsterFile;
	String[] monsterTxt;
	String monsterName = "";
	int count = 0;
	
	public Monster buildMonster(String name, char rep, int str, int hp, int speed)
	{
		String derp = name;
		
		try	
		{
            Scanner input = new Scanner(System.in);
            File file = new File("Assets/Monsters");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();
            monsterFile = file;
            monsterTxt = new String[(int) monsterFile.length()];
            
            String monster = new Scanner(new File("Assets/Monsters")).useDelimiter("\\Z").next();
            
            monsterTxt = monster.split("");
        } 
		catch (Exception ex) 
		{
            ex.printStackTrace();
        }
		
		while (!(monsterName.contains(name))){
			if (monsterName.contains(" ")){
				monsterName = "";
			}
			monsterName = monsterName + monsterTxt[count];
			count++;
		}
		
		System.out.println("Success!" + monsterName);
		System.out.println(derp);
		
		return null;
	}
}
