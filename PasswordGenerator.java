import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;  
import java.awt.event.*;  
import java.net.*;  
import java.util.Random;
public class PasswordGenerator extends JFrame implements ActionListener {   
    JLabel l,l1;  
    JTextField tf;  
    JButton b;  
PasswordGenerator(){  
    super("Password Generator Tool");
    getContentPane().setBackground( Color.CYAN);
    l=new JLabel("Your Password:");  
    l.setBounds(50,70,150,20);;  
    Font f=new Font("Verdana",Font.BOLD,20);
    tf=new JTextField();  
    tf.setCaretColor(Color.yellow);
    tf.setBackground(Color.black);
    tf.setForeground(Color.yellow);
    tf.setBounds(50,100,200,30);  
    tf.setFont(f);
    b=new JButton("Generate");  
    b.setBounds(100,150,100,30);  
    b.addActionListener(this);  
    add(l);  
    add(tf);  
    add(b);  
    setSize(300,300);  
    setLayout(null);  
    setVisible(true);  
}
public void actionPerformed(ActionEvent e){  
    String url=tf.getText();  
    String Cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Sma = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
                String symbols = "!@#$%^&*_=+-/.?<>)";
 
 
        String values = Cap + Sma +
                        num + symbols;
 
        Random rndm_method = new Random();
 
        char[] password = new char[10];
 
        for (int i = 0; i < 10; i++)
        {
            password[i] =
            values.charAt(rndm_method.nextInt(values.length()));
            //rndm_method.nextInt((max - min) + 1) + min;
        } 
        tf.setText(password+"");
} 
    public static void main(String[] args) {
        new PasswordGenerator();
    }
    
}