package ru.mirea.task9;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;
import javax.swing.*;

public class GUI extends JFrame{
    private int milan_score = 0;
    private int real_score = 0;
    private JLabel score, winner, last;

    public GUI() {
        JFrame frame = new JFrame();
        frame.setLayout(null);

        score = new JLabel("Result 0X0");
        score.setBounds(100,0,100,25);

        last = new JLabel("Last Scorer: N/A");
        last.setBounds(100,30,200,25);

        winner = new JLabel("Winner: DRAW");
        winner.setBounds(100,60,150,25);



        JButton real = new JButton("Real Madrid");
        real.setBounds(0,100,100,50);
        real.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                real_score++;
                updateScore("Real Madrid");
            }
        });

        JButton milan = new JButton("Milan");
        milan.setBounds(200,100,100,50);
        milan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                milan_score++;
                updateScore("Milan");
            }
        });


        frame.add(score);
        frame.add(last);
        frame.add(winner);
        frame.add(real);
        frame.add(milan);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(315, 200);
        frame.setVisible(true);
    }

    private void updateScore(String who){
        score.setText("Result " + real_score + "X" + milan_score);
        if(Objects.equals(who, "Milan")){
            last.setText("Last Scorer: Milan");
        } else if(Objects.equals(who, "Real Madrid")){
            last.setText("Last Scorer: Real Madrid");
        }
        if(real_score == milan_score){
            winner.setText("Winner: DRAW");
        } else if(real_score > milan_score){
            winner.setText("Winner: Real Madrid");
        } else {
            winner.setText("Winner: Milan");
        }
    }

    public static void main(String[] args) {
        GUI app = new GUI();
    }
}
