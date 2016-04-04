package lifeform;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import item.BodyPart;

public class EnemyFactory
{
	public static ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	
	public static void makeMonsters()
	{
		try	
		{
            Scanner input = new Scanner(System.in);
            File file = new File("Assets/Monsters");
            input = new Scanner(file);
            
            while (input.hasNextLine()) {
            	String[] lineSplit = new String[3];
                String line = input.nextLine();
                lineSplit = line.split(", ");
 //               Enemy newEnemy = buildEnemy(lineSplit);
 //               enemyList.add(newEnemy);
            }
            input.close();
        }
		catch (Exception ex) 
		{
            ex.printStackTrace();
        }	
	}
	
	/*
	private static Enemy buildEnemy(String[] lineSplit)
	{
		BodyPart head = new BodyPart(
        		LifeForm.HEAD, lineSplit[0] + " head",lineSplit[1]);
        BodyPart torso = new BodyPart(
        		LifeForm.TORSO, lineSplit[0] + " torso",lineSplit[1]);
        BodyPart arms = new BodyPart(
        		LifeForm.ARMS, lineSplit[0] + " arms",lineSplit[1]);
        BodyPart legs = new BodyPart(
        		LifeForm.LEGS, lineSplit[0] + " legs",lineSplit[1]);
        return new Enemy(head, torso, arms, legs, lineSplit[2]);
	}
	*/
}
