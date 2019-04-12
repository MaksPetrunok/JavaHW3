package com.epam;

import com.epam.com.epam.post.Paper;
import com.epam.interfaces.Provider;
import com.epam.interfaces.Subscriber;

public class Person implements Subscriber {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void subscribeTo(Provider provider) {
        provider.addSubscriber(this);
    }

    public void unsubscribeFrom(Provider provider) {
        provider.removeSubscriber(this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void update(Paper paper) {
        System.out.println(name + ": received " + paper);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
