import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }


    // Interface for Car
    interface Car {
        String getRegistrationNumber();
        String getMake();
        String getModel();
        int getNumberOfDoors();
        int getRegistrationFee();
    }

    // Abstract class for Car
    abstract class ACar implements Car {
        final String registrationNumber;
        final String make;
        final String model;
        final int numberOfDoors;

        ACar(String registrationNumber, String make, String model, int numberOfDoors) {
            this.registrationNumber = registrationNumber;
            this.make = make;
            this.model = model;
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public String getRegistrationNumber() {
            return registrationNumber;
        }

        @Override
        public String getMake() {
            return make;
        }

        @Override
        public String getModel() {
            return model;
        }

        @Override
        public int getNumberOfDoors() {
            return numberOfDoors;
        }
    }

    // Abstract class for Fuel Car
    abstract class AFuelCar extends ACar {
        final int kmPerLiter;

        AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLiter) {
            super(registrationNumber, make, model, numberOfDoors);
            this.kmPerLiter = kmPerLiter;
        }

        @Override
        public abstract int getRegistrationFee();

        abstract String getFuelType();

        int kmPrLitre() {
            return kmPerLiter;
        }
    }

    // Gasoline Car Class
    class GasolineCar extends AFuelCar {
        GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLiter) {
            super(registrationNumber, make, model, numberOfDoors, kmPerLiter);
        }

        @Override
        public int getRegistrationFee() {
            int kmPerLiter = kmPrLitre();
            if (kmPerLiter >= 20 && kmPerLiter <= 50)
                return 330;
            else if (kmPerLiter >= 15 && kmPerLiter < 20)
                return 1050;
            else if (kmPerLiter >= 10 && kmPerLiter < 15)
                return 2340;
            else if (kmPerLiter >= 5 && kmPerLiter < 10)
                return 5500;
            else
                return 10470;
        }

        @Override
        public String getFuelType() {
            return "Gasoline";
        }

        @Override
        public String toString() {
            return super.toString() + ", Fuel Type: " + getFuelType() + ", km/l: " + kmPrLitre();
        }
    }

    // Diesel Car Class
    class DieselCar extends AFuelCar {
        private final boolean hasParticleFilter;

        DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPerLiter, boolean hasParticleFilter) {
            super(registrationNumber, make, model, numberOfDoors, kmPerLiter);
            this.hasParticleFilter = hasParticleFilter;
        }

        @Override
        public int getRegistrationFee() {
            int baseFee = super.getRegistrationFee();
            int kmPerLiter = kmPrLitre();

            if (!hasParticleFilter)
                baseFee += 1000;

            if (kmPerLiter >= 20 && kmPerLiter <= 50)
                baseFee += 130;
            else if (kmPerLiter >= 15 && kmPerLiter < 20)
                baseFee += 1390;
            else if (kmPerLiter >= 10 && kmPerLiter < 15)
                baseFee += 1850;
            else if (kmPerLiter >= 5 && kmPerLiter < 10)
                baseFee += 2770;
            else
                baseFee += 15260;

            return baseFee;
        }

        @Override
        public String getFuelType() {
            return "Diesel";
        }

        boolean hasParticleFilter() {
            return hasParticleFilter;
        }

        @Override
        public String toString() {
            return super.toString() + ", Fuel Type: " + getFuelType() + ", km/l: " + kmPrLitre() + ", Particle Filter: " + hasParticleFilter();
        }
    }

    // Electric Car Class
    class ElectricCar extends ACar {
        final double batteryCapacityKWh;
        final double maxRangeKm;
        final double whPrKm;

        ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacityKWh, double maxRangeKm) {
            super(registrationNumber, make, model, numberOfDoors);
            this.batteryCapacityKWh = batteryCapacityKWh;
            this.maxRangeKm = maxRangeKm;
            this.whPrKm = batteryCapacityKWh / maxRangeKm * 1000;
        }

        double getBatteryCapacityKWh() {
            return batteryCapacityKWh;
        }

        double getMaxRangeKm() {
            return maxRangeKm;
        }

        double getWhPrKm() {
            return whPrKm;
        }

        @Override
        public int getRegistrationFee() {
            // Electric cars do not have a registration fee
            return 0;
        }

        @Override
        public String toString() {
            return super.toString() + ", Battery Capacity (kWh): " + getBatteryCapacityKWh() + ", Max Range (km): " + getMaxRangeKm() + ", Wh/km: " + getWhPrKm();
        }
    }

    // Fleet of Cars Class
    class FleetOfCars {
        private final ArrayList<Car> fleet;

        FleetOfCars() {
            fleet = new ArrayList<>();
        }

        void addCar(Car car) {
            fleet.add(car);
        }

        int getTotalRegistrationFeeForFleet() {
            int totalFee = 0;
            for (Car car : fleet) {
                totalFee += car.getRegistrationFee();
            }
            return totalFee;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (Car car : fleet) {
                stringBuilder.append(car.toString()).append("\n");
            }
            return stringBuilder.toString();
        }
    }

    public class Main {
        public static void main(String[] args) {
            FleetOfCars fleetOfCars = new FleetOfCars();

            GasolineCar gasolineCar = new GasolineCar("ABC123", "Audi", "A6", 4, 25);
            DieselCar dieselCar = new DieselCar("DEF456", "BMW", "X5", 5, 18, true);
            ElectricCar electricCar = new ElectricCar("GHI789", "Tesla", "Model S", 4, 100, 400);

            fleetOfCars.addCar(gasolineCar);
            fleetOfCars.addCar(dieselCar);
            fleetOfCars.addCar(electricCar);

            System.out.println(fleetOfCars.toString());
            System.out.println("Total Registration Fee: " + fleetOfCars.getTotalRegistrationFeeForFleet() + " kr");
        }
    }

}
