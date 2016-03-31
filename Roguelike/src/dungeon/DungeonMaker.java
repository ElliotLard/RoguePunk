package dungeon;

import java.awt.Dimension;

import GUI.GUIConstants;

public class DungeonMaker
{

	final int SMALLROOMMIN = 7, SMALLROOMMAX = 11;
	final int LARGEROOMMIN = 12, LARGEROOMMAX = 18;
	final int MAPHEIGHT = 60, MAPWIDTH = 60;
	int dungeonMap[][];
	
	
	public int[][] createDungeon()
	{
		dungeonMap = new int[MAPHEIGHT][MAPWIDTH];
		fill();
		makeRectangle(MAPHEIGHT/2, MAPWIDTH/2, 10, 10);
		addRoom();
		addRoom();
		addRoom();
		addRoom();
		
		return dungeonMap;		
	}
	
	public void fill()
	{
		for(int y = 0;y < MAPHEIGHT;y++)
		{
			for(int x = 0;x < MAPWIDTH;x++)
			{
				dungeonMap[y][x] = 2;
			}
		}
	}
	public Dimension findWall()
	{
		Dimension location = new Dimension();
		do
		{
			location.height = (int)(Math.random()*MAPHEIGHT);
			location.width = (int)(Math.random()*MAPWIDTH);
		}while(dungeonMap[location.height][location.width]!=GUIConstants.WALL);
		return location;
	}
	
	public boolean addRoom()
	{
		Dimension location = findWall();
		//north wall
		if(dungeonMap[location.height+1][location.width] == GUIConstants.EMPTY)
		{
			int height = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;//
			int width = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;
			int yLoc = location.height - height - (int)(Math.random()*5)+1;
			int xLoc = location.width - (width/2) + (int)(Math.random()*width) - width;
			if(!makeRectangle(yLoc, xLoc, height, width))
				return false;
			System.out.println("north");
			return true;
		}
		//south wall
		else if(dungeonMap[location.height-1][location.width] == GUIConstants.EMPTY)
		{
			int height = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;//
			int width = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;
			int yLoc = location.height + height + (int)(Math.random()*5)-1;
			int xLoc = location.width - (width/2) + (int)(Math.random()*width) - width;
			if(!makeRectangle(yLoc, xLoc, height, width))
				return false;
			System.out.println("south");
			return true;
		}
		//west wall
		else if(dungeonMap[location.height][location.width+1] == GUIConstants.EMPTY)
		{
			int height = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;//
			int width = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;
			int yLoc = location.height - (height/2) + (int)(Math.random()*height)-height;
			int xLoc = location.width - (width/2) + (int)(Math.random()*width) - width;
			if(!makeRectangle(yLoc, xLoc, height, width))
				return false;
			System.out.println("west");
			return true;
		}
		//east wall
		else if(dungeonMap[location.height][location.width-1] == GUIConstants.EMPTY)
		{
			int height = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;//
			int width = (int)(Math.random() * (SMALLROOMMAX-SMALLROOMMIN))+SMALLROOMMIN;
			int yLoc = location.height - (height/2) + (int)(Math.random()*height)-height;
			int xLoc = location.width - (width/2) + (int)(Math.random()*width) - width;
			if(!makeRectangle(yLoc, xLoc, height, width))
				return false;
		}
		System.out.println("east");
		return true;
	}
	public void drawRooms(int num)
	{
		int count = 0;
		do
		{
			int width = (int)(Math.random()*8)+6;
			int height = (int)(Math.random()*8)+6;
			int xLocation = (int)(Math.random()*(MAPWIDTH-width));
			int yLocation = (int)(Math.random()*(MAPHEIGHT-height));
			if(makeRectangle(yLocation, xLocation, height, width))
				count++;
		}while(count < num);
		
	}
	public boolean makeRectangle(int yLoc, int xLoc, int height, int width)
	{
		//if(!isNULL(yLoc, xLoc, width, height))
			//return false;
		
		//fill space with empty blocks
		if(isNULL(yLoc, xLoc, width, height))
		{
			for(int y = yLoc;y < yLoc+height;y++)
			{
				for(int x = xLoc;x < xLoc+width;x++)
				{
					dungeonMap[y][x] = GUIConstants.EMPTY;
				}
			}	
		}
		//draw walls around it
		for(int x = xLoc;x < xLoc+width;x++)//draw top wall
			dungeonMap[yLoc][x] = GUIConstants.WALL;
		for(int x = xLoc;x < xLoc+width;x++)//draw bottom wall
			dungeonMap[yLoc+height-1][x] = GUIConstants.WALL;
		for(int y = yLoc+1;y < yLoc+height-1;y++)//draw left wall
			dungeonMap[y][xLoc] = GUIConstants.WALL;
		for(int y = yLoc+1;y < yLoc+height-1;y++)//draw right wall
			dungeonMap[y][xLoc+width-1] = GUIConstants.WALL;
		
		return true;
	}
	
	public boolean isNULL(int yLoc, int xLoc, int width, int height)
	{
		for(int y = yLoc;y < yLoc+height;y++)
		{
			for(int x = xLoc;x < xLoc+width;x++)
			{
				if(dungeonMap[y][x] != 2)
					return false;
			}
		}	
		return true;
	}
	public boolean isNULL(int yLoc, int xLoc)
	{
		
		if(dungeonMap[yLoc][xLoc] != 2)
			return false;
				
		return true;
	}

}
