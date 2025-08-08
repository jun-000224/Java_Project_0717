package day16;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {

    private final int FLYING_UNIT = 10;
    private JLabel la = new JLabel("HELLO");

    public FlyingTextEx() {

        setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key = e.getKeyCode();

                if (key == KeyEvent.VK_RIGHT) {
                    la.setLocation(la.getX() + FLYING_UNIT, la.getY());
                } else if (key == KeyEvent.VK_LEFT) {
                    la.setLocation(la.getX() - FLYING_UNIT, la.getY());
                } else if (key == KeyEvent.VK_UP) {
                    la.setLocation(la.getX(), la.getY() - FLYING_UNIT);
                } else if (key == KeyEvent.VK_DOWN) {
                    la.setLocation(la.getX(), la.getY() + FLYING_UNIT);
                }
            }
        });

        la.setLocation(50, 50);
        la.setSize(100, 20);
        c.add(la);

        setSize(300, 300);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus(); // 필요하면 c.requestFocusInWindow()로 바꿔도 됨
    }

    public static void main(String[] args) {
        new FlyingTextEx();
    }
}
