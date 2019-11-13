package h04;

import java.awt.*;
import java.applet.*;

public class h046 extends Applet {

    public void init (){


    }


    public void paint (Graphics g){
        setBackground(Color.darkGray);
        g.drawRect(20,20,90,250);
        g.setColor(Color.red);
        g.fillOval(30,30,70,70);
        g.setColor(Color.orange);
        g.fillOval(30,110,70,70);
        g.setColor(Color.green);
        g.fillOval(30,190,70,70);
        g.setColor(Color.black);
        g.drawRect(55,270,20, 120);

    }
}


