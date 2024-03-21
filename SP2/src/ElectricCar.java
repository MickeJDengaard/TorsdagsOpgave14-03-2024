class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, double batteryCapacity, double maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = (int) batteryCapacity;
        this.maxRange = (int) maxRange;
    }
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return (int) (batteryCapacity * 1000 / getWhPrKm());

    }
    double getWhPrKm() {
        return batteryCapacity / maxRange * 1000;
    }
    @Override
    public int getRegistrationFee() {
        double sum = getWhPrKm() / 91.25;
        sum = 100 / sum;
        if (sum >= 20)
            return 330;
        else if (sum >= 15)
            return 1050;
        else if (sum >= 10)
            return 2340;
        else if (sum >= 5)
            return 5500;
        else
            return 10470;
    }

    @Override
    public String toString() {
        return "Electric car{" + "\n"
        + super.toString()
        + "Battery capacity: " + batteryCapacity + "Kwh" + "\n"
        + "Max range: " + maxRange;
    }
}
