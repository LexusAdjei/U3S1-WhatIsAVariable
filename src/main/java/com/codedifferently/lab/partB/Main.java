package com.codedifferently.lab.partB;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin("Quarter", .25);
        Coin coin3 = new Coin("Dime", .10);
        Coin coin4 = new Coin("Penny", .01);
        System.out.println(coin1);
        System.out.println(coin2);
        System.out.println(coin3);
        System.out.println(coin4);
    }
}
