public class Main {
    public static void main(String[] args) {

    FleetOfCars fleet = new FleetOfCars();

    GasolineCar gc1 = new GasolineCar("123sb", "Mercedes", "C63S AMG", 5, 4);
    DieselCar dc1 = new DieselCar("123sb", "Porsche", "GT3RS", 3, 4);
    ElectricCar ec1 = new ElectricCar("ds1232", "Audi", "E-tron", 5, 90, 600);

        fleet.addCar(gc1);
        fleet.addCar(dc1);
        fleet.addCar(ec1);
        System.out.println(fleet);

        System.out.println(fleet.getTotalRegistrationFeeForFleet());
    }
}
