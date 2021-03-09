package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        // given
        User user1 = new Millenials("Sabrina");
        User user2 = new YGeneration("Jedi");
        User user3 = new ZGeneration("Neo");

        String user1shouldUse = user1.sharePost();
        System.out.println("Sabrina is " + user1shouldUse);
        String user2shouldUse = user2.sharePost();
        String user3shouldUse = user3.sharePost();
    }

    @Test
    void testIndividualSharingStrategy() {

    }
}
