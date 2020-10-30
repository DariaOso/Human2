package ru.mirea.humann;

public class Leg {
   public int length;
    Leg(){
    }
Leg(int length){
    this.length=length;
}
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Leg{" +
                "length=" + length +
                '}';
    }
}

