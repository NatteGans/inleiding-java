package h10;



import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class h105 extends Applet {
    TextField input1;
    Button button1,button2,button3;
    String output2, statusGrade;
    int aantalCijfers;
    double TotalNumbers,averageNumbers;

    public void init() {
        TotalNumbers = 0;
        input1 = new TextField("",10);
        button1 = new Button("Add");
        button2 = new Button("Average");
        button3 = new Button("Reset");
        input1.addActionListener(new addListener());
        button1.addActionListener(new addListener());
        button2.addActionListener(new averageListener());
        button3.addActionListener(new resetListener());
        add(input1);
        add(button1);
        add(button2);
        add(button3);
    }

    public void paint(Graphics g) {
        setBackground(Color.DARK_GRAY);
        g.setColor(Color.red);
        g.drawString("Status:" + statusGrade,20,65);
        g.drawString("Gemiddelde: " + averageNumbers,20,50);
    }
    class addListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double inputValue1 = Double.parseDouble(input1.getText());
            if (inputValue1 >= 5.5) {
                statusGrade = "Voldoende";
                TotalNumbers = TotalNumbers + inputValue1;
                aantalCijfers++;
            } else if (inputValue1 < 5.5) {
                statusGrade = "Onvoldoende";
                TotalNumbers = TotalNumbers + inputValue1;
                aantalCijfers++;
            } else if (inputValue1 > 10) {
                statusGrade = "null";
            }
            repaint();
        }
    }
    class averageListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            averageNumbers = TotalNumbers / aantalCijfers;
            if (averageNumbers >= 5.5) {
                statusGrade = "Voldoende";
            } else if (averageNumbers < 5.5) {
                statusGrade = "Onvoldoende";
            } else if (averageNumbers > 10 || averageNumbers < 1) {
                statusGrade = "null";
            }
            repaint();
        }
    }
    class resetListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            averageNumbers = TotalNumbers = aantalCijfers = 0;
            input1.setText("");
            repaint();
        }
    }
}