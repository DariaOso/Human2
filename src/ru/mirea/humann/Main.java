package ru.mirea.humann;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
        h.getHead().setColor("red");
        h.getLeg().setLength(145);

        System.out.println(h);
    }
}
