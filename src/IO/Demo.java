package IO;

import java.awt.*;
import javax.swing.*;

class swingdemo extends JFrame {

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JLabel label3 = new JLabel();
    JTextField text1 = new JTextField();
    JPasswordField pass = new JPasswordField();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JButton button1 = new JButton("Login");
    JButton button2 = new JButton("Cancle");



    swingdemo()
    {
        panel.setBounds(0, 0, 450, 630);
        panel.setBackground(Color.ORANGE);
        panel.setVisible(true);

        panel2.setBounds(450, 0, 630, 630);
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setVisible(true);

        label1.setBounds(150,50,150,150);
        label1.setFont(new Font("cambria",Font.BOLD,25));
        label1.setText("Login Page");
        
        setLayout(null);
        label1.setVisible(true);


        label2.setBounds(80,100,150,150);
        label2.setText("User name: ");
        label2.setVisible(true);

        
        label3.setBounds(80,150,150,150);
        label3.setText("Password: ");
        label3.setVisible(true);

        text1.setBounds(150,165,130,20);
        text1.setVisible(true);

        pass.setBounds(150, 215, 130, 20);
        pass.setVisible(true);

        button1.setBounds(150, 250, 130,20);
        button1.setVisible(true);

        button2.setBounds(150, 275, 130,20);
        button2.setVisible(true);

        add(button2);
        add(button1);
        add(pass);
        add(text1);
        add(label3);
        add(label2);
        add(label1);
        add(panel);
        add(panel2);
        
        
        setBounds(50,100,1080,630);
        setTitle("Login page");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


    }


}



public class Demo {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        swingdemo demo = new swingdemo();
        
        
    }

}
