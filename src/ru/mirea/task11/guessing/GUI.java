package ru.mirea.task11.guessing;

import javax.swing.*;
import java.util.Random;

public class GUI {
    private int hiddenNum, attempts = 3;
    private JLabel attemptsLabel, tipLabel, winLabel;
    public GUI(){
        JFrame frame = new JFrame();
        frame.setLayout(null);

        Random rand = new Random();
        hiddenNum = rand.nextInt(20);

        attemptsLabel = new JLabel("Кол-во попыток: " + attempts);
        attemptsLabel.setBounds(0,0,150,25);

        tipLabel = new JLabel("Подсказка: угадайте число от 0 до 20");
        tipLabel.setBounds(0,25,250,25);

        frame.add(attemptsLabel);
        frame.add(tipLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI app = new GUI();
    }
}
