package RideSharing;

import java.util.ArrayList;
import java.util.List;

public class RideMediatorImpl implements RideMediator {
    private List<RideVehicle> vehicles = new ArrayList<>();

    @Override
    public void requestRide(RideRequest request) {
        for (RideVehicle vehicle : vehicles) {
            vehicle.handleRequest(request);
        }
    }

    @Override
    public void addVehicle(RideVehicle vehicle) {
        vehicles.add(vehicle);
    }
}
