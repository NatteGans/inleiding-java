package h13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h133 extends Applet {
    private static final long serialVersionUID = -3230968443047219157L;

    private Button rs_Knop;
    private Button gs_Knop;
    private int i = 0;


    public void init() {
        setBackground(new Color(21, 121, 10));
        rs_Knop = new Button("Rode steen Knop");
        gs_Knop = new Button("Grijze steen Knop");

        RBS_ButtonListener rbs = new RBS_ButtonListener();
        GBS_ButtonListener gbs = new GBS_ButtonListener();
        rs_Knop.addActionListener(rbs);
        gs_Knop.addActionListener(gbs);

        add(rs_Knop);
        add(gs_Knop);
    }

    public void paint(Graphics g) {
        resize(1200, 900);
        if(i == 0) {
            rodesteen(g, 0, 0, 100, 70);
        } else {
            grijzesteen(g, 0, 0, 150, 80);
        }
    }

    private void rodesteen(Graphics g, int x, int y, int w, int h) {
        setBackground(Color.DARK_GRAY);
        g.setColor(new Color(153, 0, 0));
        for(int j = 0; j < 20; j++) {
            for(int i = 0; i < 20; i++) {
                g.fillRect((x + 110) * i + (j * -50), (y + 80) * j, 100, 70);
            }
        }
    }

    private void grijzesteen(Graphics g, int x, int y, int w, int h) {
        setBackground(Color.lightGray);
        g.setColor(Color.darkGray);
        for(int j = 0; j < 20; j++) {
            for(int i = 0; i < 20; i++) {
                g.fillRect((x + 160) * i + (j * -50), (y + 90) * j, 150, 80);
            }
        }
    }

    private class RBS_ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            i = 0;
            repaint();
        }
    }

    private class GBS_ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            i = 1;
            repaint();
        }
    }
}