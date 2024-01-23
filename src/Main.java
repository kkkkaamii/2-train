public class Main {
    public static void main(String[] args) {

        Train train = new Train("Express Train");


        Locomotive loco1 = new Locomotive("Loco1", 100);
        Locomotive loco2 = new Locomotive("Loco2", 120);
        train.addRailVehicle(loco1);
        train.addRailVehicle(loco2);


        Carriage carriage1 = new Carriage("Carriage1", 50, 20);
        Carriage carriage2 = new Carriage("Carriage2", 60, 25);
        train.addRailVehicle(carriage1);
        train.addRailVehicle(carriage2);


        System.out.println("Детали поезда: Опаздание на час");
        System.out.println("Название поезда: " + train.getName());
        System.out.println("Общая грузоподъемность: " + train.calculateTotalCargoCapacity());
        System.out.println("Общая вместимость пассажиров: " + train.calculateTotalPassengerCapacity());
    }
}