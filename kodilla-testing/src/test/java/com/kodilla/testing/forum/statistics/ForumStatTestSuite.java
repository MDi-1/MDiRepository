package com.kodilla.testing.forum.statistics;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatTestSuite {

    @Mock
    private Statistics statsMock;

    @Test
    void testCalculateAdvStatistics() {
        //Given
        when(statsMock.usersNames()).thenReturn(usersList);
        when(statsMock.postsCount()).thenReturn(postsNum);
        when(statsMock.commentsCount()).thenReturn(commentsNum);
        //When
        //Then
        }

    }

    public class UserGenerator 