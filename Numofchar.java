package primepackage;

import java.awt.event.*;
import javax.swing.*;
public class Numofchar implements ActionListener
{
    JButton b;
    JTextArea area;
    JLabel l1,l2;

    Numofchar()
    {
        JFrame f = new JFrame("Number of Words and Characters");
        JPanel p = new JPanel();

        l1 = new JLabel();
        l1.setBounds(100,100,100,30);
        l2 = new JLabel();
        l2.setBounds(200,100,100,30);
        area = new JTextArea("Enter the text");
        area.setBounds(100,140,200,200);
        b = new JButton("find");
        b.setBounds(150,350,90,30);


        p.add(area);p.add(b);
        p.add(l1);p.add(l2);
        b.addActionListener(this);
        f.setContentPane(p);
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed (ActionEvent e)
    {
        String text=area.getText();
        String words[] = text.split("\\s");
        l1.setText("Words: "+words.length);
        l2.setText("Character: "+text.length());
    }
    public static void main(String[] args) {
        new Numofchar();
    }

}
