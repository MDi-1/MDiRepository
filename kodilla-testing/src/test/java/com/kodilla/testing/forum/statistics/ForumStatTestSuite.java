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

    @Test
    void testCalculateAdvStatistics1() throws IOException {
        mainFunction(1);
    }

    @Test
    void testCalculateAdvStatistics2() throws IOException {
        mainFunction(2);
    }

    @Test
    void testCalculateAdvStatistics3() throws IOException {
        mainFunction(3);
    }

    @Test
    void testCalculateAdvStatistics4() throws IOException {
        mainFunction(4);
    }

    @Test
    void testCalculateAdvStatistics5() throws IOException {
        mainFunction(5);
    }

    @Test
    void testCalculateAdvStatistics6() throws IOException {
        mainFunction(6);
    }

    @Test
    void testCalculateAdvStatistics7() throws IOException {
        mainFunction(7);
    }

    void mainFunction(int i) throws IOException {
        switch (i) {
            case 1:
                postQuantity = 0;
                break;
            case 2:
                postQuantity = 1000;
                break;
            case 3:
                commentQuantity = 0;
                break;
            case 4:
                postQuantity = 30000;
                break;
            case 5:
                break;
            case 6:
                usersQuantity = 0;
                break;
            case 7:
                usersQuantity = 100;
                break;
        }
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
        if (usersQuantity != 0) postsPerUser = postsNum / usersNum;
        if (usersQuantity != 0) commentsPerUser = comtsNum / usersNum;
        if (postQuantity != 0) commentsPerPost = comtsNum / postsNum;

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
        if (usersQuantity != 0) assertEquals(postsPerUser, avgPostPerUser);
        if (usersQuantity != 0) assertEquals(commentsPerUser, avgComtsPerUser);
        if (postQuantity != 0) assertEquals(commentsPerPost, avgComtsPerPost);
    }
}
