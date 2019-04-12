package com.epam;

import com.epam.com.epam.post.Post;

public class Main {

    public static void main(String[] args) {

        PublishingHouse ph = new PublishingHouse();
        Post post1 = new Post(ph);
        Post post2 = new Post(ph);

        Person john = new Person("John");
        Person mike = new Person("Mike");
        Person bob = new Person("Bob");

        john.subscribeTo(post1);
        mike.subscribeTo(post1);
        bob.subscribeTo(post2);

        ph.publishPaper();

        mike.unsubscribeFrom(post1);

        ph.publishPaper();

    }
}
