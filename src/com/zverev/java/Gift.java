package com.zverev.java;

import java.util.Arrays;
import java.util.Scanner;

public class Gift {

    String item;

    Scanner input = new Scanner(System.in);

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

    public void findElement(String... value) {
        System.out.println("What kind of sweets do you look for: ");
        item = input.nextLine();

        if (Arrays.asList(value).contains(item)) {
            System.out.println(item + " is in Gift");
        } else {
            System.out.println(item + " not found");
        }
    }

}
