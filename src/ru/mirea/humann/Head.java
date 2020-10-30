package ru.mirea.humann;

public class Head {

    String color;
    Head(){

    }
    Head(String color){
        this.color=color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Head{" +
                "color='" + color + '\'' +
                '}';
    }
}
