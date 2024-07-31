package dev.awd;


import dev.awd.structural.proxy.DummyJsonApi;
import dev.awd.structural.proxy.DummyJsonCachingProxy;

public class Main {
    public static void main(String[] args) {
        try {
            DummyJsonApi proxy = new DummyJsonCachingProxy();
            System.out.println(proxy.getAllProducts());
            System.out.println(proxy.getAllRecipes());
            System.out.println("Should Get Results From Cache");
            System.out.println(proxy.getAllProducts());
            System.out.println(proxy.getAllRecipes());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}