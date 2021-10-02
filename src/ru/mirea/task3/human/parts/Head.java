package ru.mirea.task3.human.parts;

public class Head {
    private String hairColor;
    private double hairLength;
    private String eyeColor;

    public Head(){
        this.hairColor = "Bold";
        this.hairLength = 0d;
        this.eyeColor = "Brown";
    }

    public Head(String hairColor, double hairLength, String eyeColor){
        this.hairColor = hairColor;
        this.hairLength = hairLength;
        this.eyeColor = eyeColor;
    }

    public String getHmm(){
        return "Hmmmm.....";
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                ", hairLength=" + hairLength +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}
