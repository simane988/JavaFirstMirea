package ru.mirea.task5.furniture;

public class Sofa extends Furniture {
    private boolean isFold;
    private int numPlace;

    public Sofa(int price, String material, String style, boolean isFold, int numPlace) {
        this.type = "Sofa";
        this.price = price;
        this.material = material;
        this.style = style;
        this.isFold = isFold;
        this.numPlace = numPlace;
    }

    @Override
    public String toString() {
        return "Sofa{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", material='" + material + '\'' +
                ", style='" + style + '\'' +
                ", isFold=" + isFold +
                ", numPlace=" + numPlace +
                '}';
    }
}
