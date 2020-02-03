package h12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class h126 extends Applet {
    private static final long serialVersionUID = -3230968443047219157L;

    private Graphics g;
    private int[] numberInSys = {6, 8, 8, 8, 9, 9, 9, 9, 9, 15, 15, 17};
    private TextField txF;
    private Button butOk;

    public void init() {
        setBackground(new Color(35, 77, 21));

        txF = new TextField("8", 20);
        butOk = new Button("Ok");
        butOk.addActionListener(new ButtonOkListener());
        add(txF);
        add(butOk);
    }

    public void paint(Graphics gtemp) {
        resize(800, 600);
        g = gtemp;
        g.setColor(Color.yellow);

        if(Integer.parseInt(txF.getText()) == 6) {
            g.drawString("1 time the worth of 6", 100, 100);
        }
        if(Integer.parseInt(txF.getText()) == 8) {
            g.drawString("3 times the worth of 8", 100, 100);
        }
        if(Integer.parseInt(txF.getText()) == 9) {
            g.drawString("5 times the worth of 9", 100, 100);
        }
        if(Integer.parseInt(txF.getText()) == 15) {
            g.drawString("2 times the worth of", 100, 100);
        }
        if(Integer.parseInt(txF.getText()) == 17) {
            g.drawString("1 time the worth of 17", 100, 100);
        }
        if(Integer.parseInt(txF.getText()) != 6 && (Integer.parseInt(txF.getText()) != 8) &&
                (Integer.parseInt(txF.getText()) != 9) && (Integer.parseInt(txF.getText()) != 15) &&
                (Integer.parseInt(txF.getText()) != 17)) {
            g.drawString("Value does not exist", 100, 100);
        }
    }

    private class ButtonOkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}