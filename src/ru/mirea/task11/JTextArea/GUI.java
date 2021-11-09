package ru.mirea.task11.JTextArea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    JTextArea text;
    public GUI(){
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        text = new JTextArea();
        text.setPreferredSize(new Dimension(100, 50));

        JPanel colorButtonPanel = new JPanel();
        colorButtonPanel.setLayout(new BoxLayout(colorButtonPanel, BoxLayout.X_AXIS));

        JButton blackColorButton = new JButton("Black");
        blackColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLACK);
            }
        });

        JButton redColorButton = new JButton("Red");
        redColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.RED);
            }
        });

        JButton blueColorButton = new JButton("Blue");
        blueColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setForeground(Color.BLUE);
            }
        });

        colorButtonPanel.add(blackColorButton);
        colorButtonPanel.add(redColorButton);
        colorButtonPanel.add(blueColorButton);

        JPanel fontButtonPanel = new JPanel();
        fontButtonPanel.setLayout(new BoxLayout(fontButtonPanel, BoxLayout.X_AXIS));

        JButton monacoFontButton = new JButton("Monaco");
        monacoFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Monaco", Font.PLAIN, 14));
            }
        });

        JButton verdanaFontButton = new JButton("Verdana");
        verdanaFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Verdana", Font.PLAIN, 14));
            }
        });

        JButton segoeScriptFontButton = new JButton("Segoe Script");
        segoeScriptFontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setFont(new Font("Segoe Script", Font.BOLD, 14));
            }
        });

        fontButtonPanel.add(monacoFontButton);
        fontButtonPanel.add(verdanaFontButton);
        fontButtonPanel.add(segoeScriptFontButton);

        frame.add(colorButtonPanel);
        frame.add(fontButtonPanel);
        frame.add(text);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new GUI();
    }
}
