package h10;



import javax.xml.soap.Text;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h106 extends Applet {
    TextField input1;
    Button button1;
    double x;
    String status;

    public void init() {
        input1 = new TextField("",5);
        button1 = new Button("Submit");
        input1.addActionListener(new runListener());
        button1.addActionListener(new runListener());
        add(input1);
        add(button1);
    }

    public void paint(Graphics g) {
        setBackground(Color.darkGray);
        g.setColor(Color.RED);
        g.drawString("Status: " + status,20,50);
    }
    class runListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            x = Double.parseDouble(input1.getText());
            if (x >= 1 && x <= 3) {
                status = "Bad";
            } else if (x == 4) {
                status = "Onvoldoende";
            } else if (x == 5) {
                status = "Matig";
            } else if (x >= 6 && x <= 7) {
                status = "Voldoende";
            } else if (x >= 8 && x <= 10) {
                status = "Goed";
            } else {
                status = "undefined";
            }
            repaint();
        }
    }
}
