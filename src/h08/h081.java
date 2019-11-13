package h08;

//8.1

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class h081 extends Applet {
    TextField input1;
    Label label1;
    Button button1, button2;
    String collectedInput;

    public void init() {
        input1 = new TextField("Klik hier aub",20);
                label1 = new Label("Input");
                button1 = new Button("Hier");
                button2 = new Button("Reset");
                button1.addActionListener( new button1Listener() );
                button2.addActionListener( new button2Listener() );
                add (label1);
                add (input1);
                add (button1);
                add (button2);
                collectedInput = "";
    }

    public void paint (Graphics g){
setBackground(Color.darkGray);
g.setColor(Color.RED);
g.drawString(collectedInput, 50,60);
    }

    class button1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            collectedInput = input1.getText();
            repaint();
            input1.setText("Klik hier aub");
        }
    }
    class button2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            collectedInput = "";
            input1.setText("");
            repaint();

            }
        }
    }
