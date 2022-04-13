package com.kodilla.testing.forum.statistics;

public class StatisticsProcessor {

    private Statistics statistics;

    public StatisticsProcessor(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersQuantity() {
        return statistics.usersNames().size();
    }

    public int getCommentsQuantity() {
        return statistics.commentsCount();
    }

    public int getPostsQuantity() {
        return statistics.postsCount();
    }

    public double calculateAvgPostsPerUser() {
        if (getUsersQuantity() > 0) {
            return (double) getPostsQuantity() / (double) getUsersQuantity();
        } else {
            return 0;
        }
    }
    public double calculateAvgCommentsPerUser() {
        if (getUsersQuantity() > 0) {
            return (double) getCommentsQuantity() / (double) getUsersQuantity();
        } else {
            return 0;
        }
    }

    public double calculateAvgCommentsPerPost() {
        if (getPostsQuantity() > 0) {
            return (double) getCommentsQuantity() / (double) getPostsQuantity();
        } else {
            return 0;
        }
    }

    public String calculateAdvStatistics(Statistics statistics) {
        return getUsersQuantity() + " " + getPostsQuantity() + " " + getCommentsQuantity() + " " +
                calculateAvgPostsPerUser() + " " + calculateAvgCommentsPerUser() + " " + calculateAvgCommentsPerPost();
    }
}
