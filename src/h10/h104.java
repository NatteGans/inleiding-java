package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h104 extends Applet {
    Label label1,label2;
    TextField input1,input2;
    Button button1;
    String output1,output2;
    boolean leapYear;

    public void init() {
        output1 = "";
        output2 = "";
        label1 = new Label("Maandnummer:");
        input1 = new TextField("",5);
        label2 = new Label("Jaartal:");
        input2 = new TextField("",5);
        button1 = new Button("Submit");
        input1.addActionListener(new inputListener());
        input2.addActionListener(new inputListener());
        button1.addActionListener(new inputListener());
        add(label1);
        add(input1);
        add(label2);
        add(input2);
        add(button1);
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.RED);
        g.drawString("Maand: " + output1,20,50);
        g.drawString("Aantal Dagen: " + output2,20,65);
    }
    class inputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int tempValue1 = Integer.parseInt(input1.getText());
            int tempValue2 = Integer.parseInt(input2.getText());
            if ( (tempValue2 % 4 == 0 && !(tempValue2 % 100 == 0)) ||
                    tempValue2 % 400 == 0 ) {
                leapYear = true;
            } else {
                leapYear = false;
            }
            switch (tempValue1) {
                case 1:
                    output1 = "January";
                    output2 = "31";
                    repaint();
                    break;
                case 2:
                    output1 = "February";
                    if (leapYear == true) {
                        output2 = "29";
                    } else if (leapYear == false) {
                        output2 = "28";
                    } else {
                        output2 = "ERROR";
                    }
                    repaint();
                    break;
                case 3:
                    output1 = "March";
                    output2 = "31";
                    repaint();
                    break;
                case 4:
                    output1 = "April";
                    output2 = "30";
                    repaint();
                    break;
                case 5:
                    output1 = "May";
                    output2 = "31";
                    repaint();
                    break;
                case 6:
                    output1 = "June";
                    output2 = "30";
                    repaint();
                    break;
                case 7:
                    output1 = "July";
                    output2 = "31";
                    repaint();
                    break;
                case 8:
                    output1 = "August";
                    output2 = "31";
                    repaint();
                    break;
                case 9:
                    output1 = "September";
                    output2 = "30";
                    repaint();
                    break;
                case 10:
                    output1 = "October";
                    output2 = "31";
                    repaint();
                    break;
                case 11:
                    output1 = "November";
                    output2 = "30";
                    repaint();
                    break;
                case 12:
                    output1 = "December";
                    output2 = "31";
                    repaint();
                    break;
                default:
                    output1 = "Unknown";
                    output2 = "Unknown";
            }
        }
    }
}