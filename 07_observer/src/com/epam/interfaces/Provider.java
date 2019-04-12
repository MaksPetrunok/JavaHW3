package com.epam.interfaces;

public interface Provider {

    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);

    void publishPaper();
}
