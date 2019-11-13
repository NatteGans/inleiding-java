package h05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class h052 extends Applet {

    private Graphics g;
    private short widthValerie = 40 * 6;
    private short widthJeroen = 100 * 6;
    private short widthHans = 80 * 6;

    public void init() {
        // set background to black.
        setBackground(Color.black);
    }

    public void paint(Graphics gtemp) {
        g = gtemp;

        barchart();

        // resizes the window to, WIDTH = 1200 pixels. HEIGHT = 800 pixels;
        resize(1200, 800);
    }

    private void barchart() {
        g.setColor(Color.pink);
        g.drawLine(200, 200, 200, 600);
        g.drawLine(200, 600, 900, 600);

        g.drawString("Valerie", 150, 300);
        g.drawString("Jeroen", 150, 400);
        g.drawString("Hans", 150, 500);

        g.fillRect(201, 270, widthValerie, 60);
        g.fillRect(201, 370, widthJeroen, 60);
        g.fillRect(201, 470, widthHans, 60);

        g.drawString("0", 200, 620);
        g.drawString("20", 200 + (40 * 3), 620);
        g.drawString("40", 200 + (40 * 6), 620);
        g.drawString("60", 200 + (40 * 9), 620);
        g.drawString("80", 200 + (40 * 12), 620);
        g.drawString("100", 200 + (40 * 15), 620);

        g.drawString("aantal kilograms -> ", 400, 700);
    }

}
