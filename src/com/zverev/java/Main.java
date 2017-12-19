package com.zverev.java;

public class Main {

    public static void main(String[] args) {

        Gift gift = new Gift();

        Chocolate chocolate = new Chocolate("chocolate", 5.5F);
        Lollipop lollipop = new Lollipop("lollipop", 10.3F);
        Toffee toffee = new Toffee("toffee", 9.9F);
        Caramel caramel = new Caramel("caramel", 7.7F);
        Nougat nougat = new Nougat("nougat", 19.3F);

        System.out.println("You collect Gift. It's weight " +
                gift.collectGift(chocolate.getWeight(),
                        lollipop.getWeight(),
                        toffee.getWeight(),
                        caramel.getWeight(),
                        nougat.getWeight()) + " gram.");

        gift.sortGift(chocolate.getWeight(),
                lollipop.getWeight(),
                toffee.getWeight(),
                caramel.getWeight(),
                nougat.getWeight());

        gift.findElement(chocolate.getName(), lollipop.getName(), toffee.getName(), caramel.getName(), nougat.getName());

    }

}