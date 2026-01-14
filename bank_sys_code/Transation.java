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

public class Transation extends JFrame implements ActionListener {// action lister used to perform a action by user like
                                                                  // clickbutton etc
    JButton deposite, cashwith, fastcash, minstat, pinchange, balance, exit;
    String pinnumber;

    Transation(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please Select Your Transaction");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(200, 300, 500, 35);
        image.add(text);

        deposite = new JButton("Deposite");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);// thia is a function . this line makes the program respond when the deposit
                                         // button is clicked.
        image.add(deposite);

        cashwith = new JButton("Cash Wirhdraw");
        cashwith.setBounds(350, 415, 150, 30);
        cashwith.addActionListener(this);
        image.add(cashwith);

        fastcash = new JButton("Instant Cash");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        minstat = new JButton("Mini Statement");
        minstat.setBounds(350, 450, 150, 30);
        minstat.addActionListener(this);
        image.add(minstat);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance = new JButton("View Balance");
        balance.setBounds(350, 485, 150, 30);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("Exit");
        exit.setBounds(350, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);// set the window width and height
        setLocation(300, 0);// set the position of the window on the screen
        setUndecorated(true);// for full window
        setVisible(true);// make the window visible on the screen
    }

    public void actionPerformed(ActionEvent ae) { // actionperform class override
        if (ae.getSource() == exit) {// If user clicks EXIT button, close the entire ATM application
            System.exit(0);
        }
        // If user clicks DEPOSIT button
        // Close transaction page and open Deposit page
        // Pass user's pin number to Deposit page
        else if (ae.getSource() == deposite) {
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        } else if (ae.getSource() == cashwith) {// If user clicks CASH WITHDRAW button Close transaction page and open Withdrawal page
            setVisible(false);
            new Withdrawal(pinnumber).setVisible(true);
        } else if (ae.getSource() == fastcash) {
            setVisible(false);
            new Fastcash(pinnumber).setVisible(true);
        } else if (ae.getSource() == pinchange) {
            setVisible(false);
            new Pinchange(pinnumber).setVisible(true);
        } else if (ae.getSource() == balance) {
            setVisible(false);
            new Balanceinquiry(pinnumber).setVisible(true);
        } else if (ae.getSource() == minstat) {
            new Ministatement(pinnumber).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Transation("");
    }

}
