package ru.mirea.task11.borderLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUI {
    public GUI()
    {
        JFrame frame = new JFrame();

        JLabel northLabel = new JLabel("");
        northLabel.setBorder(new LineBorder(Color.BLACK));
        northLabel.setPreferredSize(new Dimension(250,50));
        northLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                northLabel.setText("North!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                northLabel.setText("");
            }
        });

        JLabel southLabel = new JLabel("");
        southLabel.setBorder(new LineBorder(Color.BLACK));
        southLabel.setPreferredSize(new Dimension(250,50));
        southLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                southLabel.setText("South!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                southLabel.setText("");
            }
        });

        JLabel westLabel = new JLabel();
        westLabel.setBorder(new LineBorder(Color.BLACK));
        westLabel.setPreferredSize(new Dimension(50,150));
        westLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                westLabel.setText("West!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                westLabel.setText("");
            }
        });

        JLabel eastLabel = new JLabel();
        eastLabel.setBorder(new LineBorder(Color.BLACK));
        eastLabel.setPreferredSize(new Dimension(50,150));
        eastLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                eastLabel.setText("East!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                eastLabel.setText("");
            }
        });

        JLabel centerLabel = new JLabel();
        centerLabel.setBorder(new LineBorder(Color.BLACK));
        centerLabel.setPreferredSize(new Dimension(150,150));
        centerLabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                centerLabel.setText("Center!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                centerLabel.setText("");
            }
        });

        frame.add(northLabel, BorderLayout.NORTH);
        frame.add(southLabel, BorderLayout.SOUTH);
        frame.add(westLabel, BorderLayout.WEST);
        frame.add(eastLabel, BorderLayout.EAST);
        frame.add(centerLabel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(250, 250);
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new GUI();
    }
}
