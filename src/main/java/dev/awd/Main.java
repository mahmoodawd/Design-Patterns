package dev.awd;


import dev.awd.structural.decorator.*;

public class Main {
    public static void main(String[] args) {
        Beverage coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new Coffee()));


        System.out.println(coffeeWithMilkAndSugar.prepare());

        Beverage teaWithMilk = new MilkDecorator(new Tea());
        System.out.println(teaWithMilk.prepare());
        Beverage teaWithMint = new MintDecorator(new Tea());
        System.out.println(teaWithMint.prepare());
    }
}