import java.util.ArrayList;
import java.util.List;

class RailVehicle {
    private String id;
    private int cargoCapacity;


    public RailVehicle(String id, int cargoCapacity) {
        this.id = id;
        this.cargoCapacity = cargoCapacity;
    }


    public String getId() {
        return id;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }
}

class Locomotive extends RailVehicle {

    public Locomotive(String id, int cargoCapacity) {
        super(id, cargoCapacity);
    }
}


class Carriage extends RailVehicle {
    private int passengerCapacity;


    public Carriage(String id, int cargoCapacity, int passengerCapacity) {
        super(id, cargoCapacity);
        this.passengerCapacity = passengerCapacity;
    }


    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}
