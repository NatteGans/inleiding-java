package h04;

import java.awt.*;
import java.applet.*;

public class h044 extends Applet {

    public void init() {

    }

    public void paint (Graphics g){
        setBackground(Color.darkGray);
        g.setColor(Color.white);

        g.drawLine(50, 260, 50, 0);
        g.drawLine(100, 260, 100, 0);
        g.drawLine(150, 260, 150, 0);
        g.drawLine(200, 260, 200, 0);

        g.drawLine(0, 260, 400, 260);

        g.drawLine(50, 180, 100, 180);
        g.drawLine(100, 60, 150, 60);
        g.drawLine(150, 100, 200, 100);

        g.drawString("0", 20, 260);
        g.drawString("20", 20, 220);
        g.drawString("40", 20, 180);
        g.drawString("60", 20, 140);
        g.drawString("80", 20, 100);
        g.drawString("100", 20, 60);
        g.drawString("120", 20, 20);

        g.drawString("Valerie", 50, 280);
        g.drawString("Jeroen", 110, 280);
        g.drawString("Hans", 160, 280);

        g.setColor(Color.red);
        g.fillRect(151, 101, 49, 159);

        g.setColor(Color.blue);
        g.fillRect(101, 61, 49, 199);

        g.setColor(Color.MAGENTA);
        g.fillRect(51, 181, 49, 79);




    }









}
