import java.util.ArrayList;
import java.util.List;

class Train {
    private static final int PASSENGER_LIMIT = 200;
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

    public boolean isTrainOverloaded() {
        return calculateTotalPassengerCapacity() > PASSENGER_LIMIT;
    }

    public void displayTrainDetails() {
        System.out.println("Детали поезда: Опаздание на час");
        System.out.println("Название поезда: " + name);
        System.out.println("Общая грузоподъемность: " + calculateTotalCargoCapacity());
        System.out.println("Общая вместимость пассажиров: " + calculateTotalPassengerCapacity());
        System.out.println("Переполнение поезда: " + (isTrainOverloaded() ? "Да" : "Нет")); }

    public String getName() {
        return name;
    }
}