package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HomeworkTestSuite {

    @Test
    void testUpdate() {
        // given
        Queue jimmys = new Queue("Jimmy Garcia");
        Queue monicas = new Queue("Monica Cannon");
        Queue roberts = new Queue("Robert McDonald");
        Mentor thomas = new Mentor("Thomas Sharp");
        Mentor calvin = new Mentor("Calvin Grimm");
        Mentor zachary = new Mentor("Zachary Wise");
        jimmys.assignWatcher(thomas);
        monicas.assignWatcher(calvin);
        roberts.assignWatcher(zachary);
        monicas.assignWatcher(zachary);
        jimmys.assignWatcher(zachary);
        // when
        jimmys.addExercise(new Exercise(1, "/jim_repo/03.6"));
        jimmys.addExercise(new Exercise(1, "/jim_repo/03.7"));
        monicas.addExercise(new Exercise(1, "/mona_repo/01.3"));
        monicas.addExercise(new Exercise(1, "/mona_repo/01.4"));
        roberts.addExercise(new Exercise(1, "/bob_repo/03.1"));
        roberts.addExercise(new Exercise(1, "/bob_repo/03.2"));
        roberts.addExercise(new Exercise(1, "/bob_repo/03.3"));
        // then
        assertEquals(2, thomas.getUpdatesQuantity());
        assertEquals(2, calvin.getUpdatesQuantity());
        assertEquals(7, zachary.getUpdatesQuantity());
    }
}