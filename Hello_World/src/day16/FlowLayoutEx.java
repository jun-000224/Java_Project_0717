package day16;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx extends JFrame {
    
    public FlowLayoutEx() {
        setTitle("웃음 버튼 생성기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.LEFT, 27, 20));

        c.add(new JButton("크크"));
        c.add(new JButton("캬캬"));
        c.add(new JButton("케케"));
        c.add(new JButton("쿄쿄"));
        c.add(new JButton("제하하하하하하"));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
