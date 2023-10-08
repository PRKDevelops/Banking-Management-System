package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
//import com.toedter.calender.JDateChooser;
public class SignupOne extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;   
                  
	long Random;
	JTextField nameTextField, fnameTextField, dobTextField , emailTextField, addressTextField, cityTextField, pinTextField, stateTextField;
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	
	SignupOne(){
		                                                        
		setLayout (null);
		Random ran =  new Random();
		Random = Math.abs(ran.nextLong() % 9000L)+ 1000L;
		
		JLabel formno = new JLabel ("APPLICATION FORM NO. "+ Random);
		formno.setFont(new Font("Relway", Font.BOLD, 38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personalDetails = new JLabel ("Page 1: Personal Details");
		personalDetails.setFont(new Font("Relway", Font.BOLD, 22));
		personalDetails.setBounds(290,80,400,30);
		add(personalDetails);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Relway",Font.BOLD, 20));
		name.setBounds(100,140,100,30);
		add(name);
		
	    nameTextField = new JTextField();
		nameTextField.setFont(new Font("Relway",Font.BOLD,14));
		nameTextField.setBounds(300,140,300,30);
		add(nameTextField);
		     
		JLabel fname = new JLabel("Father's Name:");
		fname.setFont(new Font("Relway",Font.BOLD, 20));
		fname.setBounds(100,190,200,30);
		add(fname);
		
	    fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("Relway",Font.BOLD,14));
		fnameTextField.setBounds(300,190,300,30);
		add(fnameTextField);
		
		JLabel dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Relway",Font.BOLD, 20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
	   dobTextField = new JTextField();
	   dobTextField.setFont(new Font("Relway",Font.BOLD,14));
	   dobTextField.setBounds(300,240,300,30);
	   add(dobTextField);
		
		//JDateChooser datechooser = new JDateChooser();
		//datechooser.setBounds(300,240,200,30);
		//add(datechooser);
		                                                                                    
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Relway",Font.BOLD, 20));
		gender.setBounds(100,290,100,30);
		add(gender);
		
	    male = new JRadioButton("Male");
		male.setBounds(300,290,100,30);
		male.setBackground(Color.white);
		add(male);
		
	    female = new JRadioButton("Female");
		female.setBounds(400,290,100,30);
		female.setBackground(Color.white);
		add(female);
		
	    other = new JRadioButton("Other");
		other.setBounds(500,290,100,30);
		other.setBackground(Color.white);
		add(other);
		
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		genderGroup.add(other);
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("Relway",Font.BOLD, 20));
		email.setBounds(100,340,200,30);
		add(email);
		
	    emailTextField = new JTextField();
		emailTextField.setFont(new Font("Relway",Font.BOLD,14));
		emailTextField.setBounds(300,340,300,30);
		add(emailTextField);
		
		JLabel marital = new JLabel("Marriage Status:");
		marital.setFont(new Font("Relway",Font.BOLD, 20));
		marital.setBounds(100,390,200,30);
		add(marital);
		
	    married = new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.white);
		add(married);
		
	    unmarried = new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		ButtonGroup maritalgroup = new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);     
		         
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Relway",Font.BOLD, 20));
		address.setBounds(100,440,200,30);
		add(address);
		
	    addressTextField = new JTextField();
		addressTextField.setFont(new Font("Relway",Font.BOLD,14));
		addressTextField.setBounds(300,440,300,30);
		add(addressTextField);
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Relway",Font.BOLD, 20));
		city.setBounds(100,490,100,30);
		add(city);
		
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("Relway",Font.BOLD,14));
		cityTextField.setBounds(300,490,300,30);
		add(cityTextField);
		
		JLabel pin = new JLabel("Pin Code:");
		pin.setFont(new Font("Relway",Font.BOLD, 20));
		pin.setBounds(100,540,100,30);
		add(pin);
		
		pinTextField = new JTextField();
		pinTextField.setFont(new Font("Relway",Font.BOLD,14));
		pinTextField.setBounds(300,540,300,30);
		add(pinTextField);
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Relway",Font.BOLD, 20));
		state.setBounds(100,590,100,30);
		add(state);
		
	    stateTextField = new JTextField();
		stateTextField.setFont(new Font("Relway",Font.BOLD,14));
		stateTextField.setBounds(300,590,300,30);
		add(stateTextField);
		
	    next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Relway",Font.BOLD,14));
		next.setBounds(516,680,80,30);
		next.addActionListener(this);
		add(next);
		
    	getContentPane().setBackground(Color.WHITE);
    	setSize(850,800);
    	setLocation(350,10);
    	setVisible(true);
    }

	public void actionPerformed(ActionEvent ae) {
		String formno = ""+Random;
		String name = nameTextField.getText(); 
		String fname = fnameTextField.getText();
		String dob = dobTextField.getText();
		//String dob = ((JTextField) datechooser.getDateEditor().getUiComponent()).getText();	
		String gender = null;
		if(male.isSelected()) {
			gender = "Male";
		} else if(female.isSelected()) {
			gender = "Female";
		}  else if(other.isSelected()) {
			gender = "Other";
		}
		String email = emailTextField.getText();
		String marital = null;
		if(married.isSelected()) {
			marital = "Married";
		} else if(unmarried.isSelected()) {
			marital = "Unmarried";
		} 
		String address = addressTextField.getText();   
		String city = cityTextField.getText();
		String pin = pinTextField.getText();
		String state = stateTextField.getText();
		
		try {
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name is required");
			} else {
				Conn c = new Conn();
				String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
				c.s.executeUpdate(query);		
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
			
		} catch(Exception e) {
			System.out.println(e);
		}
		}
	public static void main(String args[]) {
		new SignupOne();
	}
}
