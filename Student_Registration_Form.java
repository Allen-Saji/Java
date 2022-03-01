package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentRegistration extends JFrame implements ActionListener {
	
	

    JButton b;
    JPanel p;
    JLabel nameLabel,passLabel,addLabel,admLabel,genLabel,ageLabel,emailLabel,phoneLabel,batchLabel;
    JTextField name,adm_no,age,email,phone,batch,pass;
    JTextArea add;
    JRadioButton male,female;
    JFrame f;

    StudentRegistration(){
        f = new JFrame();
        f.setTitle("Student Registration Form");
        f.setSize(450,500);

        nameLabel = new JLabel();
        nameLabel.setText("Full Name:");
        nameLabel.setBounds(0,10,100,20);
        name = new JTextField(20);
        name.setBounds(100,10,200,20);

        admLabel = new JLabel();
        admLabel.setText("Admission No.: ");
        admLabel.setBounds(0,40,100,20);
        adm_no = new JTextField(20);
        adm_no.setBounds(100,40,200,20);

        addLabel = new JLabel();
        addLabel.setText("Address: ");
        addLabel.setBounds(0,70,100,20);
        add = new JTextArea(3,20);
        add.setBounds(100,70,200,60);

        genLabel = new JLabel();
        genLabel.setText("Gender");
        genLabel.setBounds(0,140,100,20);
        male = new JRadioButton("Male");
        male.setBounds(100,140,100,20);
        female = new JRadioButton("Female");
        female.setBounds(210,140,100,20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);bg.add(female);

        ageLabel = new JLabel();
        ageLabel.setText("Age: ");
        ageLabel.setBounds(0,170,100,20);
        age = new JTextField(20);
        age.setBounds(100,170,200,20);

        emailLabel = new JLabel();
        emailLabel.setText("E-mail: ");
        emailLabel.setBounds(0,200,100,20);
        email = new JTextField(20);
        email.setBounds(100,200,200,20);

        phoneLabel = new JLabel();
        phoneLabel.setText("Phone No.: ");
        phoneLabel.setBounds(0,230,100,20);
        phone = new JTextField(20);
        phone.setBounds(100,230,200,20);

        batchLabel = new JLabel();
        batchLabel.setText("Batch ");
        batchLabel.setBounds(0,260,100,20);
        batch = new JTextField(20);
        batch.setBounds(100,260,200,20);

        passLabel = new JLabel();
        passLabel.setBounds(0,290,100,20);
        passLabel.setText("Password:");
        pass = new JPasswordField(15);
        pass.setBounds(100,290,200,20);

        b = new JButton("SUBMIT");
        b.setBounds(100,320,200,20);
        b.addActionListener(this);

        p = new JPanel();
        p.add(nameLabel);
        p.add(addLabel);
        p.add(admLabel);
        p.add(passLabel);
        p.add(genLabel);
        p.add(ageLabel);
        p.add(emailLabel);
        p.add(batchLabel);
        p.add(phoneLabel);
        p.add(name);
        p.add(add);
        p.add(adm_no);
        p.add(male);
        p.add(female);
        p.add(age);
        p.add(phone);
        p.add(batch);
        p.add(email);
        p.add(pass);
        p.add(b);

        f.setContentPane(p);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(f, "Student Registration Completed");
         Connection conn;
    	 Statement stmt;
    	 
    	 try {
    		 conn = DriverManager.getConnection("jdbc:mysql://localhost/student_database","root",""); 
			 stmt = conn.createStatement();
			 
			 String name1 = name.getText();
			 String adm  = adm_no.getText();
			 String age1 = age.getText();
			 String address = add.getText();
			 String em = email.getText();
			 String ph = phone.getText();
			 String bat = batch.getText();
			 String p = pass.getText();
			 
			 String gen;
			 
			 if(male.isSelected()) {
				  gen = "male";
			 }else {
				  gen = "female";
			 }
			 
			 String strSql = "INSERT INTO student(Name,Adm_no,Address,age,batch,phone_number,email,gender,password) VALUES ('"+name1+"','"+adm+"','"+address+"','"+age1+"','"+bat+"','"+ph+"','"+em+"','"+gen+"','"+p+"')";
			 stmt.executeUpdate(strSql);
				System.out.println("\nThe entered data has been inseted into the table\n");
					
    	 }catch (Exception e1) {
 			// TODO: handle exception
 			System.out.println(e);
 		}
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
