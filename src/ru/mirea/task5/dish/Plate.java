package ru.mirea.task5.dish;

public class Plate extends Dish {
    private double diameter;

    public Plate(){
        this.material = "None";
        this.color = "NoColor";
        this.diameter = -1d;
    }

    public Plate(String material, String color, double diameter){
        this.material = material;
        this.color = color;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", diameter=" + diameter +
                '}';
    }

    @Override
    public String getCrash() {
        return "Bum tssssssss";
    }
}
