package bank_sys_code;

import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ministatement extends JFrame {

    String pinnumber;

    Ministatement(String pinnumber) {

        this.pinnumber= pinnumber;   
        setLayout(null);
        setTitle("Mini Statement");

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 60, 350, 20);
        add(card);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 90, 350, 20);
        add(balanceLabel);

        JLabel mini = new JLabel();
        mini.setBounds(20, 130, 360, 70);
        add(mini);

        // Fetch card number
        try {
            condatabase c = new condatabase();
            ResultSet rs = c.s.executeQuery(
                "select * from login where pinnumber = '" + pinnumber + "'"
            );

            if (rs.next()) {
                String cardno = rs.getString("cardnumber");
                card.setText(
                    "Card Number : " +
                    cardno.substring(0, 4) +
                    "XXXXXXXX" +
                    cardno.substring(12)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // Fetch transactions + calculate balance
        try {
            condatabase c = new condatabase();
            ResultSet rs = c.s.executeQuery(
                "select * from bank where pin = '" + pinnumber + "'"
            );

            int bal = 0;
            String data = "<html>";

            while (rs.next()) {
                data += rs.getString("date") +
                        "&nbsp;&nbsp;&nbsp;" +
                        rs.getString("type") +
                        "&nbsp;&nbsp;&nbsp;" +
                        rs.getString("amount") +
                        "<br><br>";

                if (rs.getString("type").equalsIgnoreCase("Deposit")) {
  bal += Integer.parseInt(rs.getString("amount").replace(",", ""));
                } else {
    bal -= Integer.parseInt(rs.getString("amount").replace(",", ""));
                }
            }

            data += "</html>";
            mini.setText(data);
            balanceLabel.setText("Your current balance is Rs " + bal);

        } catch (Exception e) {
            System.out.println(e);
        }

        setLocation(20, 20);
        setSize(400, 600);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ministatement("");
    }
}
