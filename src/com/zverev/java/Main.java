package com.zverev.java;

public class Main {

    public static void main(String[] args) {

        Gift gift = new Gift();

        Candy chocolate = new Candy("chocolate", 5.5F);
        Candy lollipop = new Candy("lollipop", 10.3F);
        Candy toffee = new Candy("toffee", 9.9F);
        Candy caramel = new Candy("caramel", 7.7F);
        Candy nougat = new Candy("nougat", 19.3F);

        System.out.println("You collect Gift. It's weight " + gift.collectGift(chocolate.getWeight(),
                                                                lollipop.getWeight(),
                                                                    toffee.getWeight(),
                                                                        caramel.getWeight(),
                                                                            nougat.getWeight()) + " gram.");

    }
}
