import architecture.EventSystem;
import architecture.OOPStyle;
import architecture.PipeFilter;
import architecture.ProceduralStyle;
import utils.ArchitectureInfo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JFrame frame;
    private JTextArea outputArea;
    private JTextArea infoArea;
    private JLabel diagramLabel;

    public Main() {
        frame = new JFrame("经典软件体系结构教学软件");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        JButton proceduralButton = new JButton("主程序-子程序");
        JButton oopButton = new JButton("面向对象");
        JButton eventButton = new JButton("事件系统");
        JButton pipeButton = new JButton("管道-过滤器");

        panel.add(proceduralButton);
        panel.add(oopButton);
        panel.add(eventButton);
        panel.add(pipeButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);
        outputArea.setWrapStyleWord(true);

        infoArea = new JTextArea();
        infoArea.setEditable(false);
        infoArea.setLineWrap(true);
        infoArea.setWrapStyleWord(true);

        diagramLabel = new JLabel(); // 用于显示原理图
        diagramLabel.setHorizontalAlignment(JLabel.CENTER);

        JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JScrollPane(outputArea), new JScrollPane(infoArea));
        splitPane.setDividerLocation(300);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(splitPane, BorderLayout.CENTER);
        frame.add(diagramLabel, BorderLayout.SOUTH); // 添加原理图标签

        proceduralButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = ProceduralStyle.process("resources/input_files/sample.txt");
                outputArea.setText(result);
                displayArchitectureInfo("procedural");
            }
        });

        oopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = OOPStyle.process("resources/input_files/sample.txt");
                outputArea.setText(result);
                displayArchitectureInfo("oop");
            }
        });

        eventButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = EventSystem.process("resources/input_files/sample.txt");
                outputArea.setText(result);
                displayArchitectureInfo("event");
            }
        });

        pipeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String result = PipeFilter.process("resources/input_files/sample.txt");
                outputArea.setText(result);
                displayArchitectureInfo("pipe");
            }
        });

        frame.setVisible(true);
    }

    private void displayArchitectureInfo(String style) {
        String description = ArchitectureInfo.getDescription(style);
        String diagramPath = "resources/diagrams/" + style + ".png"; // Assuming diagrams are stored as PNG files
        infoArea.setText(description);
        infoArea.append("\n原理图: " + diagramPath);

        // 加载并显示原理图
        ImageIcon diagramIcon = new ImageIcon(diagramPath);
        diagramLabel.setIcon(diagramIcon);
        diagramLabel.setText(""); // 清除原理图文本，确保只显示图像
    }

    public static void main(String[] args) {
        new Main();
    }
}



