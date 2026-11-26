public class Animal {
    int weight, height;
    double speed;

    Animal() {
        weight = 50;
        height = 4;
        speed = 2; // miles per hour
    }

    Animal(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    public double getTime(double miles) { // mendapatkan jumlah jam untuk menempuh jarak ini
        return miles / speed;
    }

    public int getWeight() { return weight; }
    public int getHeight() { return height; }
    public double getSpeed() { return speed; }

    public static void main(String[] args) {
        // Instance 1 menggunakan constructor tanpa parameter (speed = 2.0)
        Animal animal1 = new Animal();

        // Instance 2 menggunakan constructor dengan parameter (misal: weight=60, height=5, speed=15)
        Animal animal2 = new Animal(60, 5, 15);

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed() + ".");
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed() + ".");
    }
}