package GuiApplications;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;

public class LoginForm extends JFrame implements ActionListener {

    JButton b;
    JPanel p;
    JLabel userLabel,passLabel;
    JTextField textField1,textField2;

    LoginForm(){
        JFrame f = new JFrame();
        f.setTitle("Please Login Here!");
        f.setSize(400,300);

        userLabel = new JLabel();
        userLabel.setText("Username:");
        userLabel.setBounds(0,10,100,20);
        textField1 = new JTextField(20);
        textField1.setBounds(100,10,200,20);

        passLabel = new JLabel();
        passLabel.setBounds(0,40,100,20);
        passLabel.setText("Password:");
        textField2 = new JPasswordField(15);
        textField2.setBounds(100,40,200,20);

        b = new JButton("SUBMIT");
        b.setBounds(100,70,200,20);

        p = new JPanel(new GridLayout(3, 1));
        p.add(userLabel);
        p.add(textField1);
        p.add(passLabel);
        p.add(textField2);
        p.add(b);

        b.addActionListener(this);
        f.setContentPane(p);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public void actionPerformed(ActionEvent e) {
        String userValue = textField1.getText();
        String passValue = textField2.getText();
        JLabel l = new JLabel();
        if (userValue.equals("allensaji@gmail.com") && passValue.equals("allen")){
            l.setText("Hello Admin!");
            l.setBounds(0,70,100,20);
            p.add(l);
        }
    }

    public static void main(String[] args) {

        new LoginForm();

    }
}
