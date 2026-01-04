import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Signupone extends JFrame {
    Signupone(){
        setLayout(null);

        Random ran = new Random();

        long Random=Math.abs((ran.nextLong()% 9000L )+ 1000L);
        //labels
        JLabel formno = new JLabel("application for no"+Random);
        formno.setFont(new Font("Raieway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personaldetails = new JLabel("Page 1 : Personal Details");
        personaldetails.setFont(new Font("Raieway",Font.BOLD,22));
        personaldetails.setBounds(290,80,600,30);
        add(personaldetails);

        JLabel name  = new JLabel("Name:");
        name.setFont(new Font("Raieway",Font.BOLD,22));
        name.setBounds(100,140,100,30);
        add(name);

        JLabel fname  = new JLabel("Father's Name:");
        fname.setFont(new Font("Raieway",Font.BOLD,22));
        fname.setBounds(100,190,200,30);
        add(fname);

        JLabel dob  = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raieway",Font.BOLD,22));
        dob.setBounds(100,190,200,30);
        add(dob);

       // ======================================================================


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        

    }
    public static void main(String[] args) {
        new Signupone();
    }
}
