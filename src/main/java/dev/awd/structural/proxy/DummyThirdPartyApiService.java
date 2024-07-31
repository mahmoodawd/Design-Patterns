package dev.awd.structural.proxy;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class DummyThirdPartyApiService implements DummyJsonApi {
    private static final String BASE_URL = "https://dummyjson.com/";



    @Override
    public String getAllProducts() throws URISyntaxException, IOException, InterruptedException {

        System.out.println("Fetching all products....");
        Thread.sleep(2000);
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(new URI(BASE_URL + "products"))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();

    }

    public String getAllRecipes() throws URISyntaxException, IOException, InterruptedException {

        System.out.println("Fetching all Recipes....");
        Thread.sleep(2000);
        HttpRequest httpRequest = HttpRequest
                .newBuilder()
                .uri(new URI(BASE_URL + "recipes"))
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newBuilder().build();
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();

    }
}
