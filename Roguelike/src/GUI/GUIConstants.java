package GUI;

import java.awt.Dimension;

import environment.Environment;

public class GUIConstants
{
	public final static int TILESIZE = 12;
	public final static int LEGENDWIDTH = 200;
	public final static Dimension TILEDIMENSION = new Dimension(TILESIZE, TILESIZE);
	public final static Dimension WINDOWSIZE = new Dimension((Environment.WIDTH * TILESIZE) + LEGENDWIDTH,
			Environment.HEIGHT * TILESIZE);
	public final static Dimension PLAYSPACESIZE = new Dimension(Environment.WIDTH * TILESIZE,
			Environment.HEIGHT * TILESIZE);
	public final static Dimension LEGENDSIZE = new Dimension(200, 0);
	

	
	public final static int NULL = 0, EMPTY = 1, WALL = 2,
			PLAYER = 10, ORC = 11, DRAGON = 12, COCKATRICE = 13;

}
