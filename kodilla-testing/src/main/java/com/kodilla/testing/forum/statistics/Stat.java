package com.kodilla.testing.forum.statistics;

public class Stat {
    private Statistics statistics;
    private int usersAmount;
    private int postsAmount;
    private int commentsAmount;
    private float averagePostsPerUser;
    private float averageComtsPerUser;
    private float averageComtsPerPost;

    public Stat(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUsersAmount() {
        return usersAmount;
    }

    public int getPostsAmount() {
        return postsAmount;
    }

    public int getCommentsAmount() {
        return commentsAmount;
    }

    public float getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public float getAverageComtsPerUser() {
        return averageComtsPerUser;
    }

    public float getAverageComtsPerPost() {
        return averageComtsPerPost;
    }

    void calculateAdvStatistics(Statistics statistics) {
        this.usersAmount = statistics.usersNames().size();
        this.postsAmount = statistics.postsCount();
        this.commentsAmount = statistics.commentsCount();
        float uAmount = usersAmount;
        float pAmount = postsAmount;
        float cAmount = commentsAmount;

        if (usersAmount != 0) {
            this.averagePostsPerUser = pAmount / uAmount;
        } else {
            System.out.println
                    ("There are no users in this forum, unable to get value of - average posts per user.");
        }
        if (usersAmount != 0) {
            this.averageComtsPerUser = cAmount / uAmount;
        } else {
            System.out.println
                    ("There are no users in this forum, unable to get value of - average comments per user.");
        }
        if (postsAmount != 0) {
            this.averageComtsPerPost = cAmount / pAmount;
        } else {
            System.out.println
                    ("Posts quantity is 0; unable to get value of - average comments per post.");
        }
    }
    void showStatistics() {
        System.out.println("current forum statistics:\n quantity of users: " +
                + usersAmount + "\t\t total quantity of posts: " + postsAmount + "\t\t total quantity of comments: "
                + commentsAmount + "\n average number of posts per user: " + averagePostsPerUser +
                "\n average number of comments per user: " + averageComtsPerUser +
                "\n average number of comments per post: " + averageComtsPerPost);
    }
}
