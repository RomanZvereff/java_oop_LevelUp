package com.zverev.java;

public class Candy {

    private String name;
    private float weight;
    Candy[] gift = new Candy[3];

    public Candy(String name, float weight){
        this.name = name;
        this.weight = weight;
    }

    public void sumGiftWeight(Candy weight){
        for (int i = 0; i < 2; i++) {
            gift[i] = weight;

        }
    }

    public float getWeight() {
        return weight;
    }
}
