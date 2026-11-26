public class TokoMusik {
    public static void main(String[] args) {
        Guitar gitar = new Guitar("Fender Stratocaster", 3000000, true, 6);

        System.out.println("Nama: " + gitar.getName());
        System.out.println("Jumlah senar: " + gitar.getNumStrings());
        System.out.println("Harga normal: " + gitar.getBasePrice());
        System.out.println("Harga jual (onSale 15%): " + gitar.getPrice());
        System.out.println("Harga diskon karyawan (25%): " + gitar.getEmployeePrice());
    }
}

class Instrument {
    private String name;
    private double price;
    private boolean onSale;

    public Instrument(String name, double price, boolean onSale) {
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public double getPrice() {
        if (onSale) {
            return price * 0.85;
        }
        return price;
    }

    public double getEmployeePrice() {
        return getPrice() * 0.75;
    }
}

class StringInstrument extends Instrument {
    private int numStrings;

    public StringInstrument(String name, double price, boolean onSale, int numStrings) {
        super(name, price, onSale);
        this.numStrings = numStrings;
    }

    public int getNumStrings() {
        return numStrings;
    }
}

class Guitar extends StringInstrument {
    public Guitar(String name, double price, boolean onSale, int numStrings) {
        super(name, price, onSale, numStrings);
    }
}