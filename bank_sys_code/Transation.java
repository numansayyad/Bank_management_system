package bank_sys_code;

import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transation  extends JFrame implements ActionListener{
    Transation(){

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(200, 300, 500, 35);
        image.add(text);

        JButton deposite = new JButton("Deposite");
        deposite.setBounds(170,415,150,30);
        image.add(deposite);

        JButton cashwith = new JButton("Cash Wirhdraw");
        cashwith.setBounds(350,415,150,30);
        image.add(cashwith);

        JButton fastcash = new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        image.add(fastcash);

        JButton minstat = new JButton("Mini Statement");
        minstat.setBounds(350,450,150,30);
        image.add(minstat);

        JButton pinchange = new JButton("Pin Change");
        pinchange.setBounds(170,485,150,30);
        image.add(pinchange);

         JButton balance = new JButton("Balance Enquiry");
        balance.setBounds(355,485,150,30);
        image.add(balance);

        JButton exit = new JButton("Exit");
        exit.setBounds(355,520,150,30);
        image.add(exit);

        setSize(900,900);// set the window width and height
        setLocation(300,0);// set the position of the window on the screen
        // setUndecorated(true);
        setVisible(true);// make the window visible on the screen
    }

    public void actionPerformed(ActionEvent ae){

    }
       public static void main(String[] args) {
        new Transation();
    }
    
}
