package h06;

//Opdracht 6.3

import java.applet.Applet;
import java.awt.*;

public class h063 extends Applet {
    int value1,value2,result;

    public void init() {
        value1 = 2147482733;
        value2 = 2147483236;
        result = value1 + value2;
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString(value1 + " + " + value2 + " = " + result,20,20);
    }

}
