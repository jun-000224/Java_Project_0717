package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class PillDispenserGUI extends JFrame {
    private JTextArea medicineDisplay;
    private JButton rfidButton;
    private JLabel statusLabel;

    private HashMap<String, Integer> medicineMap;

    public PillDispenserGUI() {
        setTitle("가정용 알약 디스펜서");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());ㅡㅊㅊㅊ,ㅋ.ㅡ.크.ㅊㅊ                   

        // 약 정보 초기값
        medicineMap = new HashMap<>();
        medicineMap.put("타이레놀", 10);
        medicineMap.put("아스피린", 5);
        medicineMap.put("센트룸", 7);

        // 약 리스트 표시
        medicineDisplay = new JTextArea();
        medicineDisplay.setEditable(false);
        updateMedicineDisplay();
        add(new JScrollPane(medicineDisplay), BorderLayout.CENTER);

        // 상태 표시 라벨
        statusLabel = new JLabel("상태: 대기 중");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(statusLabel, BorderLayout.NORTH);

        // RFID 버튼
        rfidButton = new JButton("RFID 인식 (약 배출)");
        rfidButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                simulatePillDispense("타이레놀");  // 예시: 타이레놀 배출
            }
        });

        // 버튼을 담을 하단 패널
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(rfidButton);
        add(bottomPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // 약 배출 시뮬레이션
    private void simulatePillDispense(String medicineName) {
        if (!medicineMap.containsKey(medicineName) || medicineMap.get(medicineName) <= 0) {
            statusLabel.setText("상태: " + medicineName + " 잔여 없음!");
            return;
        }

        statusLabel.setText("상태: " + medicineName + " 배출 중...");

        // 2초 후 배출 완료 처리
        Timer timer = new Timer(2000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                medicineMap.put(medicineName, medicineMap.get(medicineName) - 1);
                updateMedicineDisplay();
                statusLabel.setText("상태: " + medicineName + " 배출 완료!");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }

    // 텍스트박스에 약 정보 갱신
    private void updateMedicineDisplay() {
        StringBuilder sb = new StringBuilder("현재 약 정보:\n");
        for (String name : medicineMap.keySet()) {
            int count = medicineMap.get(name);
            sb.append("- ").append(name).append(": ").append(count).append("개\n");
        }
        medicineDisplay.setText(sb.toString());
    }

    public static void main(String[] args) {
        // GUI는 EDT에서 실행 권장
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PillDispenserGUI();
            }
        });
    }
}
