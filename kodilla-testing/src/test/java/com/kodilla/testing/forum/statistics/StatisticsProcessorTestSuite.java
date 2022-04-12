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
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers (int usersQuantity) {
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
    void testCalculateAdvStatistics() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);
        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        String advStats = statisticsProcessor.calculateAdvStatistics(generateListOfNUsers(20), 10, 50);
        String expected = "do uzupełnienia";
        //Then
        assertEquals(advStats,expected);

    }

    @Test
    void testCalculateAdvStatistics0Posts() {
        //Given
        int postQuantity = 0;

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(20, users);
        assertEquals(0, posts);
        assertEquals(50, comments);
        assertEquals(0, avgPostPerUser);
        assertEquals(2.5, avgCommentPerUser);
        assertEquals(0, avgCommentPerPost);
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
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(20, users);
        assertEquals(1000, posts);
        assertEquals(50, comments);
        assertEquals(50, avgPostPerUser);
        assertEquals(2.5, avgCommentPerUser);
        assertEquals(0.05, avgCommentPerPost);
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
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(20, users);
        assertEquals(10, posts);
        assertEquals(0, comments);
        assertEquals(0.5, avgPostPerUser);
        assertEquals(0, avgCommentPerUser);
        assertEquals(0, avgCommentPerPost);
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
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(20, users);
        assertEquals(10, posts);
        assertEquals(5, comments);
        assertEquals(0.5, avgPostPerUser);
        assertEquals(0.25, avgCommentPerUser);
        assertEquals(0.5, avgCommentPerPost);
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.postsCount()).thenReturn(postQuantity);
        when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

        StatisticsProcessor statisticsProcessor = new StatisticsProcessor(statisticsMock);

        //When
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(20, users);
        assertEquals(10, posts);
        assertEquals(50, comments);
        assertEquals(0.5, avgPostPerUser);
        assertEquals(2.5, avgCommentPerUser);
        assertEquals(5, avgCommentPerPost);
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
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(0, users);
        assertEquals(10, posts);
        assertEquals(50, comments);
        assertEquals(0, avgPostPerUser);
        assertEquals(0, avgCommentPerUser);
        assertEquals(5, avgCommentPerPost);
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
        int users = statisticsProcessor.getUsersQuantity();
        int posts = statisticsProcessor.getPostsQuantity();
        int comments = statisticsProcessor.getCommentsQuantity();
        double avgPostPerUser = statisticsProcessor.calculateAvgPostsPerUser();
        double avgCommentPerUser = statisticsProcessor.calculateAvgCommentsPerUser();
        double avgCommentPerPost = statisticsProcessor.calculateAvgCommentsPerPost();

        //Then
        assertEquals(100, users);
        assertEquals(10, posts);
        assertEquals(50, comments);
        assertEquals(0.1, avgPostPerUser);
        assertEquals(0.5, avgCommentPerUser);
        assertEquals(5, avgCommentPerPost);
    }


}
