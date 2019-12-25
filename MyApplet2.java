import java.applet.Applet;
import java.awt.*;

// <applet code="MyApplet2" width="300" height="220"> </applet>

public class MyApplet2 extends Applet {
    private String defaultMessage = "Hello!";

    public void paint(Graphics g) {
        String s1 = getParameter("site");
        if (s1 == null) {
            s1 = defaultMessage;
        }
    g.drawString(s1, 50, 25);
    }
}