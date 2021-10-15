package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements ActionListener {
    public JFrame jframe;
    public JButton btn1, btn2;
    public JLabel label;
    public Container con;

    public void setMenu() {
        jframe = new JFrame("Main Menu");
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
        jframe.setBounds(100, 100, 500, 500);
        jframe.setResizable(false);
        jframe.setLayout(null);

        con = jframe.getContentPane();
        con.setBackground(Color.GREEN);

        Font font = new Font("Cambria Math", Font.BOLD, 18);
        label = new JLabel("------Welcome to Our Project------");
        label.setFont(font);
        con.add(label);
        label.setBounds(100, 30, 400, 30);

        btn1 = new JButton("MCQ");
        btn2 = new JButton("GPA Calculator");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        con.add(btn1);
        con.add(btn2);
        btn1.setBounds(100, 200, 80, 50);
        btn2.setBounds(250, 200, 150, 50);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==btn1){
            new Quiz(" Quiz Of Java");
        }
        if (e.getSource()==btn2){
            GPA obj = new GPA();
            obj.gpa();

        }
    }

}
