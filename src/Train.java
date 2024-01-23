import java.util.ArrayList;
import java.util.List;


class Train {
    private String name;
    private List<RailVehicle> railVehicles;


    public Train(String name) {
        this.name = name;
        this.railVehicles = new ArrayList<>();
    }


    public void addRailVehicle(RailVehicle railVehicle) {
        railVehicles.add(railVehicle);
    }


    public int calculateTotalCargoCapacity() {
        int totalCargoCapacity = 0;
        for (RailVehicle railVehicle : railVehicles) {
            totalCargoCapacity += railVehicle.getCargoCapacity();
        }
        return totalCargoCapacity;
    }


    public int calculateTotalPassengerCapacity() {
        int totalPassengerCapacity = 0;
        for (RailVehicle railVehicle : railVehicles) {
            if (railVehicle instanceof Carriage) {
                totalPassengerCapacity += ((Carriage) railVehicle).getPassengerCapacity();
            }
        }
        return totalPassengerCapacity;
    }


    public String getName() {
        return name;
    }
}