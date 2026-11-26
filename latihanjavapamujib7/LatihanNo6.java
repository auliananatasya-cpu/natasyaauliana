public class LatihanNo6 {
    public static void main(String[] args) {
        Convertible mobilAtapBuka = new Convertible("Toyota", 2026, 4, true);
        Bicycle sepeda = new Bicycle("Polygon", 2025, 21);

        System.out.println("Mobil: " + mobilAtapBuka.getMake() + " (" + mobilAtapBuka.getYear() + ")");
        System.out.println("Jumlah pintu: " + mobilAtapBuka.getNumDoors() + ", atap terbuka: " + mobilAtapBuka.isRoofOpen());
        System.out.println("Sepeda: " + sepeda.getMake() + ", gear: " + sepeda.getGears());
    }
}

class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String make, int year, int numDoors) {
        super(make, year);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
}

class Convertible extends Car {
    private boolean roofOpen;

    public Convertible(String make, int year, int numDoors, boolean roofOpen) {
        super(make, year, numDoors);
        this.roofOpen = roofOpen;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }
}

class Bicycle extends Vehicle {
    private int gears;

    public Bicycle(String make, int year, int gears) {
        super(make, year);
        this.gears = gears;
    }

    public int getGears() {
        return gears;
    }
}