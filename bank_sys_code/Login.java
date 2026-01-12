package bank_sys_code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener { // used action listner interface
    JButton login, clear, signup;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {

        setTitle("ATM MACHINE");
        setLayout(null); // important

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/logo.png")); // used image icon class.
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // create new ImageIcon from scaled image
        ImageIcon i3 = new ImageIcon(i2);
        // add to label
        JLabel label = new JLabel(i3);
        add(label);

        JLabel text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Oswald", Font.BOLD, 38));
        text.setBounds(200, 40, 400, 40);
        add(text);

        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 23));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(230, 157, 250, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 23));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(230, 220, 250, 30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));

        add(pinTextField);

        // ========================================================
        // buttons

        login = new JButton("SIGN IN");
        login.setBounds(360, 300, 110, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);

        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(240, 300, 110, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(240, 350, 230, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);

        add(signup);

        // ==================================================================

        setSize(800, 500);
        setLocation(350, 200);
        label.setBounds(70, 10, 100, 100);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {// after button click exacly what will be action
                                                 // perform decide this class
        if (ae.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }

        else if (ae.getSource() == login) {
            condatabase c = new condatabase();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            if (cardnumber.isEmpty() || pinnumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Card No and PIN");
                return;
            }

            try {

                String query = "SELECT * FROM signupthree WHERE cardnumber='" + cardnumber +
                        "' AND pinnumber='" + pinnumber + "'";

                ResultSet rs = c.s.executeQuery(query);

                if (rs.next()) {
                    setVisible(false);
                    new Transation(pinnumber).setVisible(true); // ✅ NOW OPENS
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Card No or PIN");
                }

            } catch (Exception e) {
                System.out.println(e);// handle and display runtime errors

            }
            {

            }

        } else if (ae.getSource() == signup) {
            setVisible(false);// hide the current window
            new Signupone().setVisible(true);// open the Signup page
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}
