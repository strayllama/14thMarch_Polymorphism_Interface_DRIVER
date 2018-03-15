import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuadBikeTest {
    private QuadBike quaddy;

    @Before
    public void before() {
        quaddy = new QuadBike();
    }

    @Test
    public void canGetTimeTravel() {
        assertEquals(60, quaddy.driveDistance(20));
    }
}
