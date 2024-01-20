import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Train train = new Train("Express Train");


        Locomotive loco1 = new Locomotive("Loco1", 100);
        Locomotive loco2 = new Locomotive("Loco2", 120);
        train.addLocomotive(loco1);
        train.addLocomotive(loco2);


        Carriage carriage1 = new Carriage("Carriage1", 50, 20);
        Carriage carriage2 = new Carriage("Carriage2", 60, 25);
        train.addCarriage(carriage1);
        train.addCarriage(carriage2);


        System.out.println("Train details: The train is delayed for an hour");
        System.out.println("Train name: " + train.getName());
        System.out.println("Total cargo capacity: " + train.calculateTotalCargoCapacity());
    }
}