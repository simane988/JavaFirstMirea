package ru.mirea.task5.dog;

public class Doberman extends Dog{
    private boolean standingEars;

    public Doberman(String name, int age, String color, boolean isAngry, boolean standingEars) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = "Doberman";
        this.isAngry = isAngry;
        this.standingEars = standingEars;
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", breed='" + breed + '\'' +
                ", isAngry=" + isAngry +
                ", standingEars=" + standingEars +
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
}
