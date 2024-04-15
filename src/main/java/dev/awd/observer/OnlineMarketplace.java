package dev.awd.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineMarketplace {

    private Map<EventType, List<Subscriber>> subscribers;
    private List<Product> products;
    private List<Offer> offers;

    public OnlineMarketplace() {
        this.subscribers = new HashMap<>();
        initSubscriberEvents();
        this.products = new ArrayList<>();
        this.offers = new ArrayList<>();
    }

    public void initSubscriberEvents() {
        subscribers.put(EventType.NEW_PRODUCT, new ArrayList<>());
        subscribers.put(EventType.NEW_OFFER, new ArrayList<>());
        subscribers.put(EventType.OPEN_POSITIONS, new ArrayList<>());
    }

    public void subscribe(EventType type, Subscriber subscriber) {
        subscribers.get(type).add(subscriber);
    }

    public void unsubscribe(EventType type, Subscriber subscriber) {
        subscribers.get(type).remove(subscriber);
    }

    public void addProduct(Product product) {
        products.add(product);
        notifySubscribers(EventType.NEW_PRODUCT, "New Product Added: " + product.getName());
    }

    public void addOffer(Offer offer) {
        offers.add(offer);
        notifySubscribers(EventType.NEW_OFFER, "New Offer Added: " + offer.getMessage());
    }

    public void addJobPosition(String jobTitle) {
        notifySubscribers(EventType.OPEN_POSITIONS, "New Position Opened: " + jobTitle);
    }

    public void notifySubscribers(EventType type, String message) {
        subscribers.get(type).forEach(subscriber -> subscriber.notify(message));
    }


}
