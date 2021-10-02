package ru.mirea.task5.furniture;

public class Test {
    public static void main(String[] args) {
        FurnitureShop fsh = new FurnitureShop();
        fsh.add(new Chair(100, "Wood", "Minimalism", true));
        System.out.println(fsh.getStock());
    }

}
