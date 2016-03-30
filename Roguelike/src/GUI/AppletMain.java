package GUI;

import java.applet.Applet;
import asciiPanel.AsciiPanel;
public class AppletMain extends Applet
{
    private static final long serialVersionUID = 2560255315130084198L;
    private AsciiPanel terminal;
    
    public AppletMain()
    {
    	super();
    	terminal = new AsciiPanel();
    	terminal.write("tutorial", 1, 1);
    }
}
