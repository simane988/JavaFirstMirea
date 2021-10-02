package ru.mirea.task2.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Blue", 10, 0.5f);
        Ball b2 = new Ball("Red", 5);
        Ball b3 = new Ball("Green", 2.4f);
        Ball b4 = new Ball(7, 0.7f);
        Ball b5 = new Ball("Purple");
        Ball b6 = new Ball(25);
        Ball b7 = new Ball(3.1415f);

        b7.setColor("White");

        System.out.println(b1.toString());
        System.out.println(b1.getBounceHeight());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
        System.out.println(b5.toString());
        System.out.println(b6.toString());
        System.out.println(b7.toString());
    }
}
