package ru.mirea.task5.furniture;

public class Test {
    public static void main(String[] args) {
        FurnitureShop fsh = new FurnitureShop();
        fsh.add(new Sofa(50, "DSP", "CyberPunk", false, 3), 1, "001");
        fsh.add(new Chair(100, "Wood", "Minimalism", true), 3, "002");
        System.out.println(fsh.getStock());
        fsh.buy("001", 2);
    }

}
