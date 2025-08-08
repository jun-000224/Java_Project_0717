package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quiz1 extends JFrame {

    public Quiz1() {
        setTitle("Quiz1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.RIGHT, 27, 20));

        // 버튼 10개 생성 + 랜덤 색상 지정
        for (int i = 1; i <= 10; i++) {
            JButton btn = new JButton(i + "번 버튼");  //버튼 객체 생성

            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            btn.setBackground(new Color(r, g, b));
            btn.setOpaque(true); // 불투명 처리
            btn.setForeground(Color.WHITE); // 글자색 (배경색 대비)

            c.add(btn);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Quiz1();
    }
}
