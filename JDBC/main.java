import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class main {
    public static void main(String args[]) {

        JFrame f = new JFrame("Employee Details");
        f.setSize(400, 300);
        f.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel l1 = new JLabel("Employee No:");
        JTextField t1 = new JTextField();

        JLabel l2 = new JLabel("Employee Name:");
        JTextField t2 = new JTextField();

        JLabel l3 = new JLabel("Salary:");
        JTextField t3 = new JTextField();

        JButton btn = new JButton("Submit");

        f.add(l1);
        f.add(t1);

        f.add(l2);
        f.add(t2);

        f.add(l3);
        f.add(t3);

        f.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JFrame f2 = new JFrame("Employee Information");
                f2.setSize(400, 200);
                f2.setLayout(new GridLayout(3, 1));

                JLabel a = new JLabel("Employee No: " + t1.getText());
                JLabel b = new JLabel("Employee Name: " + t2.getText());
                JLabel c = new JLabel("Salary: " + t3.getText());

                f2.add(a);
                f2.add(b);
                f2.add(c);

                f2.setVisible(true);
            }
        });

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}