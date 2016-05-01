package GUI;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Legend
{
	JLabel name;
	JLabel health;
	JLabel strength;
	JLabel head;
	JLabel torso;
	JLabel arms;
	JLabel legs;
	JLabel inventory;
	JPanel legend;
	public Legend()
	{
		legend = new JPanel(new GridLayout(8,1,1,1));
		name = new JLabel("bob");
		health = new JLabel("10/100");
		head = new JLabel("goblin head");
		torso = new JLabel("goblin torso");
		arms= new JLabel("goblin arms");
		legs = new JLabel("goblin legs");
		inventory = new JLabel("[{[]-][|[");
		legend.add(name);
		legend.add(health);
		legend.add(head);
		legend.add(torso);
		legend.add(arms);
		legend.add(legs);
		legend.add(inventory);

		
		legend.setVisible(true);
	}
	public JPanel get()
	{
		return legend;
	}
}
