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
	
	public void testRead(){

	    try {
            Scanner input = new Scanner(System.in);
            File file = new File("Assets/Monsters");

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
	    
	}
}
