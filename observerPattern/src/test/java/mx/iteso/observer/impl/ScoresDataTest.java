package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import mx.iteso.observer.Observer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

import java.util.List;

public class ScoresDataTest {
    ScoresData scoresData;
    Observer observer;

    List<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = new ScoresData();
        observer = mock(Observer.class);
    }

    @Test(expected=ArrayIndexOutOfBoundsException.class)
    public void testRegisterAndRemoveObserver() {
        scoresData.registerObserver(observer);
        scoresData.removeObserver(observer);
        scoresData.removeObserver(observer);
    }

    @Test
    public void testSetScore() {
        scoresData.registerObserver(observer);
        scoresData.registerObserver(observer);

        scoresData.setScore("testTeam", "testTeam2", 1, 0, scorers);

        verify(observer, times(2)).update("testTeam", "testTeam2", 1, 0, scorers);
    }
}
