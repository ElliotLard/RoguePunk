//package lifeform;
//
//import java.io.File;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import item.BodyPart;
//
//public class EnemyFactory
//{
//	
//	public ArrayList<Enemy> makeMonsters(String list)
//	{
//		ArrayList<Enemy> enemyList;
//		try	
//		{
//            Scanner input = new Scanner(System.in);
//            File file = new File(list);
//            input = new Scanner(file);
//            
//            while (input.hasNextLine()) {
//            	String[] lineSplit = new String[3];
//                String line = input.nextLine();
//                lineSplit = line.split(", ");
//                enemyList.add(newEnemy);
//            }
//            input.close();
//        }
//		catch (Exception ex) 
//		{
//            ex.printStackTrace();
//        }
//		return enemyList;
//	}
//}
