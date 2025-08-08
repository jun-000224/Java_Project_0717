package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListnerEx extends JFrame {

    public class KeyListenerEx extends JFrame {
        private JLabel[] keyMessage;

        public KeyListenerEx() {
            setTitle("keyListener 예제");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Container c = getContentPane();
            c.setLayout(new FlowLayout());

            // 라벨 3개 생성/부착
            keyMessage = new JLabel[3];
            keyMessage[0] = new JLabel(" getKeyCode() ");
            keyMessage[1] = new JLabel(" getKeyChar() ");
            keyMessage[2] = new JLabel(" getKeyText() ");

            for (int i = 0; i < keyMessage.length; i++) {
                c.add(keyMessage[i]);
                keyMessage[i].setOpaque(true);
                keyMessage[i].setBackground(Color.YELLOW);
            }

            // 키 리스너 등록 (메서드명/시그니처/세미콜론 전부 수정)
            c.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    int keyCode = e.getKeyCode();
                    char keyChar = e.getKeyChar();
                    keyMessage[0].setText(Integer.toString(keyCode));
                    keyMessage[1].setText(Character.toString(keyChar));
                    keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
                }
            });

            // 키 이벤트 받으려면 포커스 필요
            c.setFocusable(true);
            c.requestFocusInWindow();

            setSize(400, 200);
            setLocationRelativeTo(null);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        KeyListnerEx outer = new KeyListnerEx();
        outer.new KeyListenerEx();
    }
}
