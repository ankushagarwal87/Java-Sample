
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*
<APPLET
CODE=TestApplet.class
WIDTH=400
HEIGHT=200 >
</APPLET>
*/
import java.applet.Applet;
import java.awt.*;
public class TestApplet extends Applet
{
public void paint(Graphics g)
{
g.drawString("Hello from Java!", 60, 100);
}
}

