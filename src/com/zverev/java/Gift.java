package com.zverev.java;

public class Gift {

    public float collectGift(float... value){

        float sum = 0;

        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return sum;
    }

}