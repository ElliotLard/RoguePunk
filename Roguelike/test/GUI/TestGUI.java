package GUI;

import static org.junit.Assert.*;

import javax.swing.JOptionPane;

import org.junit.Test;

public class TestGUI
{
	/**
	 * We can't actually test the GUI directly because there is no way for the
	 * computer to know what it's supposed to look like. Instead we create two
	 * dialogue boxes. You just say yes or no depending on if the display is
	 * working correctly.
	 */
	@Test
	public void testGUI()
	{
		//TestInitialization
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"Menu should have 3 options\nStart, Editor, Exit\ndoes it?"));
		//TestStartButton
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"After hitting the start button\ndoes the game switch states?"));
		//TestEditorButton
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"Does hitting the Editor button open the editor?"));
		//TestExitButton
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"Does hitting the Exit button exit the game?"));
		//TestDisplayLevel
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"After entering the game, does the level\ndisplay properly?"));
		//TestUpdate
		assertEquals(JOptionPane.YES_OPTION, JOptionPane.showConfirmDialog(null,
				"Does the gaem update properly when the player moves?"));
	}
}
