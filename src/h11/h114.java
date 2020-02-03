package h11;

import java.applet.Applet;
import java.awt.Graphics;


public class h114 extends Applet {
    private static final long serialVersionUID = -4516717612428023562L;



    public void init() {

    }

    public void paint(Graphics g) {
        resize(800, 700);

        for(int i = 0; i < 11; i++) {
            System.out.println(i);
            g.drawString("3 x " + i + " = " + i * 3, 100, 50 * i);
        }
    }
}
