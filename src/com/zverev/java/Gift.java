package com.zverev.java;

import java.util.Arrays;

public class Gift {

    public float collectGift(float... value) {

        float sum = 0;

        for (int i = 0; i < value.length; i++) {
            sum += value[i];
        }
        return sum;
    }

    public void sortGift(float... value) {

        Arrays.sort(value);

        for (int i = 0; i < value.length; i++) {
            System.out.println(value[i]);
        }
    }

}