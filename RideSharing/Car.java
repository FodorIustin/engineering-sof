package RideSharing;

public class Car implements RideVehicle {
    private int location;
    private int distanceToLocation;

    public Car(int location, int distanceToLocation) {
        this.location = location;
        this.distanceToLocation = distanceToLocation;
    }

    @Override
    public void handleRequest(RideRequest request) {

        if (distanceToLocation <= 100) {
            request.acceptRide(this);
        }
    }
}