import java.awt.Color;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Signupone extends JFrame {
    Signupone(){


        Random ran = new Random();
        System.out.println(ran);
        JLabel forno = new JLabel("application for no");



        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        

    }
    public static void main(String[] args) {
        new Signupone();
    }
}
