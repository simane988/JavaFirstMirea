package ru.mirea.task8.shape;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{

    public Shape getRandShape(){
        int rand = (int)(Math.random() * 2);
        if(rand == 0) {
            return new Circle();
        }
        else{
            return new Rectangle();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0, x = 15; i < 5; ++i, x += 280)
            for (int j = 0, y = 35; j < 4; ++j, y += 175) {
                // Случайный цвет
                int red = (int) (Math.random() * 255);
                int green = (int) (Math.random() * 255);
                int blue = (int) (Math.random() * 255);

                // Случайная фигура
                Shape sh = getRandShape();
                sh.setXY(x, y);
                sh.setColor(red, green, blue);

                // Отрисовка
                g.setColor(new Color(sh.getColor()[0], sh.getColor()[1], sh.getColor()[2]));
                if (sh.getClass().getSimpleName().equals("Rectangle"))
                    g.fillRect(sh.getX(), sh.getY(), 200, 150);
                else if (sh.getClass().getSimpleName().equals("Circle"))
                    g.fillOval(sh.getX(), sh.getY(), 150, 150);
            }
    }

    private static void createNewGUI() {
        GUI tw = new GUI();
    }

    private static final int WIDTH = 1350;
    private static final int HEIGHT = 725;
    public GUI()
    {
        super("Shapes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() { createNewGUI(); }
        });
    }

}
