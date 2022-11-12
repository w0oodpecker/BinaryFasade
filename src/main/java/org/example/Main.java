package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        System.out.println(bins.sum("01010101", "11111101"));
        System.out.println(bins.mult("01010101", "11111101"));

    }
}