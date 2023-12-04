package RideSharing;

public class Scooter implements RideVehicle {
    private int chargeLevel;
    private int maxDistance;

    public Scooter(int chargeLevel, int maxDistance) {
        this.chargeLevel = chargeLevel;
        this.maxDistance = maxDistance;
    }

    @Override
    public void handleRequest(RideRequest request) {
        // Implement logic for scooter ride
        // Check if the scooter is available and can cover at least 50% of the trip

        // For simplicity, let's assume any scooter with charge level above 50% is valid
        if (chargeLevel > 50) {
            request.acceptRide(this);
        }
    }
}

