package com.epam;

import com.epam.com.epam.post.Paper;
import com.epam.interfaces.Provider;
import com.epam.interfaces.Subscriber;

import java.util.ArrayList;

public class PublishingHouse implements Provider {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private int paperId = 0;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        if (!this.subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
            System.out.println("Publishing house: new subscriber - " + subscriber + ".");
        }
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        if (this.subscribers.contains(subscriber)) {
            subscribers.remove(subscriber);
            System.out.println("Publishing house: user " + subscriber + " unsubscribed.");
        }
    }

    @Override
    public void publishPaper() {

        Paper paper = new Paper(paperId++);
        for (Subscriber subscriber : subscribers) {
            subscriber.update(paper);
        }
        System.out.println("Publishing House: release " + paper);
    }
}
