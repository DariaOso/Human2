package ru.mirea.humann;

public class Human {
    private Head head;
    private Leg leg;

   public Human(){
        head = new Head();
        leg = new Leg();

    }
    public Head getHead() {
        return head;

    }
    public void setHead(Head head)
    {
        this.head = head;

    }
    public Leg getLeg(){
        return leg;

    }
    public void setLeg(Leg leg){
        this.leg = leg;
    }
    public String toString(){
        return "Human{"+
                "head=" + head.toString() +
                ",leg=" + leg.toString() + '}';

    }
}
