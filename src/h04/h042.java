package h04;

import java.awt.*;
import java.applet.*;
public class h042 extends Applet {

    public void init () {
    }

public void paint (Graphics g) {
    setBackground(Color.white);
        g.setColor(Color.black);
    g.drawRoundRect(100, 80, 100, 50, 10, 10);
    g.drawLine(140, 100, 140, 130);
    g.drawLine(160, 100, 160, 130);

    g.drawLine(140, 100, 160, 100);
    g.drawOval(170, 90, 20, 20);

    g.drawLine(105, 80, 150, 40);
    g.drawLine(195, 80, 150, 40);



}}











