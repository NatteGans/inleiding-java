package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class h082 extends Applet {
    Button button1, button2, button3, button4;
    Label label1, label2, label3, label4;
    int output1, output2, output3, output4;

    public void init(){
        setSize(400,300);
        setLayout(new GridLayout(7,10));
        button1 = new Button ("+1");
        label1 = new Label ("men");
        button2 = new Button ("+1");
        label2 = new Label ("Women");
        button3 = new Button ("+1");
        label3 = new Label ("Potential men");
        button4 = new Button ("+1");
        label4 = new Label ("Potential women");
        button1.addActionListener( new button1Listener() );
        button2.addActionListener( new button2Listener() );
        button3.addActionListener( new button3Listener() );
        button4.addActionListener( new button4Listener() );
        add(label1);
        add(button1);
        add(label2);
        add(button2);
        add(label3);
        add(button3);
        add(label4);
        add(button4);
    }
    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("men: " + output1,20,200);
        g.drawString("Women: " + output2, 20, 215);
        g.drawString("Potential men:" + output3,20,230);
        g.drawString("Potential women :"+ output4,20,245);
    }
    class button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output1 = output1 + 1;
            repaint();
        }
    }
    class button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output2 = output2 + 1;
            repaint();
        }
    }
    class button3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output1 = output1 + 1;
            output3 = output3 + 1;
            repaint();
        }
    }
    class button4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            output2 = output2 + 1;
            output4 = output4 + 1;
            repaint();
        }
    }


}
