package day16;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnonymousClassListener extends JFrame {

    private int colorState = 0; // 0: YELLOW, 1: DARK_GRAY, 2: RED

    public AnonymousClassListener() {
        setTitle("Action 이벤트 리스너 작성");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // 원래 버튼
        JButton btn = new JButton("Action");
        c.add(btn);

        // 배경색 변경 버튼
        JButton colorBtn = new JButton("배경색 변경");
        c.add(colorBtn);

        // 기존 버튼 이벤트
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                if (b.getText().equals("Action"))
                    b.setText("액션");
                else
                    b.setText("Action");
                setTitle(b.getText());
            }
        });

        // 배경색 변경 버튼 이벤트
        colorBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (colorState == 0) {
                    c.setBackground(Color.YELLOW);
                } else if (colorState == 1) {
                    c.setBackground(Color.DARK_GRAY);
                } else if (colorState == 2) {
                    c.setBackground(Color.RED);
                }
                // 상태값 순환: 0 → 1 → 2 → 0 ...
                colorState = (colorState + 1) % 3;
            }
        });

        setSize(350, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AnonymousClassListener();
    }
}
