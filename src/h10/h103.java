package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h103 extends Applet {
    Label label1;
    TextField input1;
    Button button1;
    String output1,output2;

    public void init() {
        output1 = "";
        output2 = "";
        label1 = new Label("Monthnumber:");
        input1 = new TextField("Input",5);
        button1 = new Button("Submit");
        input1.addActionListener(new inputListener());
        button1.addActionListener(new inputListener());
        add(label1);
        add(input1);
        add(button1);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("month: " + output1,20,50);
        g.drawString("Days: " + output2,20,65);
    }
    class inputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int tempValue = Integer.parseInt(input1.getText());
            System.out.println(tempValue);
            switch (tempValue) {
                case 1:
                    output1 = "January";
                    output2 = "31";
                    repaint();
                    break;
                case 2:
                    output1 = "February";
                    output2 = "28 of 29";
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
