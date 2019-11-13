package h04;

import java.awt.*;
import java.applet.*;

public class h047 extends Applet {


        public void init() {
        }

        public void paint (Graphics g) {
            setBackground(Color.darkGray);
            g.drawRoundRect(20, 20, 200, 200, 10, 10);
            g.drawRoundRect(20, 20, 200, 200, 50, 50);
            g.fillOval(53, 53, 50, 50);
            g.fillOval(53, 137, 50, 50);
            g.fillOval(137, 53, 50, 50);
            g.fillOval(137, 137, 50, 50);
        }}




