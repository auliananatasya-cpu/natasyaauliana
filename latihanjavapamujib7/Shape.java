public class Shape {
    // Instance variables
    private int numSides;
    private boolean regular;

    // Constructor 1: Default constructor
    public Shape() {
        this.numSides = 3;
        this.regular = true;
    }

    // Constructor 2: Parameterized constructor
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter & Setter untuk numSides
    public int getNumSides() {
        return numSides;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    // Getter & Setter untuk regular
    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    // Method main untuk menguji class Shape
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("Sisi: " + s1.getNumSides() + ", Regular: " + s1.isRegular());

        Shape s2 = new Shape(4, true);
        s2.setNumSides(5);
        System.out.println("Sisi: " + s2.getNumSides() + ", Regular: " + s2.isRegular());
    }
}