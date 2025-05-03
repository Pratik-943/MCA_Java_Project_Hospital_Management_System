package hospital.management.system;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JTextField textField;
    JPasswordField jPasswordField;
    JButton loginButton, closeButton;

    Login(){

        JLabel headlabel = new JLabel("Admin");
        headlabel.setBackground(new Color(0, 0, 0));
        headlabel.setBounds(150, 15, 100, 30);
        headlabel.setFont(new Font("Tahoma", Font.BOLD, 22));
        headlabel.setForeground(Color.BLACK);
        getContentPane().add(headlabel);

        JLabel namelabel = new JLabel("Username");
        namelabel.setBackground(new Color(0, 0, 0));
        namelabel.setBounds(40, 85, 100, 30);
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        namelabel.setForeground(Color.BLACK);
        getContentPane().add(namelabel);

        textField = new JTextField();
        textField.setBounds(150, 85, 150, 30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(new Color(255, 179, 0));
        getContentPane().add(textField);

        JLabel password = new JLabel("Password");
        password.setBackground(new Color(0, 0, 0));
        password.setBounds(40, 135, 100, 30);
        password.setFont(new Font("Tahoma", Font.BOLD, 16));
        password.setForeground(Color.BLACK);
        getContentPane().add(password);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 135, 150, 30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(255, 179, 0));
        getContentPane().add(jPasswordField);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(260, 160, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(250, -30, 400, 300);
        add(label);

        loginButton = new JButton("Login");
        loginButton.setBounds(40, 200, 120, 30);
        loginButton.setFont(new Font("serif", Font.BOLD, 15));
        loginButton.setBackground(Color.BLACK);
        loginButton.setForeground(Color.WHITE);
        loginButton.addActionListener(this);
        getContentPane().add(loginButton);

        closeButton = new JButton("Cancel");
        closeButton.setBounds(180, 200, 120, 30);
        closeButton.setFont(new Font("serif", Font.BOLD, 15));
        closeButton.setBackground(Color.BLACK);
        closeButton.setForeground(Color.WHITE);
        closeButton.addActionListener(this);
        getContentPane().add(closeButton);




        getContentPane().setBackground(new java.awt.Color(109, 164, 170));
        setSize(600,300);
        setLocation(340,240);
        setLayout(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            try {
                DB_Connect con = new DB_Connect();
                String user = textField.getText();
                String pass = jPasswordField.getText();

                String query = "Select * from login where username = '"+user+"' and password ='"+pass+"'";
                ResultSet resultSet = con.sm.executeQuery(query);

                if (resultSet.next()) {
                    new Reception();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }


            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.exit(10);

        }

    }

    public static void main(String[] args) {
        new Login();
    }

}