package GUI;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.LinkedHashMap;

public class GUI_1 extends JFrame {
    private final Map<String, Integer> medicineMap = new LinkedHashMap<>();
    private JLabel clockLabel;
    private JLabel statusText;
    private StatusLED led;
    private JProgressBar progress;
    private JPanel tilesPanel;
    private JButton rfidButton;

    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss");

    public GUI_1() {
        setTitle("가정용 알약 디스펜서");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(540, 480);
        setLocationRelativeTo(null);

        medicineMap.put("타이레놀", 10);
        medicineMap.put("아스피린", 5);
        medicineMap.put("센트룸", 7);
        medicineMap.put("유산균", 12);

        setLayout(new BorderLayout(16, 16));
        getRootPane().setBorder(new EmptyBorder(14, 14, 14, 14));
        getContentPane().setBackground(new Color(245, 247, 250));

        add(buildHeader(), BorderLayout.NORTH);
        add(buildTiles(), BorderLayout.CENTER);
        add(buildStatusCard(), BorderLayout.EAST);
        add(buildFooter(), BorderLayout.SOUTH);

        new Timer(1000, e -> clockLabel.setText(LocalDateTime.now().format(fmt))).start();

        setVisible(true);
    }

    private JComponent buildHeader() {
        JPanel header = new GradientPanel(new Color(220, 236, 255), new Color(195, 223, 255));
        header.setLayout(new BorderLayout());
        header.setBorder(new EmptyBorder(12, 16, 12, 16));

        JLabel title = new JLabel("Pill Dispenser");
        title.setFont(title.getFont().deriveFont(Font.BOLD, 20f));
        title.setForeground(new Color(30, 60, 90));

        clockLabel = new JLabel(LocalDateTime.now().format(fmt));
        clockLabel.setFont(clockLabel.getFont().deriveFont(Font.PLAIN, 14f));
        clockLabel.setForeground(new Color(30, 60, 90));

        header.add(title, BorderLayout.WEST);
        header.add(clockLabel, BorderLayout.EAST);
        header.setOpaque(false);
        header.setPreferredSize(new Dimension(0, 56));
        header.setBorder(new CompoundBorder(new LineBorder(new Color(210, 230, 250), 1, true), header.getBorder()));
        return header;
    }

    private JComponent buildTiles() {
        tilesPanel = new JPanel(new GridLayout(0, 2, 12, 12));
        tilesPanel.setOpaque(false);
        updateTiles();
        return tilesPanel;
    }

    private void updateTiles() {
        tilesPanel.removeAll();
        for (Map.Entry<String, Integer> e : medicineMap.entrySet()) {
            tilesPanel.add(createTile(e.getKey(), e.getValue()));
        }
        tilesPanel.revalidate();
        tilesPanel.repaint();
    }

    private JComponent createTile(String name, int count) {
        JPanel card = new RoundedPanel(16);
        card.setLayout(new BorderLayout());
        card.setBackground(Color.WHITE);
        card.setBorder(new EmptyBorder(12, 14, 12, 14));

        JLabel nameLb = new JLabel(name);
        nameLb.setFont(nameLb.getFont().deriveFont(Font.BOLD, 16f));
        nameLb.setForeground(new Color(35, 50, 70));

        JLabel cntLb = new JLabel(count + " 개");
        cntLb.setFont(cntLb.getFont().deriveFont(Font.PLAIN, 14f));
        cntLb.setForeground(new Color(90, 110, 130));

        JPanel top = new JPanel(new BorderLayout());
        top.setOpaque(false);
        top.add(nameLb, BorderLayout.WEST);
        top.add(cntLb, BorderLayout.EAST);

        JProgressBar level = new JProgressBar(0, 100);
        int pct = Math.max(0, Math.min(100, (int) (100.0 * count / 20)));
        level.setValue(pct);
        level.setStringPainted(true);
        level.setString("재고 " + pct + "%");
        level.setForeground(new Color(80, 160, 255));
        level.setBackground(new Color(240, 244, 248));
        level.setBorder(new EmptyBorder(6, 0, 0, 0));

        card.add(top, BorderLayout.NORTH);
        card.add(level, BorderLayout.SOUTH);
        return card;
    }

    private JComponent buildStatusCard() {
        JPanel card = new RoundedPanel(16);
        card.setPreferredSize(new Dimension(200, 0));
        card.setBackground(Color.WHITE);
        card.setBorder(new EmptyBorder(14, 14, 14, 14));
        card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));

        JLabel head = new JLabel("상태");
        head.setAlignmentX(Component.LEFT_ALIGNMENT);
        head.setFont(head.getFont().deriveFont(Font.BOLD, 15f));
        head.setForeground(new Color(35, 50, 70));

        JPanel row = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        row.setOpaque(false);
        led = new StatusLED(new Color(170, 170, 170));
        statusText = new JLabel("대기 중");
        statusText.setForeground(new Color(70, 90, 110));
        row.add(led);
        row.add(statusText);

        progress = new JProgressBar();
        progress.setIndeterminate(false);
        progress.setVisible(false);
        progress.setAlignmentX(Component.LEFT_ALIGNMENT);
        progress.setForeground(new Color(80, 160, 255));
        progress.setBackground(new Color(240, 244, 248));
        progress.setBorder(new EmptyBorder(8, 0, 0, 0));

        card.add(head);
        card.add(Box.createVerticalStrut(8));
        card.add(row);
        card.add(Box.createVerticalStrut(8));
        card.add(progress);

        return card;
    }

    private JComponent buildFooter() {
        JPanel p = new JPanel(new BorderLayout());
        p.setOpaque(false);
        rfidButton = new JButton("RFID 인식 • 약 배출");
        rfidButton.setFont(rfidButton.getFont().deriveFont(Font.BOLD, 15f));
        rfidButton.setBackground(new Color(0, 122, 255));
        rfidButton.setForeground(Color.WHITE);
        rfidButton.setFocusPainted(false);
        rfidButton.setBorder(new EmptyBorder(12, 20, 12, 20));
        rfidButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        rfidButton.addActionListener(e -> simulatePillDispense("타이레놀"));

        JPanel holder = new RoundedPanel(20);
        holder.setBackground(Color.WHITE);
        holder.setBorder(new EmptyBorder(10, 10, 10, 10));
        holder.add(rfidButton);
        p.add(holder, BorderLayout.CENTER);
        return p;
    }

    private void simulatePillDispense(String medicineName) {
        Integer cur = medicineMap.get(medicineName);
        if (cur == null || cur <= 0) {
            setStatus("잔여 없음: " + medicineName, new Color(255, 120, 120), false);
            return;
        }
        setStatus("배출 중: " + medicineName, new Color(255, 180, 80), true);
        rfidButton.setEnabled(false);

        Timer t = new Timer(2000, e -> {
            medicineMap.put(medicineName, Math.max(0, cur - 1));
            updateTiles();
            setStatus("배출 완료: " + medicineName, new Color(0, 190, 120), false);
            rfidButton.setEnabled(true);
        });
        t.setRepeats(false);
        t.start();
    }

    private void setStatus(String text, Color ledColor, boolean loading) {
        statusText.setText(LocalDateTime.now().format(fmt) + " | " + text);
        led.setColor(ledColor);
        progress.setVisible(loading);
        progress.setIndeterminate(loading);
    }

    static class RoundedPanel extends JPanel {
        private final int arc;
        RoundedPanel(int arc) { this.arc = arc; setOpaque(false); }
        @Override protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(getBackground());
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
            g2.dispose();
            super.paintComponent(g);
        }
    }

    static class StatusLED extends JComponent {
        private Color color;
        StatusLED(Color c) { this.color = c; setPreferredSize(new Dimension(14, 14)); }
        void setColor(Color c) { this.color = c; repaint(); }
        @Override protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(color);
            g2.fillOval(0, 0, getWidth(), getHeight());
            g2.setColor(new Color(0,0,0,40));
            g2.drawOval(0, 0, getWidth()-1, getHeight()-1);
            g2.dispose();
        }
    }

    static class GradientPanel extends JPanel {
        private final Color c1, c2;
        GradientPanel(Color c1, Color c2) { this.c1 = c1; this.c2 = c2; setOpaque(false); }
        @Override protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setPaint(new GradientPaint(0, 0, c1, 0, getHeight(), c2));
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.dispose();
            super.paintComponent(g);
        }
    }

    public static void main(String[] args) {
        try { UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); } catch (Exception ignored) {}
        SwingUtilities.invokeLater(GUI_1::new);
    }
}
