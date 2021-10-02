package ru.mirea.task5.furniture;

public class Chair extends Furniture{
    private boolean isBack;

    public Chair(int price, String material, String style, boolean isBack) {
        this.type = "Chair";
        this.price = price;
        this.material = material;
        this.style = style;
        this.isBack = isBack;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", style='" + style + '\'' +
                ", isBack=" + isBack +
                '}';
    }
}
