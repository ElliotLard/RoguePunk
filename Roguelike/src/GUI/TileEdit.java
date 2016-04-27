package GUI;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class TileEdit extends GameTile implements MouseListener
{

	public TileEdit(int y, int x, char rep)
	{
		super(y, x, rep);
		gameTile.addMouseListener(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		EditorTile.isPressed = true;
	}
	@Override
	public void mouseReleased(MouseEvent e)
	{
		EditorTile.isPressed = false;
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{
		if(EditorTile.isPressed)
		{
			String rep = DungeonEditor.getRep();
			gameTile.setText(rep);
		}
	}

	@Override
	public void mouseExited(MouseEvent e){}
	@Override
	public void mouseClicked(MouseEvent e){}

}
