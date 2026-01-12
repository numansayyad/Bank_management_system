package bank_sys_code;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Image;

public class Deposite extends JFrame implements ActionListener{
 JTextField amount;
JButton deposit, back;
String pinnumber;
    Deposite(String pinnumer) {
        this.pinnumber=pinnumer;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to deposite");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(170, 300, 400, 20);
        image.add(text);

         amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170, 350, 320, 25);
        image.add(amount);

        deposit = new JButton("Deposit");
        deposit.setBounds(355, 485, 150, 30);
        deposit.addActionListener(this);
        image.add(deposit);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setVisible(true);

    }
public void actionPerformed(ActionEvent ae){
if(ae.getSource()==deposit){
    

}else if(ae.getSource()==back){
    setVisible(false);
    new Transation(pinnumber).setVisible(true);

}
}
    public static void main(String[] args) {
        new Deposite("");
    }
}
