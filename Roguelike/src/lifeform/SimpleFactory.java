package lifeform;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import item.BodyPart;
import item.Head;


public class SimpleFactory
{
	File monsterFile;
	String[] monsterTxt;
	String monsterName = "";
	char monsterRep;
	int count = 0;
	
	public Monster buildMonster(String name, char rep, int str, int hp, int speed)
	{
		
		try	
		{
            Scanner input = new Scanner(System.in);
            File file = new File("Assets/Monsters");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
//                System.out.println(line);
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
		String mnstrNme = monsterName;
		System.out.println("Success! " + monsterName);		
		
		while (!(monsterName.contains(String.valueOf(rep)))){
			if (monsterName.contains(" ")){
				monsterName = "";
			}
			monsterName = monsterName + monsterTxt[count];
			count++;
		}
		
		System.out.println("Success! " + monsterName);
		monsterRep = monsterName.charAt(0);
		
		BodyPart head = new Head(mnstrNme, monsterRep);
		
		return null;
	}
}