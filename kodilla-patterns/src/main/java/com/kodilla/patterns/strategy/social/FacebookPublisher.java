package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher {
    public String share() {
        return "publishing via Facebook";
    }
}
