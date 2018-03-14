import com.sun.tools.internal.xjc.generator.bean.DualObjectFactoryGenerator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IDriveableTest {
    private Driver aDriver;
    private Dodgem aDodgem;
    private QuadBike aQuadBike;

    @Before
    public void before() {
        aDodgem = new Dodgem();
        aQuadBike = new QuadBike();
        aDriver = new Driver("Stuntman Mike", aDodgem);
    }

    @Test
    public void driverHasRide() {
        assertEquals(aDodgem, aDriver.getRide());
    }

    @Test
    public void driverCanGetTimeForDistance() {
        assertEquals(857, aDriver.driveDistance(100));
    }

    @Test
    public void driverCanChangeRide() {
        aDriver.changeRide(aQuadBike);
        assertEquals(aQuadBike, aDriver.getRide());
    }

}
