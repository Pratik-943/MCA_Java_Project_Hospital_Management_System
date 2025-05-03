package hospital.management.system;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Reception extends JFrame {
    Reception(){

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(5, 160, 1524, 670);
        panel.setBackground(new Color(109, 164, 170));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5, 5, 1524, 150);
        panel1.setBackground(new Color(109, 164, 170));
        add(panel1);

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/dr.png"));
        Image image = img1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon img2 = new ImageIcon(image);
        JLabel label1 = new JLabel(img2);
        label1.setBounds(1100, 50, 300, 100);
        panel1.add(label1);

        JButton btm1 = new JButton("Add new Patient");
        btm1.setBounds(30, 15, 200, 30);
        btm1.setBackground(new Color(246, 215, 118));
        panel1.add(btm1);
        btm1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new NewPatient();
            }
        });

        JButton btm2 = new JButton("Search Room");
        btm2.setBounds(30, 58, 200, 30);
        btm2.setBackground(new Color(246, 215, 118));
        panel1.add(btm2);
        btm2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SearchRoom();
            }
        });

        JButton btm3 = new JButton("Department");
        btm3.setBounds(30, 100, 200, 30);
        btm3.setBackground(new Color(246, 215, 118));
        panel1.add(btm3);
        btm3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Department();
            }
        });

        JButton btm4 = new JButton("All Employee Info");
        btm4.setBounds(270, 15, 200, 30);
        btm4.setBackground(new Color(246, 215, 118));
        panel1.add(btm4);
        btm4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Employee_Info();
            }
        });

        JButton btm5 = new JButton("Patient Info");
        btm5.setBounds(270, 58, 200, 30);
        btm5.setBackground(new Color(246, 215, 118));
        panel1.add(btm5);
        btm5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ALL_Patient_Info();
            }
        });

        JButton btm6 = new JButton("Patient Discharge");
        btm6.setBounds(270, 100, 200, 30);
        btm6.setBackground(new Color(246, 215, 118));
        panel1.add(btm6);
        btm6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_Discharge();
            }
        });

        JButton btm7 = new JButton("Update Patient Details");
        btm7.setBounds(510, 15, 200, 30);
        btm7.setBackground(new Color(246, 215, 118));
        panel1.add(btm7);
        btm7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Patient_Discharge();
            }
        });

        JButton btm8 = new JButton("Hospital Ambulance");
        btm8.setBounds(510, 58, 200, 30);
        btm8.setBackground(new Color(246, 215, 118));
        panel1.add(btm8);
        btm8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ambulance();
            }
        });

        JButton btm9 = new JButton("Logout");
        btm9.setBounds(510, 100, 200, 30);
        btm9.setBackground(new Color(246, 215, 118));
        panel1.add(btm9);
        btm9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });




        setSize(1360,768);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Reception();
    }

}
