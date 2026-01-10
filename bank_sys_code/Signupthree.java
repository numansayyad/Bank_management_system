package bank_sys_code;
import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
public class Signupthree extends JFrame{
JRadioButton r1,r2,r3,r4;
JCheckBox c1,c2,c3,c4,c5,c6,c7;
    Signupthree() {
    setLayout(null);

    JLabel l1 = new JLabel("Page 3: Account Details");
    l1.setFont(new Font("Raleway", Font.BOLD, 22));
    l1.setBounds(280, 40, 400, 40);
    l1.setBackground(Color.WHITE);
    add(l1);
    
    JLabel type = new JLabel("Account Type ");
    type.setFont(new Font("Raleway", Font.BOLD, 22));
    type.setBounds(100, 140, 200, 30);
    add(type);

    r1 = new JRadioButton("Saving Account");
    r1.setFont(new Font("Raleway",Font.BOLD,16));
    r1.setBackground(Color.WHITE);
    r1.setBounds(100,180,250,20);
    add(r1);

    r2 = new JRadioButton("Fixed Deposite Account ");
    r2.setFont(new Font("Raleway",Font.BOLD,16));
    r2.setBackground(Color.WHITE);
    r2.setBounds(350,180,250,20);
    add(r2);

    r3 = new JRadioButton("Current Accoun");
    r3.setFont(new Font("Raleway",Font.BOLD,16));
    r3.setBackground(Color.WHITE);
    r3.setBounds(100,220,250,20);
    add(r3);

    r4 = new JRadioButton("Recurring Deposit Account");
    r4.setFont(new Font("Raleway",Font.BOLD,16));
    r4.setBackground(Color.WHITE);
    r4.setBounds(350,220,250,20);
    add(r4);



ButtonGroup groupaccount = new ButtonGroup();
// create a group so only one radio button can be selected

groupaccount.add(r1);
groupaccount.add(r2);
groupaccount.add(r3);
groupaccount.add(r4);
// add all radio buttons to the same group




    JLabel card = new JLabel("Card No :");
    card.setFont(new Font("Raleway", Font.BOLD, 22));
    card.setBounds(100, 300, 200, 30);
    add(card);

    
    JLabel number = new JLabel("XXXX-XXXX-XXXX-8209 ");
    number.setFont(new Font("Raleway", Font.BOLD, 22));
    number.setBounds(330, 300, 300, 30);
    add(number);
    
    JLabel details = new JLabel("Your 16 Digit Card No ");
    details.setFont(new Font("Raleway", Font.BOLD, 12));
    details.setBounds(100, 330, 300, 20);
    add(details);

    
    JLabel pin = new JLabel("Pin No :");
    pin.setFont(new Font("Raleway", Font.BOLD, 22));
    pin.setBounds(100, 370, 200, 30);
    add(pin);

    
    JLabel pnumber = new JLabel("XXXX");
    pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
    pnumber.setBounds(330, 370, 300, 30);
    add(pnumber);

    
    JLabel pdetails = new JLabel("Your 4 Digit Pin No ");
    pdetails.setFont(new Font("Raleway", Font.BOLD, 12));
    pdetails.setBounds(100, 400, 300, 20);
    add(pdetails);

    JLabel services = new JLabel("Services Required : ");
    services.setFont(new Font("Raleway", Font.BOLD, 22));
    services.setBounds(100, 450, 300, 30);
    add(services);

    c1=new JCheckBox("ATM CARD");
    c1.setBackground(Color.WHITE);
    c1.setFont(new Font("raleway",Font.BOLD,16));
    c1.setBounds(100,500,200,30);
    add(c1);


    c2=new JCheckBox("Internet Banking");
    c2.setBackground(Color.WHITE);
    c2.setFont(new Font("raleway",Font.BOLD,16));
    c2.setBounds(350,500,200,30);
    add(c2);
    
    c3=new JCheckBox("Mobile Banking");
    c3.setBackground(Color.WHITE);
    c3.setFont(new Font("raleway",Font.BOLD,16));
    c3.setBounds(100,550,200,30);
    add(c3);
    
    c4=new JCheckBox("Email and SMS Alerts");
    c4.setBackground(Color.WHITE);
    c4.setFont(new Font("raleway",Font.BOLD,16));
    c4.setBounds(350,500,200,30);
    add(c4);

    
    c5=new JCheckBox("Cheque Book ");
    c5.setBackground(Color.WHITE);
    c5.setFont(new Font("raleway",Font.BOLD,16));
    c5.setBounds(100,600,200,30);
    add(c5);
    
    c6=new JCheckBox("E-Statement");
    c6.setBackground(Color.WHITE);
    c6.setFont(new Font("raleway",Font.BOLD,16));
    c6.setBounds(350,600,200,30);
    add(c6);
    
    c7=new JCheckBox("I hereby declares that the above entered details are correct to the best of my Knowledge");
    c7.setBackground(Color.WHITE);
    c7.setFont(new Font("raleway",Font.BOLD,16));
    c7.setBounds(100,680,200,12);
    add(c7);


    setSize(850, 820);
    setLocation(350, 0);
    setVisible(true);
}

public static void main(String args[]) {
    new Signupthree();
}}