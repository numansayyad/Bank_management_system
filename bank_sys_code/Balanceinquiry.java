package bank_sys_code;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Balanceinquiry extends JFrame implements ActionListener {

    JButton back;
    String pinnumber;

    Balanceinquiry(String pinnumber) {

        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        int balance = 0;

        try {
            condatabase c = new condatabase();

            ResultSet rs = c.s.executeQuery(
                "select * from bank where pin = '" + pinnumber + "'"
            );

            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                      balance += Integer.parseInt(rs.getString("amount").replace(",", ""));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount").replace(",", ""));
}
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        JLabel text = new JLabel("Your Current Balance is Rs " + balance);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(220, 300, 500, 200);
        image.add(text);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transation(pinnumber).setVisible(true);
    }

    public static void main(String[] args) {
        new Balanceinquiry("");
    }
}
