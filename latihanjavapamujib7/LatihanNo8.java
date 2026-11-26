import java.util.ArrayList;
import java.util.Scanner;

public class LatihanNo8 {
    public static Card ambilKartuAcak() {
        int suitNumber = (int) (Math.random() * 4.0 + 1);
        int faceNumber = (int) (Math.random() * 13.0 + 1);
        return new Card(suitNumber, faceNumber);
    }

    public static int hitungTotalPoin(ArrayList<Card> hand) {
        int total = 0;
        for (Card c : hand) {
            total += c.getPoints();
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Card> hand = new ArrayList<>();

        // Dua kartu acak awal
        Card card1 = ambilKartuAcak();
        Card card2 = ambilKartuAcak();
        hand.add(card1);
        hand.add(card2);

        System.out.println("Kartu 1: " + card1 + " (" + card1.getPoints() + " poin)");
        System.out.println("Kartu 2: " + card2 + " (" + card2.getPoints() + " poin)");

        // 8a. Total nilai poin untuk dua kartu acak tersebut
        int totalPoin = hitungTotalPoin(hand);
        System.out.println("Total poin awal (2 kartu): " + totalPoin);

        // 8b & 8c. Loop tambah kartu (berhenti jika poin > 21, jawab bukan 'y', atau kartu sudah 5)
        while (totalPoin <= 21 && hand.size() < 5) {
            System.out.print("Apakah Anda ingin kartu lagi? (y/n): ");
            String jawab = scanner.nextLine().trim().toLowerCase();

            if (!jawab.equals("y") && !jawab.equals("ya")) {
                break;
            }

            Card kartuBaru = ambilKartuAcak();
            hand.add(kartuBaru);
            totalPoin = hitungTotalPoin(hand);

            System.out.println("\nKartu baru: " + kartuBaru + " (" + kartuBaru.getPoints() + " poin)");
            System.out.println("Semua kartu di Hand (" + hand.size() + " kartu):");
            for (int i = 0; i < hand.size(); i++) {
                System.out.println("  " + (i + 1) + ". " + hand.get(i) + " [" + hand.get(i).getPoints() + " poin]");
            }
            System.out.println("Total poin saat ini: " + totalPoin);

            if (totalPoin > 21) {
                System.out.println("Poin melebihi 21! Loop berhenti.");
                break;
            }

            if (hand.size() >= 5) {
                System.out.println("Total kartu sudah mencapai 5! Loop berhenti.");
                break;
            }
        }

        System.out.println("\n=== Ringkasan Akhir Hand ===");
        for (Card c : hand) {
            System.out.println("- " + c + " (" + c.getPoints() + " poin)");
        }
        System.out.println("Total poin akhir: " + totalPoin);

        scanner.close();
    }
}