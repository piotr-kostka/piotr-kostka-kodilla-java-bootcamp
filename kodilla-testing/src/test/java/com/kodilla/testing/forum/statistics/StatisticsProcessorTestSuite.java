package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsProcessorTestSuite {

    @Mock
    Statistics statisticsMock;

    List<String> generateListOfNUsers (int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            String user = new String("User " + n);
            resultList.add(user);
        }
        return resultList;
    }

    List<String> usersNames = generateListOfNUsers(20);
    int postQuantity = 10;
    int commentQuantity = 50;

    @Test
    void testCalculateAdvStatistics0Posts() {
        //Given
        int postQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "20 0 50 0.0 2.5 0.0";
        //Then
        assertEquals(advStats,expected);
    }

    @Test
    void testCalculateAdvStatistics1000Posts() {
        //Given
        int postQuantity = 1000;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "20 1000 50 50.0 2.5 0.05";
        //Then
        assertEquals(advStats,expected);
    }

    @Test
    void testCalculateAdvStatistics0Comments() {
        //Given
        int commentQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "20 10 0 0.5 0.0 0.0";
        //Then
        assertEquals(advStats,expected);
    }

    @Test
    void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //Given
        int commentQuantity = 5;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "20 10 5 0.5 0.25 0.5";
        //Then
        assertEquals(advStats,expected);
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "20 10 50 0.5 2.5 5.0";
        //Then
        assertEquals(advStats,expected);
    }

    @Test
    void testCalculateAdvStatistics0Users() {
        //Given
        List<String> usersNames = generateListOfNUsers(0);

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "0 10 50 0.0 0.0 5.0";
        //Then
        assertEquals(advStats,expected);
    }

    @Test
    void testCalculateAdvStatistics100Users() {
        //Given
        List<String> usersNames = generateListOfNUsers(100);

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(statisticsMock);
        String expected = "100 10 50 0.1 0.5 5.0";
        //Then
        assertEquals(advStats,expected);
    }
}
