import java.awt.Color; 
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener { // used action listner interface

    Login() {

        setTitle("ATM MACHINE");
        setLayout(null); // important

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/logo.png")); //used image icon class.
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

        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(230, 157, 250, 30);
        add(cardTextField);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 23));
        pin.setBounds(120, 220, 250, 30);
        add(pin);

        JPasswordField pinTextField = new JPasswordField();
        pinTextField.setBounds(230, 220, 250, 30);
        add(pinTextField);

        // ========================================================
        // buttons

        JButton login = new JButton("SIGN IN");
        login.setBounds(360, 300, 110, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        JButton clear = new JButton("CLEAR");
        clear.setBounds(240, 300, 110, 30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        add(clear);

        JButton Sighup = new JButton("SIGN UP");
        Sighup.setBounds(240, 350, 230, 30);
        Sighup.setBackground(Color.BLACK);
        Sighup.setForeground(Color.WHITE);
        add(Sighup);

        // ==================================================================

        setSize(800, 500);
        setLocation(350, 200);
        label.setBounds(70, 10, 100, 100);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String args[]) {
        new Login();
    }
}
