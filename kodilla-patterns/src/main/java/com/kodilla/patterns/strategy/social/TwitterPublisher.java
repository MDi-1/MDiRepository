package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher {
    public String share() {
        return "publishing via Twitter";
    }
}
