import java.util.ArrayList;
public class FleetOfCars {
    private ArrayList<Car> fleet = new ArrayList<>();
    public void addCar(Car car) {
            fleet.add(car);
        }
    public int getTotalRegistrationFeeForFleet() {
        int total = 0;
        for(Car c: fleet) {
            total += c.getRegistrationFee();
        }
        return total;
    }

    @Override
    public String toString() {
        System.out.println("Cars in fleet:");
        for (Car c : fleet) {
            System.out.println(c);
        }
        return "";

    }
}



