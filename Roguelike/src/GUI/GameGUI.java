package GUI;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class GameGUI extends JFrame
{
	GameSpace gameSpace;
	
	public GameGUI()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(GUIConstants.WINDOWSIZE);
		this.setLayout(new BorderLayout());

		gameSpace = new GameSpace();

		this.add(gameSpace, BorderLayout.WEST);
		this.pack();
		this.setVisible(true);
	}

//	@Override
//	public void actionPerformed(ActionEvent e)
//	{
//		if(e.getActionCommand())
//		{
//			textBox.setText(wallButton.getText());
//		}
//	}
}