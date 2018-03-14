import com.sun.xml.internal.bind.v2.model.core.ID;

public class Driver {
    private String name;
    private IDriveable ride;

    public Driver (String name, IDriveable ride) {
        this.name = name;
        this.ride = ride;
    }

    public String getName() {
        return this.name;
    }

    public IDriveable getRide() {
        return this.ride;
    }

    public int driveDistance(int distance) {
        int time = this.ride.driveDistance(distance);
        return time;
    }

    public void changeRide(IDriveable ride) {
        this.ride = ride;
    }


}
