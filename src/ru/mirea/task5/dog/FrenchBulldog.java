package ru.mirea.task5.dog;

public class FrenchBulldog extends Dog{

    private int weight;

    public FrenchBulldog(String name, int age, String color, boolean isAngry, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = "French Bulldog";
        this.isAngry = isAngry;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", isAngry=" + isAngry +
                ", weight=" + weight + "kg" +
                '}';
    }

    @Override
    public String bite() {
        if(isAngry){
            return "BITE!";
        } else {
            return "No, this dog is kind";
        }
    }

    @Override
    public String getBark() {
        return "Snoooooring";
    }
}
