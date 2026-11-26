package vehicles;

public class Vehicle {
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String ChassisNo;
    private String model;

    public Vehicle(String model) {
        numVehicles++;
        this.ChassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        public Engine(String model) {
            super(model);
        }

        public static String getMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    public static void setMake(String make) {
        MAKE = make;
    }

    public String getChassisNo() {
        return ChassisNo;
    }

    public void setChassisNo(String ChassisNo) {
        this.ChassisNo = ChassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n" +
               "The model type is " + this.model + "\n" +
               "The chassis number is " + this.ChassisNo + "\n" +
               "Engine make: " + Engine.getMake() + "\n" +
               "Engine capacity: " + Engine.getCapacity();
    }
}