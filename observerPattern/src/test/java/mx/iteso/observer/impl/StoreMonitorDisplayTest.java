package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class StoreMonitorDisplayTest {
    private StoreMonitorDisplay storeMonitorDisplay;
    private ScoresData scoresData;

    private  List<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Carlos", 7, "forward", "homeTeam"));

        storeMonitorDisplay.update("homeTeam", "awayTeam", 1, 0, scorers);
        //Nothing to assert or verify for now
    }
}
