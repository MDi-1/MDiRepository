package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        System.out.println("\n]]]] Kodilla exercise 15.3 SocialPublisher [[[[");

        // given
        User user1 = new Millenials("Sabrina");
        User user2 = new YGeneration("Jedi");
        User user3 = new ZGeneration("Neo");

        // when
        String user1shouldUse = user1.sharePost();
        System.out.println("Sabrina is " + user1shouldUse);
        String user2shouldUse = user2.sharePost();
        System.out.println("Jedi is " + user2shouldUse);
        String user3shouldUse = user3.sharePost();
        System.out.println("Neo is " + user3shouldUse);

        // then
        assertEquals("publishing via Facebook", user1shouldUse);
        assertEquals("publishing via Twitter", user2shouldUse);
        assertEquals("publishing via Snapchat", user3shouldUse);
    }

    @Test
    void testIndividualSharingStrategy() {
        // given
        User user3 = new ZGeneration("Neo");

        // when
        String user3shouldUse = user3.sharePost();
        System.out.println("\nNeo is " + user3shouldUse);
        user3.setPublisher(new FacebookPublisher());
        user3shouldUse = user3.sharePost();
        System.out.println("But Neo wants to change publisher. Now he is " + user3shouldUse);

        // then
        assertEquals("publishing via Facebook", user3shouldUse);
    }
}
