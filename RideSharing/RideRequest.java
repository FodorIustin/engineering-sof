package RideSharing;

public class RideRequest {
    private int startLocation;
    private int endLocation;

    public RideRequest(int startLocation, int endLocation) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public int getStartLocation() {
        return startLocation;
    }

    public int getEndLocation() {
        return endLocation;
    }

    public void acceptRide(RideVehicle vehicle) {
        System.out.println("Ride accepted by " + vehicle.getClass().getSimpleName());
    }
}
