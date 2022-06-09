package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User andrzej = new Millenials("Andrzej");
        User jan = new YGeneration("Jan");
        User jakub = new ZGeneration("Jakub");

        //When
        String andrzejShare = andrzej.sharePost();
        System.out.println("Andrzej " + andrzejShare);
        String janShare = jan.sharePost();
        System.out.println("Jan " + janShare);
        String jakubShare = jakub.sharePost();
        System.out.println("Jakub " + jakubShare);

        //Then
        assertEquals("[Twitter Publisher] mainly uses Twitter", andrzejShare);
        assertEquals("[Facebook Publisher] mainly uses Facebook", janShare);
        assertEquals("[Snapchat Publisher] mainly uses Snapchat", jakubShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User mateusz = new ZGeneration("Mateusz");

        //When
        String mateuszShare = mateusz.sharePost();
        System.out.println("Mateusz " + mateuszShare);
        mateusz.setSocialPublisher(new TwitterPublisher());
        mateuszShare = mateusz.sharePost();
        System.out.println("Mateusz now " + mateuszShare);

        //Then
        assertEquals("[Twitter Publisher] mainly uses Twitter", mateuszShare);
    }
}
