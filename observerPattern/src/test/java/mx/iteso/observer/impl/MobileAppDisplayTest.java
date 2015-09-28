package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

public class MobileAppDisplayTest {
    private MobileAppDisplay mobileAppDisplay;
    private ScoresData scoresData;

    private List<Scorer> scorers;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        mobileAppDisplay = new MobileAppDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        scorers = new ArrayList<Scorer>();
        scorers.add(new Scorer("Juan", 27, "Midfielder", "awayTeam"));
        scorers.add(new Scorer("Omar", 13, "Forward", "awayTeam"));

        mobileAppDisplay.update("homeTeam", "awayTeam", 0, 2, scorers);
        //Nothing to assert or verify now
    }
}
