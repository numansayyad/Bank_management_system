package bank_sys_code;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.*;

public class Signuptwo extends JFrame implements ActionListener {

    JTextField panTextField, adharTextField;
    JButton next;
    JRadioButton yess, noo, eyess, enoo;
    JComboBox religion, cato, incat, educa, occ;
    String formno;

    Signuptwo(String formno) {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FROM -PAGE 2");
        this.formno = formno;
        // labels

        JLabel additionaldetails = new JLabel("Page 2 : Additional Details");
        additionaldetails.setFont(new Font("Raieway", Font.BOLD, 22));
        additionaldetails.setBounds(290, 80, 600, 30);
        add(additionaldetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raieway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        String[] valreligions = {
                "Hindu",
                "Muslim",
                "Christian",
                "Sikh",
                "Buddhist",
                "Jain",
                "Parsi",
                "Jewish",
                "Other"
        };

        religion = new JComboBox(valreligions);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel cname = new JLabel("Category:");
        cname.setFont(new Font("Raieway", Font.BOLD, 20));
        cname.setBounds(100, 190, 200, 30);
        add(cname);
        String[] cat = {
                "General",
                "OBC",
                "ST",
                "SC",
                "Other"
        };
        cato = new JComboBox(cat);
        cato.setBounds(300, 190, 400, 30);
        cato.setBackground(Color.WHITE);
        add(cato);

        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raieway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);
        String[] incomecatogery = {
                "NULL",
                "<1,50,000",
                "<2,50,00",
                "<5,00,000",
                "upto 10,00,000"
        };
        incat = new JComboBox(incomecatogery);
        incat.setBounds(300, 240, 400, 30);
        incat.setBackground(Color.WHITE);
        add(incat);

        JLabel gender = new JLabel("Educationl :");
        gender.setFont(new Font("Raieway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raieway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String[] evalues = {
                "Non Graduate",
                "Graduate",
                "Post Graduate",
                "Others",
        };
        educa = new JComboBox(evalues);
        educa.setBounds(300, 315, 400, 30);
        educa.setBackground(Color.WHITE);
        add(educa);

        JLabel occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("Raieway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);

        String[] occuvalue = {
                "Salaried",
                "Self Employed",
                "Business",
                "Student",
                "Retired",
                "Others",

        };
        occ = new JComboBox(occuvalue);
        occ.setBounds(300, 390, 400, 30);
        occ.setBackground(Color.WHITE);
        add(occ);

        JLabel pan = new JLabel("PAN No :");
        pan.setFont(new Font("Raieway", Font.BOLD, 20));
        pan.setBounds(100, 440, 200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel adhar = new JLabel("Aadhar No :");
        adhar.setFont(new Font("Raieway", Font.BOLD, 20));
        adhar.setBounds(100, 490, 200, 30);
        add(adhar);

        adharTextField = new JTextField();
        adharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        adharTextField.setBounds(300, 490, 400, 30);
        add(adharTextField);

        JLabel senior = new JLabel("Senior Citizen :");
        senior.setFont(new Font("Raieway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);

        yess = new JRadioButton("Yes");
        yess.setBounds(300, 540, 90, 30);
        yess.setBackground(Color.WHITE);
        add(yess);

        noo = new JRadioButton("No");
        noo.setBounds(390, 540, 90, 30);
        noo.setBackground(Color.WHITE);
        add(noo);

        ButtonGroup statusall = new ButtonGroup();
        statusall.add(yess);
        statusall.add(noo);

        JLabel pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raieway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

        eyess = new JRadioButton("Yes");
        eyess.setBounds(300, 590, 90, 30);
        eyess.setBackground(Color.WHITE);
        add(eyess);

        enoo = new JRadioButton("No");
        enoo.setBounds(390, 590, 90, 30);
        enoo.setBackground(Color.WHITE);
        add(enoo);

        ButtonGroup show = new ButtonGroup();
        show.add(eyess);
        show.add(enoo);

        ;

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        // ======================================================================

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) cato.getSelectedItem();
        String sincome = (String) incat.getSelectedItem();
        String seducation = (String) educa.getSelectedItem();
        String soccupation = (String) occ.getSelectedItem();
        String seniorcitizen = null;

        if (yess.isSelected()) {
            seniorcitizen = "Yes";
        } else if (noo.isSelected()) {
            seniorcitizen = "No";
        }

        String existingaccount = null;
        if (eyess.isSelected()) {
            existingaccount = "Yes";
        } else if (enoo.isSelected()) {
            existingaccount = "No";
        }
        String span = panTextField.getText();
        String adhar = adharTextField.getText();

        if (span.isBlank() || adhar.isBlank()) {
            JOptionPane.showMessageDialog(null, "PAN and Aadhar are required");
            return;
        }

        try {
            condatabase c = new condatabase();

            String query = "INSERT INTO signuptwo(formno,religion,category,income,education,occupation,pan,adhar,seniorcitizen,existingaccount) "
                    +
                    "VALUES('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" +
                    seducation + "','" + soccupation + "','" + span + "','" + adhar + "','" +
                    seniorcitizen + "','" + existingaccount + "')";

            c.s.executeUpdate(query);

            JOptionPane.showMessageDialog(null, "Page 2 Details Saved Successfully");

            // next page open here (SignupThree)
            // new Signupthree(formno).setVisible(true);
            // setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signuptwo("");
    }
}
