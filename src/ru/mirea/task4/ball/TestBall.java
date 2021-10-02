package ru.mirea.task4.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();

        b1.setXY(1.4d, 3.2d);
        b1.move(5d, 10d);

        System.out.println(b1.toString());
    }
}
