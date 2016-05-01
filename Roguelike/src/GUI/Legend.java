package GUI;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import lifeform.Player;

public class Legend
{
	Player player;
	JLabel name;
	JLabel health;
	JLabel strength;
	JLabel inventory;
	JPanel legend;
	public Legend(Player player)
	{
		legend = new JPanel(new GridLayout(8,1,1,1));
		name = new JLabel("name: " + player.getName());
		health = new JLabel("health: " + player.getCurhp() + "/" + player.getMaxhp());
		strength = new JLabel("strength: " + player.getStrenth() + "");
		legend.add(name);
		legend.add(health);
		legend.add(strength);
		legend.setVisible(true);
	}
	public JPanel get()
	{
		return legend;
	}
}
