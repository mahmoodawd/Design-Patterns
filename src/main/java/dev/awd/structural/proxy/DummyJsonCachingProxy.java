package dev.awd.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class DummyJsonCachingProxy implements DummyJsonApi {
    private static final String PRODUCTS_KEY = "PRODUCTS";
    private static final String RECIPES_KEY = "RECIPES";
    DummyJsonApi api;
    private final Map<String, String> cachingLayer;

    public DummyJsonCachingProxy() {
        cachingLayer = new HashMap<>();
        api = new DummyThirdPartyApiService();
    }

    @Override
    public String getAllProducts() throws Exception {
        if (cachingLayer.containsKey(PRODUCTS_KEY)) {
            System.out.println("Fetching all Products from cache");
            return cachingLayer.get(PRODUCTS_KEY);
        }
        String productsBody = api.getAllProducts();
        cachingLayer.put(PRODUCTS_KEY, productsBody);

        return productsBody;
    }

    @Override
    public String getAllRecipes() throws Exception {
        if (cachingLayer.containsKey(RECIPES_KEY)) {
            System.out.println("Fetching all recipes from cache");
            return cachingLayer.get(RECIPES_KEY);
        }
        String recipesBody = api.getAllRecipes();
        cachingLayer.put(RECIPES_KEY, recipesBody);
        return recipesBody;
    }

    private void evictCache() {
    }
}
