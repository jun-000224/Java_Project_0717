package day16;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {

    private final JLabel la = new JLabel("라벨");

    // ← main 안에 있던 생성자만 제자리(클래스 블록)로 옮김. 이름/대소문자만 맞춤.
    public KeyCodeEx() {
        setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.addKeyListener(new MyKeyListener()); // 네가 쓰던 이름 그대로
        c.add(la);
        setSize(300, 150);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }

    // 네가 적은 keyPressed 내용만 문법 오류 수정해서 그대로 둠
    private class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("유니코드 값 ==> " + e.getKeyChar());
            System.out.println("가상키 값==> " + e.getKeyCode());
            System.out.println("특수키 포함 값 ==> " + e.getModifiersEx());
            if (e.getKeyChar() == '%') {
            	getContentPane().setBackground(Color.YELLOW);
            } else if (e.getKeyCode() == KeyEvent.VK_1) {
            	getContentPane().setBackground(Color.GREEN);
            }

            
        }
    }

    // main은 하나만 남기고, 존재하지 않는 KeyCodeWEx 호출 삭제
    public static void main(String[] args) {
        new KeyCodeEx();
    }
}
