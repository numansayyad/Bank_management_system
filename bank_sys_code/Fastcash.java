package bank_sys_code;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Fastcash extends JFrame implements ActionListener {// action lister used to perform a action by user like
                                                                // clickbutton etc
    JButton deposite, cashwith, fastcash, minstat, pinchange, balance, exit;
    String pinnumber;

    Fastcash(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Select Withdraw Amount");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(200, 300, 500, 35);
        image.add(text);

        deposite = new JButton("RS 100");
        deposite.setBounds(170, 415, 150, 30);
        deposite.addActionListener(this);// thia is a function . this line makes the program respond when the deposit
                                         // button is clicked.
        image.add(deposite);

        cashwith = new JButton("RS 500");
        cashwith.setBounds(350, 415, 150, 30);
        cashwith.addActionListener(this);
        image.add(cashwith);

        fastcash = new JButton("RS 1000");
        fastcash.setBounds(170, 450, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        minstat = new JButton("RS 2000");
        minstat.setBounds(350, 450, 150, 30);
        minstat.addActionListener(this);
        image.add(minstat);

        pinchange = new JButton("RS 5000");
        pinchange.setBounds(170, 485, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance = new JButton("RS 10000");
        balance.setBounds(350, 485, 150, 30);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("BACK");
        exit.setBounds(350, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900, 900);// set the window width and height
        setLocation(300, 0);// set the position of the window on the screen
        setVisible(true);// make the window visible on the screen
    }

    public void actionPerformed(ActionEvent ae) { // actionperform class override
            if (ae.getSource() == exit) {
        setVisible(false);
        new Transation(pinnumber).setVisible(true);
        return;
    }

    String amount = ((JButton) ae.getSource()).getText().substring(3);

    try {
        condatabase c = new condatabase();
            int balance = 0;

        ResultSet rs = c.s.executeQuery(
            "select * from bank where pin = '" + pinnumber + "'");

        while (rs.next()) {
            if (rs.getString("type").equals("Deposit")) {
                balance += Integer.parseInt(rs.getString("amount"));
            } else {
                balance -= Integer.parseInt(rs.getString("amount"));
            }
        }

        if (balance < Integer.parseInt(amount)) {
            JOptionPane.showMessageDialog(null, "Insufficient Balance");
            return;
        }

        Date date = new Date();
        String query =
            "insert into bank values('" + pinnumber + "','" +
            date + "','Withdrawal','" + amount + "')";

        c.s.executeUpdate(query);

        JOptionPane.showMessageDialog(null, "Rs " + amount + " Debited Successfully");
        setVisible(false);
        new Transation(pinnumber).setVisible(true);
    } catch (Exception e) {
        System.out.println(e);
    }
}

    public static void main(String[] args) {
        new Fastcash("");
    }
}
