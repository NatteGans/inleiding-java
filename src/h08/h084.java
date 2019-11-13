package h08;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h084 extends Applet {
    TextField input1,input2;
    Button button1,button2,button3,button4;
    double output,inputValue1,inputValue2;
    String i;

    public void init() {
        inputValue1 = 0;
        inputValue2 = 0;
        i = "#";
        input1 = new TextField("",10);
        input2 = new TextField("",10);
        button1 = new Button("*");
        button2 = new Button("/");
        button3 = new Button("+");
        button4 = new Button("-");
        button1.addActionListener(new multiplyListener());
        button2.addActionListener(new divideListener());
        button3.addActionListener(new plusListener());
        button4.addActionListener(new minusListener());
        add(input1);
        add(input2);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString(String.valueOf(inputValue1) + " " + i + " " + String.valueOf(inputValue2) + " = " + output,30,60);
    }
    class multiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputValue1 = Double.parseDouble(input1.getText());
            inputValue2 = Double.parseDouble(input2.getText());
            output = inputValue1 * inputValue2;
            repaint();
        }
    }
    class divideListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputValue1 = Double.parseDouble(input1.getText());
            inputValue2 = Double.parseDouble(input2.getText());
            output = inputValue1 / inputValue2;
            repaint();
        }
    }
    class plusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputValue1 = Double.parseDouble(input1.getText());
            inputValue2 = Double.parseDouble(input2.getText());
            output = inputValue1 + inputValue2;
            repaint();
        }
    }
    class minusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            inputValue1 = Double.parseDouble(input1.getText());
            inputValue2 = Double.parseDouble(input2.getText());
            output = inputValue1 - inputValue2;
            repaint();
        }
    }
}