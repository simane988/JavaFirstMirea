package ru.mirea.task3.Shape;

import ru.mirea.task3.Shape.Circle.Circle;

public class CircleTest {
    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);  // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
//        В этой строчке будет ошибка, т.к. s1 является объектом класса Shape, а не Circle
//        System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
    }
}
