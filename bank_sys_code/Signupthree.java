package bank_sys_code;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Signupthree extends JFrame{
Signupthree() {
    setLayout(null);

    JLabel l1 = new JLabel("Page 3: Account Details");
    l1.setFont(new Font("Raleway", Font.BOLD, 22));
    l1.setBounds(280, 40, 400, 40);
    add(l1);

    setSize(850, 820);
    setLocation(350, 0);
    setVisible(true);
}

public static void main(String args[]) {
    new Signupthree();
}}