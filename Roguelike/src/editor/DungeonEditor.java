package editor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GUI.GUIConstants;
/**
 * this class is not directly part of the project but is used to make the levels
 * @author elliotlard
 *
 */
public class DungeonEditor extends JFrame implements ActionListener
{
	Editor gameSpace;
	JButton wallButton;
	JButton emptyButton;
	JButton enemyButton;
	JButton upButton;
	JButton downButton;
	JButton writeButton;
	JTextField fileName;
	int difficulty = 1;
	
	static JLabel textBox;
	public DungeonEditor()
	{
		JPanel options = new JPanel(new GridLayout(0,2,10,10));
		wallButton = new JButton();
		wallButton.addActionListener(this);
		wallButton.setText("#");
		emptyButton = new JButton();
		emptyButton.addActionListener(this);
		emptyButton.setText(".");
		enemyButton = new JButton();
		enemyButton.addActionListener(this);
		enemyButton.setText("Enemy");
		upButton = new JButton();
		upButton.addActionListener(this);
		upButton.setText(">");
		downButton = new JButton();
		downButton.addActionListener(this);
		downButton.setText("<");
		fileName = new JTextField("levelName");
		
		writeButton = new JButton();
		writeButton.addActionListener(this);
		writeButton.setText("write level");
		
		
		textBox = new JLabel(".");
		options.setPreferredSize(new Dimension(200, 200));
		options.setBackground(Color.DARK_GRAY);
		
		options.add(wallButton);
		options.add(emptyButton);
		options.add(enemyButton);
		options.add(textBox);
		options.add(downButton);
		options.add(upButton);
		options.add(writeButton);
		options.add(fileName);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(GUIConstants.WINDOWSIZE);
		this.setLayout(new BorderLayout());
		gameSpace = new Editor();
		this.add(gameSpace.get(), BorderLayout.WEST);
		this.add(options, BorderLayout.EAST);
		this.pack();
		this.setVisible(true);
	}
	
	public static String getRep()
	{
		return textBox.getText();
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == wallButton)
		{
			textBox.setText(wallButton.getText());
		}
		else if(e.getSource() == emptyButton)
		{
			textBox.setText(emptyButton.getText());
		}
		else if(e.getSource() == enemyButton)
		{
			textBox.setText(Integer.toString(difficulty));
		}
		else if(e.getSource() == upButton)
		{
			difficulty++;
			textBox.setText(Integer.toString(difficulty));
		}
		else if(e.getSource() == downButton)
		{
			difficulty--;
			textBox.setText(Integer.toString(difficulty));
		}
		else if(e.getSource() == writeButton)
		{
			try
			{
				DungeonAdapter writer = new DungeonAdapter();
				writer.writeDungeon(fileName.getText());
			} catch (FileNotFoundException | UnsupportedEncodingException e1)
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
