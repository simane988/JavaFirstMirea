package ru.mirea.task11.guessing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import java.util.Random;

public class GUI {
    private int attempts = 3;
    private int hiddenNum;
    private JLabel attemptsLabel, tipLabel, winLabel;
    public GUI(){
        JFrame frame = new JFrame();
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        Random rand = new Random();
        hiddenNum = rand.nextInt(20);
        System.out.println(hiddenNum);

        attemptsLabel = new JLabel("Кол-во попыток: " + attempts);

        tipLabel = new JLabel("Подсказка: угадайте число от 0 до 20");

        JTextField num = new JTextField(1);

        JButton guessButton = new JButton("Угадать");
        guessButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(hiddenNum != Integer.parseInt(num.getText())){
                    attempts--;
                    if(attempts > 0)
                        updateData(Integer.parseInt(num.getText()));
                    else {
                        JOptionPane.showMessageDialog(null, "Вы проиграли. Попробуйте снова!");
                        frame.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Вы победили!");
                    frame.dispose();
                }
            }
        });

        frame.add(attemptsLabel);
        frame.add(Box.createRigidArea(new Dimension(0,10)));
        frame.add(tipLabel);
        frame.add(Box.createRigidArea(new Dimension(0,10)));
        frame.add(num);
        frame.add(Box.createRigidArea(new Dimension(0,10)));
        frame.add(guessButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void updateData(int num){
        if(hiddenNum > num){
            tipLabel.setText("Подсказка: загаданное число больше");
        } else {
            tipLabel.setText("Подсказка: загаданное число меньше");
        }
        attemptsLabel.setText("Кол-во попыток: " + attempts);
    }

    public static void main(String[] args) {
        new GUI();
    }
}
