package h04;

import java.awt.*;
import java.applet.*;

public class h043 extends Applet {

    public void init (){

    }

    public void paint (Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.white);

        g.drawLine(150,350,150,100);
        g.drawLine(150,100,250,100);
        g.drawLine(150,120,250,120);
        g.drawLine(150,140,250,140);
        g.drawLine(150,160,250,160);
        g.drawLine(250,100,250,160);

        g.setColor(Color.red);
        g.fillRect(151,99,100,20);

        g.setColor(Color.white);
        g.fillRect(151,119,100,20);

        g.setColor(Color.blue);
        g.fillRect(151, 139, 100, 20);












    }
















}
