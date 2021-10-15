package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPA implements ActionListener {
    public JFrame frame;
    public JButton btn;
    public JTextField text1, text2, text3, text4, text5, gpa1, gpa2, gpa3, gpa4, gpa5;
    public JLabel label1, label2, label3, label4, label5, label6, label7, head1, head2, head3;
    public Container container;

    public void gpa() {
        frame = new JFrame("Gpa Calculator");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 500);
        frame.setResizable(false);
        frame.setLayout(null);

        container = frame.getContentPane();
        container.setBackground(Color.pink);

        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();

        gpa1 = new JTextField();
        gpa2 = new JTextField();
        gpa3 = new JTextField();
        gpa4 = new JTextField();
        gpa5 = new JTextField();


        container.add(text1);
        container.add(text2);
        container.add(text3);
        container.add(text4);
        container.add(text5);

        container.add(gpa1);
        container.add(gpa2);
        container.add(gpa3);
        container.add(gpa4);
        container.add(gpa5);

        text1.setBounds(250, 80, 50, 30);
        text2.setBounds(250, 130, 50, 30);
        text3.setBounds(250, 180, 50, 30);
        text4.setBounds(250, 230, 50, 30);
        text5.setBounds(250, 280, 50, 30);

        gpa1.setBounds(390, 80, 50, 30);
        gpa2.setBounds(390, 130, 50, 30);
        gpa3.setBounds(390, 180, 50, 30);
        gpa4.setBounds(390, 230, 50, 30);
        gpa5.setBounds(390, 280, 50, 30);

        Font font = new Font("Cambria Math", Font.BOLD, 18);
        label1 = new JLabel("OOP Java :");
        label1.setFont(font);
        label2 = new JLabel("OOP Java Lab :");
        label2.setFont(font);
        label3 = new JLabel("Electronics :");
        label3.setFont(font);
        label4 = new JLabel("Electronics Lab :");
        label4.setFont(font);
        label5 = new JLabel("Co-ordinate Geometry :");
        label5.setFont(font);
        label6 = new JLabel();
        label6.setFont(font);
        label7 = new JLabel();
        label7.setFont(font);

        head1 = new JLabel("Subject Name");
        head1.setFont(font);
        head2 = new JLabel("Subject Credit");
        head2.setFont(font);
        head3 = new JLabel(" GPA");
        head3.setFont(font);


        container.add(label1);
        container.add(label2);
        container.add(label3);
        container.add(label4);
        container.add(label5);
        container.add(label6);
        container.add(label7);

        container.add(head1);
        container.add(head2);
        container.add(head3);

        label1.setBounds(40, 80, 150, 30);
        label2.setBounds(40, 130, 150, 30);
        label3.setBounds(40, 180, 150, 30);
        label4.setBounds(40, 230, 150, 30);
        label5.setBounds(30, 280, 210, 30);
        label6.setBounds(50, 330, 300, 30);
        label7.setBounds(110, 350, 300, 30);
        head1.setBounds(30, 30, 300, 30);
        head2.setBounds(200, 30, 300, 30);
        head3.setBounds(390, 30, 300, 30);

        btn = new JButton("Result");
        btn.addActionListener(this);
        container.add(btn);
        btn.setBounds(180, 400, 80, 30);

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        int credit1 = Integer.parseInt(text1.getText());
        int credit2 = Integer.parseInt(text2.getText());
        int credit3 = Integer.parseInt(text3.getText());
        int credit4 = Integer.parseInt(text4.getText());
        int credit5 = Integer.parseInt(text5.getText());


        float sub1 = Float.parseFloat(gpa1.getText());
        float sub2 = Float.parseFloat(gpa2.getText());
        float sub3 = Float.parseFloat(gpa3.getText());
        float sub4 = Float.parseFloat(gpa4.getText());
        float sub5 = Float.parseFloat(gpa5.getText());

        if (e.getSource() == btn) {
            int sum = (credit1 + credit2 + credit3 + credit4 + credit5);
            label6.setText("Total Credit         =           " + sum);

            float gpa = (((sub1 * credit1) + (sub2 * credit2) + (sub3 * credit3) + (sub4 * credit4) + (sub5 * credit5)) / sum);
            label7.setText("GPA         =           " + String.format("%.02f", gpa));
        }
    }
}
