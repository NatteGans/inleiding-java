package h11;

import java.applet.Applet;
import java.awt.Graphics;



public class h112 extends Applet {
    private static final long serialVersionUID = -4516717612428023562L;

    public void init() {

    }

    public void paint(Graphics g) {
        resize(800, 700);

        for(int i = 20; i > 9; i--) {
            g.drawString(String.valueOf(i), 80, i * 20);
        }

        g.drawLine(150, 500, 150, 140);
        g.drawLine(150, 140, 200, 200);
        g.drawLine(150, 140, 100, 200);
    }
}
