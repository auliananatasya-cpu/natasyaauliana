public class LatihanNo7 {
    public static void main(String[] args) {
        // Kartu acak pertama
        int suit1 = (int) (Math.random() * 4.0 + 1);
        int face1 = (int) (Math.random() * 13.0 + 1);
        Card card1 = new Card(suit1, face1);

        // Kartu acak kedua
        int suit2 = (int) (Math.random() * 4.0 + 1);
        int face2 = (int) (Math.random() * 13.0 + 1);
        Card card2 = new Card(suit2, face2);

        System.out.println("Kartu 1: " + card1 + " (" + card1.getPoints() + " poin)");
        System.out.println("Kartu 2: " + card2 + " (" + card2.getPoints() + " poin)");
    }
}