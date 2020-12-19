package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatTestSuite {

    @Mock
    private Statistics statsMock;

    @Test
    void testCalculateAdvStatistics() throws IOException {

        //Given
        UserGenerator userGenerator = new UserGenerator();
        for (int i = 1; i < 7; i ++) {
            int usersQuantity = 395;
            int postQuantity = 1222;
            int commentQuantity = 4888;
            switch (i) {
                case 1: postQuantity = 0;       break;
                case 2: postQuantity = 1000;    break;
                case 3: commentQuantity = 0;    break;
                case 4: postQuantity = 30000;   break;
                case 5: break;
                case 6: usersQuantity = 0;      break;
                case 7: usersQuantity = 100;    break;
            }
            Stat stat = new Stat(statsMock);
            when(statsMock.usersNames()).thenReturn(userGenerator.consumecsv(usersQuantity));
            when(statsMock.postsCount()).thenReturn(postQuantity);
            when(statsMock.commentsCount()).thenReturn(commentQuantity);

            //When
            stat.calculateAdvStatistics(statsMock);
            int postCount = stat.getPostsAmount();
            int commentCount = stat.getCommentsAmount();

            //Then
            assertEquals(682, postCount);
            assertEquals(2000, commentCount);
        }
    }
}
