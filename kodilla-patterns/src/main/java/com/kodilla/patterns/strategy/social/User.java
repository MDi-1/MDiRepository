package com.kodilla.patterns.strategy.social;

public class User {
    private final String name;
    SocialPublisher publisher;

    public User(String name) {
        this.name = name;
    }

    String sharePost() {
        return publisher.share();
    }
}
