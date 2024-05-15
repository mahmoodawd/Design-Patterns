package dev.awd.behavioral.observer.excercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BlogManagement {
    private List<NewsLetter> newsletters;
    private List<Blog> blogs;

    private Map<SubscriptionType, List<Subscriber>> subscribers;


    public BlogManagement() {
        this.newsletters = new ArrayList<>();
        this.blogs = new ArrayList<>();
        this.subscribers = new HashMap<>();
        initSubscriptionTypes();
    }

    private void initSubscriptionTypes() {
        subscribers.put(SubscriptionType.NEWSLETTER, new ArrayList<>());
        subscribers.put(SubscriptionType.NEW_BLOG, new ArrayList<>());

    }

    public void subscribe(SubscriptionType type, Subscriber subscriber) {
        subscribers.get(type).add(subscriber);
    }

    public void unsubscribe(SubscriptionType type, Subscriber subscriber) {
        subscribers.get(type).remove(subscriber);
    }

    public void addNewsLetter(NewsLetter letter) {
        newsletters.add(letter);
        notifySubscriber(SubscriptionType.NEWSLETTER, letter.getTitle());
    }

    public void addBlog(Blog blog) {
        blogs.add(blog);
        notifySubscriber(SubscriptionType.NEW_BLOG, blog.getTitle());
    }

    private void notifySubscriber(SubscriptionType type, String message) {
        subscribers.get(type).forEach(subscriber -> subscriber.notify(message));
    }
}
