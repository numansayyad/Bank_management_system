import java.awt.Color;  //login page code
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

public class Login extends JFrame {

    Login() {

        setTitle("ATM MACHINE");

        // original image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/logo.png"));

        // scale image
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
cardno.setFont(new Font("Raleway", Font.BOLD, 20));
cardno.setBounds(120, 150, 400, 40);
add(cardno);

JLabel pin = new JLabel("PIN:");
pin.setFont(new Font("Raleway", Font.BOLD, 20));
pin.setBounds(120, 220, 400, 40);
add(pin);


        setSize(800, 400);
        setLocation(350, 200);
        setLayout(null);   // important
        label.setBounds(70, 10, 100, 100); // x, y, width, height
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        new Login();
    }
}
