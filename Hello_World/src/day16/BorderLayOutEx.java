package day16;
import javax.swing.*;
import java.awt.*;

public class BorderLayOutEx extends JFrame {

    public BorderLayOutEx() {
        setTitle("BorderLayout Sample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(30, 20));

        c.add(new JButton("Calculate"), BorderLayout.CENTER);
        c.add(new JButton("add"), BorderLayout.NORTH);
        c.add(new JButton("sub"), BorderLayout.SOUTH);
        c.add(new JButton("mul"), BorderLayout.EAST);
        c.add(new JButton("div"), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Swing은 EDT에서 실행하는 게 정석이지만, 간단한 테스트에선 아래처럼 해도 됨
        new BorderLayOutEx();
    }
}
