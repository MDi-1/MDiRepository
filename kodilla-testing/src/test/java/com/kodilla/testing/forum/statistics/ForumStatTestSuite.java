package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatTestSuite {

    private static int testCount = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Commencing tests Kodilla course exercise 6.7 ForumStatTestSuite ");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCount++;
        System.out.println("\nabout to execute test #" + testCount);
    }

    @Mock
    private Statistics statsMock;

    private final UserGenerator userGenerator = new UserGenerator();
    private int usersQuantity = 395;
    private int postQuantity = 1222;
    private int commentQuantity = 4888;

    @DisplayName("initial conditions: 395 users; 0 posts; 4888 comments")
    @Test
    void testCalculateAdvStatistics1() throws IOException {

        //Given
        postQuantity = 0;
        float usersNum = usersQuantity;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float postsPerUser = 0;
        float commentsPerUser = 0;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        postsPerUser = postsNum / usersNum;
        commentsPerUser = comtsNum / usersNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgPostPerUser = stat.getAveragePostsPerUser();
        float avgComtsPerUser = stat.getAverageComtsPerUser();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(postsPerUser, avgPostPerUser);
        assertEquals(commentsPerUser, avgComtsPerUser);
    }

    @DisplayName("initial conditions: 395 users; 1000 posts; 4888 comments")
    @Test
    void testCalculateAdvStatistics2() throws IOException {

        //Given
        postQuantity = 1000;
        float usersNum = usersQuantity;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float postsPerUser = 0;
        float commentsPerUser = 0;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        postsPerUser = postsNum / usersNum;
        commentsPerUser = comtsNum / usersNum;
        commentsPerPost = comtsNum / postsNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgPostPerUser = stat.getAveragePostsPerUser();
        float avgComtsPerUser = stat.getAverageComtsPerUser();
        float avgComtsPerPost = stat.getAverageComtsPerPost();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(postsPerUser, avgPostPerUser);
        assertEquals(commentsPerUser, avgComtsPerUser);
        assertEquals(commentsPerPost, avgComtsPerPost);
    }

    @DisplayName("initial conditions: 395 users; 1222 posts; 0 comments")
    @Test
    void testCalculateAdvStatistics3() throws IOException {

        //Given
        commentQuantity = 0;
        float usersNum = usersQuantity;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float postsPerUser = 0;
        float commentsPerUser = 0;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        postsPerUser = postsNum / usersNum;
        commentsPerUser = comtsNum / usersNum;
        commentsPerPost = comtsNum / postsNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgPostPerUser = stat.getAveragePostsPerUser();
        float avgComtsPerUser = stat.getAverageComtsPerUser();
        float avgComtsPerPost = stat.getAverageComtsPerPost();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(postsPerUser, avgPostPerUser);
        assertEquals(commentsPerUser, avgComtsPerUser);
        assertEquals(commentsPerPost, avgComtsPerPost);
    }

    @DisplayName("initial conditions: 395 users; 30000 posts; 4888 comments")
    @Test
    void testCalculateAdvStatistics4() throws IOException {

        //Given
        postQuantity = 30000;
        float usersNum = usersQuantity;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float postsPerUser = 0;
        float commentsPerUser = 0;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        postsPerUser = postsNum / usersNum;
        commentsPerUser = comtsNum / usersNum;
        commentsPerPost = comtsNum / postsNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgPostPerUser = stat.getAveragePostsPerUser();
        float avgComtsPerUser = stat.getAverageComtsPerUser();
        float avgComtsPerPost = stat.getAverageComtsPerPost();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(postsPerUser, avgPostPerUser);
        assertEquals(commentsPerUser, avgComtsPerUser);
        assertEquals(commentsPerPost, avgComtsPerPost);
    }

    @DisplayName("initial conditions: 395 users; 1222 posts; 4888 comments")
    @Test
    void testCalculateAdvStatistics5() throws IOException {

        //Given
        float usersNum = usersQuantity;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float postsPerUser = 0;
        float commentsPerUser = 0;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        postsPerUser = postsNum / usersNum;
        commentsPerUser = comtsNum / usersNum;
        commentsPerPost = comtsNum / postsNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgPostPerUser = stat.getAveragePostsPerUser();
        float avgComtsPerUser = stat.getAverageComtsPerUser();
        float avgComtsPerPost = stat.getAverageComtsPerPost();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(postsPerUser, avgPostPerUser);
        assertEquals(commentsPerUser, avgComtsPerUser);
        assertEquals(commentsPerPost, avgComtsPerPost);
    }

    @DisplayName("initial conditions: 0 users; 1222 posts; 4888 comments")
    @Test
    void testCalculateAdvStatistics6() throws IOException {

        //Given
        usersQuantity = 0;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        commentsPerPost = comtsNum / postsNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgComtsPerPost = stat.getAverageComtsPerPost();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(commentsPerPost, avgComtsPerPost);
    }

    @DisplayName("initial conditions: 100 users; 1222 posts; 4888 comments")
    @Test
    void testCalculateAdvStatistics7() throws IOException {

        //Given
        usersQuantity = 100;
        float usersNum = usersQuantity;
        float postsNum = postQuantity;
        float comtsNum = commentQuantity;
        float postsPerUser = 0;
        float commentsPerUser = 0;
        float commentsPerPost = 0;

        Stat stat = new Stat(statsMock);
        when(statsMock.usersNames()).thenReturn(userGenerator.consumeCsv(usersQuantity));
        when(statsMock.postsCount()).thenReturn(postQuantity);
        when(statsMock.commentsCount()).thenReturn(commentQuantity);
        postsPerUser = postsNum / usersNum;
        commentsPerUser = comtsNum / usersNum;
        commentsPerPost = comtsNum / postsNum;

        //When
        stat.calculateAdvStatistics(statsMock);
        int usersCount = stat.getUsersAmount();
        int postCount = stat.getPostsAmount();
        int commentCount = stat.getCommentsAmount();
        float avgPostPerUser = stat.getAveragePostsPerUser();
        float avgComtsPerUser = stat.getAverageComtsPerUser();
        float avgComtsPerPost = stat.getAverageComtsPerPost();
        stat.showStatistics();

        //Then
        assertEquals(usersQuantity, usersCount);
        assertEquals(postQuantity, postCount);
        assertEquals(commentQuantity, commentCount);
        assertEquals(postsPerUser, avgPostPerUser);
        assertEquals(commentsPerUser, avgComtsPerUser);
        assertEquals(commentsPerPost, avgComtsPerPost);
    }
}