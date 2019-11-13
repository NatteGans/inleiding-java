package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class h061 extends Applet {
   double TotalAmount, FinalAmount, Persons;
   String[] people = {"Jan", "Ali", "Jeanette", "Sven"};

    public void init(){
        TotalAmount = 113;
        Persons = people.length;
        FinalAmount = TotalAmount / Persons;
    }

    public void paint (Graphics g) {
       setBackground(Color.DARK_GRAY);
       g.setColor(Color.RED);
       g.drawString(people[0] + "$" + FinalAmount, 20,65);
       g.drawString(people[1] + "$" + FinalAmount, 20, 50);
       g.drawString(people[2] + "$" + FinalAmount, 20, 35);
       g.drawString(people[3] + "$" + FinalAmount, 20, 20);
    }
}










    
