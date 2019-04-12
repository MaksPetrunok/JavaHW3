package com.epam.com.epam.post;


import com.epam.interfaces.Provider;
import com.epam.interfaces.Subscriber;

import java.util.ArrayList;

public class Post implements Provider, Subscriber {

    private static int count = 0;

    private int id;
    private Provider provider;
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private Paper paper;

    public Post(Provider provider) {
        this.provider = provider;
        this.id = count++;
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        if (!this.subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println(toString() + ": new subscriber - " + subscriber + ".");
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        if (this.subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
            System.out.println(toString() + ": user " + subscriber + " unsubscribed.");
        }
    }

    @Override
    public void publishPaper() {

        for (Subscriber subscriber : subscribers) {
            subscriber.update(this.paper);
        }
        System.out.println(toString() + ": released " + paper);
    }

    @Override
    public String getName() {
        return this.toString();
    }

    @Override
    public void update(Paper paper) {
        this.paper = paper;
        publishPaper();
    }

    @Override
    public String toString() {
        return "Postal Department " + id;
    }
}
