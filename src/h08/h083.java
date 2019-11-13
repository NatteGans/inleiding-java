package h08;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class h083 extends Applet {
    Label label1;
    TextField input1;
    Button button1;
    double calculatedValue, oldValue;

    public void init() {
        label1 = new Label("Exc. BTW:");
        input1 = new TextField("Klik svp");
        button1 = new Button("Ok");
        input1.addActionListener(new mainListener());
        button1.addActionListener(new mainListener());
        add(label1);
        add(input1);
        add(button1);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.red);
        g.drawString("Exclusief: " + String.valueOf(oldValue),50,50);
        g.drawString("Inclusief: " + String.valueOf(calculatedValue),50,65);
    }
    class mainListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double inputValue = Double.parseDouble(input1.getText());
            oldValue = Double.parseDouble(input1.getText());
            calculatedValue = inputValue * 1.21;
            repaint();

        }
}}

