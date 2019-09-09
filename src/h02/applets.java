package h02;
import java.awt.*;
import java.applet.*;
public class applets extends Applet {


        /**
         *
         */
        private static final long serialVersionUID = 1L;

        // een (lege) methode die de Applet initialiseert
        String Chakir;
    public void init() {
        setBackground(Color.blue);

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Chakir", 40, 60);
    }

}
