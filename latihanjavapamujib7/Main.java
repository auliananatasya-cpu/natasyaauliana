public class Main {
    // Soal 7: nicestFish dengan 2 parameter
    public static Fish nicestFish(Fish fish1, Fish fish2) {
        if (fish1.getFriendliness() >= fish2.getFriendliness()) {
            return fish1;
        } else {
            return fish2;
        }
    }

    // Soal 8: nicestFish dengan varargs
    public static Fish nicestFish(Fish... fishes) {
        if (fishes == null || fishes.length == 0) {
            return null;
        }

        Fish temp = fishes[0];
        for (int i = 1; i < fishes.length; i++) {
            if (fishes[i].getFriendliness() > temp.getFriendliness()) {
                temp = fishes[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // Soal 6: inisialisasi 2 ikan baru
        Fish amber = new Fish("Amber", "AngelFish", 5);
        Fish james = new Fish("James", "Guppy", 3);

        // Soal 7: uji 2 parameter
        Fish hasil7 = nicestFish(amber, james);
        System.out.println("Hasil soal 7: " + hasil7.getName());

        // Soal 9: uji varargs
        Fish hasil9 = nicestFish(amber, james);
        System.out.println("Hasil soal 9: " + hasil9.getName());
    }
}

class Fish {
    private String name;
    private String species;
    private int friendliness;

    public Fish(String name, String species, int friendliness) {
        this.name = name;
        this.species = species;
        this.friendliness = friendliness;
    }

    public String getName() {
        return name;
    }

    public int getFriendliness() {
        return friendliness;
    }
}