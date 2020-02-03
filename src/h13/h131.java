package h13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class h131 extends Applet {
    private static final long serialVersionUID = -3230968443047219157L;

    public void init() {
        setBackground(Color.DARK_GRAY);
    }

    public void paint(Graphics g) {
        resize(800, 700);
        g.setColor(Color.red);
        drawTriangle(g, 200, 200, 300, 100, 400, 200);
    }

    private void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y1, x3, y3);
        g.drawLine(x3, y3, x2, y2);
    }
}