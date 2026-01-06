import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.*;

public class Signupone extends JFrame implements ActionListener{

    long Random;
    JTextField nameTextField,fnameTextField,emailTextField,addrTextField,cityTextField,stateTextField,pinTextField;
    JButton next;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;

    Signupone(){
        setLayout(null);

        Random ran = new Random();

         Random=Math.abs((ran.nextLong()% 9000L )+ 1000L);
        //labels
        JLabel formno = new JLabel("Application Form No : "+Random);
        formno.setFont(new Font("Raieway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personaldetails = new JLabel("Page 1 : Personal Details");
        personaldetails.setFont(new Font("Raieway",Font.BOLD,22));
        personaldetails.setBounds(290,80,600,30);
        add(personaldetails);

        JLabel name  = new JLabel("Name:");
        name.setFont(new Font("Raieway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);

        JLabel fname  = new JLabel("Father's Name:");
        fname.setFont(new Font("Raieway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        

        JLabel dob  = new JLabel("Date of Birth :");
        dob.setFont(new Font("Raieway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);

        dateChooser = new JDateChooser();//add jar file for calender 
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Raieway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE); 
        add(male);

         female = new JRadioButton("Female");//JRadioButton is a class and female is a object
        female.setBounds(370,290,70,30); 
        female.setBackground(Color.WHITE); 
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
       genderGroup.add(male);
        genderGroup.add(female);




        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Raieway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        
        JLabel maritalstatus = new JLabel("Marital Status :");
        maritalstatus.setFont(new Font("Raieway",Font.BOLD,20));
        maritalstatus.setBounds(100,390,200,30);
        add(maritalstatus);

        
         married = new JRadioButton("Married");
        married.setBounds(300,390,90,30);
        married.setBackground(Color.WHITE); 
        add(married);

         unmarried = new JRadioButton("Unmarried");//JRadioButton is a class and female is a object
        unmarried.setBounds(390,390,100,30); 
        unmarried.setBackground(Color.WHITE); 
        add(unmarried);

        
         other = new JRadioButton("Other");//JRadioButton is a class and female is a object
        other.setBounds(490,390,100,30); 
        other.setBackground(Color.WHITE); 
        add(other);

        ButtonGroup statusall = new ButtonGroup();
        statusall.add(married);
        statusall.add(unmarried);
        statusall.add(other);
        
        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raieway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);

        addrTextField = new JTextField();
        addrTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        addrTextField.setBounds(300,440,400,30);
        add(addrTextField);
        

        JLabel city= new JLabel("City :");
        city.setFont(new Font("Raieway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        
        JLabel state= new JLabel("State :");
        state.setFont(new Font("Raieway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);

         stateTextField = new JTextField();
        stateTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        JLabel pincode= new JLabel("Pin Code :");
        pincode.setFont(new Font("Raieway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);

         pinTextField = new JTextField();
        pinTextField.setFont(new Font ("Raleway",Font.BOLD,14));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        

         next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
       // ======================================================================


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        

    }

public void actionPerformed(ActionEvent ae) {
    String formno =""+ Random;
    String name = nameTextField.getText();
    String fname= fnameTextField.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
    String gender=null;
    if(male.isSelected()){
        gender="Male";
    }
    else if (female.isSelected()){
        gender="Female";
    }
    String email=emailTextField.getText();
    String maritalstatus=null;
    if(married.isSelected()){
        maritalstatus="married";
    }
    else if (unmarried.isSelected()){
        maritalstatus="unmarried";
    }
    else if (other.isSelected()){
        maritalstatus="other";
    }
    String address=addrTextField.getText();
    String city = cityTextField.getText();
    String state=stateTextField.getText();
    String pincode=pinTextField.getText();

    try{
        if(name.equals(""));
        JOptionPane.showMessageDialog(null,"Name is Required ");
    }
    catch(Exception e){
        System.out.println(e);

    }
}

    public static void main(String[] args) {
        new Signupone();
    }
}
