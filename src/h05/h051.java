package h05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;



public class h051 extends Applet { 

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Graphics g;
    private Color bla = Color.black;
    private Color mag = Color.magenta;


    public void init() {

        setBackground(Color.darkGray);
    }

    public void paint(Graphics gtemp) {
        g = gtemp;

        lijn();
        rechthoek();
        afgeronde_Rechthoek();
        gevulde_Rechthoek_Met_Ovaal();
        gevulde_Ovaal();
        taartpunt_Met_Ovaal_();
        Cirkel();

        // resizes the window to, WIDTH = 1200 pixels. HEIGHT = 800 pixels;
        resize(1200, 800);
    }

    private void lijn() {
        g.setColor(bla);
        g.drawString("lijn", 120, 70);
        g.drawLine(50, 50, 200, 50);
    }

    private void rechthoek() {
        g.drawString("rechthoek", 100, 270);
        g.drawRect(50, 150, 150, 100);
    }

    private void afgeronde_Rechthoek() {
        g.drawString("afgeronde rechthoek", 75, 470);
        g.drawRoundRect(50, 350, 150, 100, 20, 20);
    }

    private void gevulde_Rechthoek_Met_Ovaal() {
        g.drawString("Gevulde rechthoek met ovaal", 320, 170);
        g.setColor(mag);
        g.fillRect(300, 50, 200, 100);
        g.setColor(bla);
        g.drawArc(300, 50, 200, 100, 0, 360);
    }

    private void gevulde_Ovaal() {
        g.drawString("Gevulde ovaal", 350, 320);
        g.setColor(mag);
        g.fillArc(300, 200, 200, 100, 0, 360);
    }

    private void taartpunt_Met_Ovaal_() {
        g.setColor(bla);
        g.drawString("Taartpunt met ovaal eromheen", 620, 170);
        g.setColor(mag);
        g.fillArc(600, 50, 200, 100, 0, 45);
        g.setColor(bla);
        g.drawArc(600, 50, 200, 100, 0, 360);
    }

    private void Cirkel() {
        g.drawString("Cirkel", 630, 320);
        g.drawArc(600, 200, 100, 100, 0, 360);
    }
}











