package h10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h102 extends Applet {
    TextField input1;
    String output1,output2;
    Button button1;
    double highestValue,lowestValue;

    public void init() {
        input1 = new TextField("",10);
        button1 = new Button("Submit");
        highestValue = Double.MIN_VALUE;
        lowestValue = Double.MAX_VALUE;
        output1 = "0";
        output2 = "0";
        input1.addActionListener(new inputListener());
        button1.addActionListener(new inputListener());
        add(input1);
        add(button1);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("Highest number: " + output1,20,50);
        g.drawString("Lowest number: " + output2,20,65);
    }
    class inputListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double inputValue1 = Double.parseDouble(input1.getText());
            if (inputValue1 > highestValue) {
                highestValue = inputValue1;
                output1 = String.valueOf(highestValue);
                repaint();
            }
            if (inputValue1 < lowestValue) {
                lowestValue = inputValue1;
                output2 = String.valueOf(lowestValue);
                repaint();
            }
        }
    }
}
