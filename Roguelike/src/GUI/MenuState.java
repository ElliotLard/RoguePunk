package GUI;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuState extends DisplayState implements ActionListener
{
	JButton start;
	JButton editor;
	JButton exit;
	/**
	 * initializes the menu
	 * @param g
	 */
	public MenuState(Game g)
	{
		super(g);
		start = new JButton();
		start.addActionListener(this);
		start.setText("Start");
		editor = new JButton();
		editor.addActionListener(this);
		editor.setText("Editor");
		exit = new JButton();
		exit.addActionListener(this);
		exit.setText("EXIT");
		
		displayPanel = new JPanel(new GridLayout(3, 3));
		displayPanel.setPreferredSize(GUIConstants.PLAYSPACESIZE);
		displayPanel.setBackground(Color.BLACK);
		
		displayPanel.add(start);
		displayPanel.add(editor);
		displayPanel.add(exit);
	}
	/**
	 * does the appropriate actions for button presses
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == start)
			changeState(new GameState(game));
		else if(e.getSource() == editor)
			System.out.println("go into editor");
		else if(e.getSource() == exit)
			System.exit(0);
	}
}
