public abstract class Vehical {
    private String name;
    private int aveSpeed;

    public Vehical (String name, int aveSpeed) {
        this.name = name;
        this.aveSpeed = aveSpeed;
    }

    public int driveDistance(int distance) {
        int time = ( (60 * distance) / this.aveSpeed );
        System.out.println("It will take " + time + " mins to drive " + distance + "kms in your " + this.name);
        return time;
    }
}
