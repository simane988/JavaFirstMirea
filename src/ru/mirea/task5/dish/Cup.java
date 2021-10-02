package ru.mirea.task5.dish;

public class Cup extends Dish{
    private double volume;
    private double filled = 0;
    private boolean isHandle;

    public Cup(){
        this.material = "None";
        this.color = "NoColor";
        this.volume = -1d;
        this.isHandle = false;
    }
    public Cup(String material, String color, double volume, boolean isHandle){
        this.material = material;
        this.color = color;
        this.volume = volume;
        this.isHandle = isHandle;
    }

    public String fill(double ml){
        if(filled + ml <= volume){
            filled += ml;
            return "Filled " + filled + "ml of " + volume + "ml";
        } else{
            return "It's impossible";
        }
    }

    @Override
    public String toString() {
        return "Cup{" +
                "volume=" + volume +
                ", filled=" + filled +
                ", isHandle=" + isHandle +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public String getCrash() {
        return "BAM";
    }
}
