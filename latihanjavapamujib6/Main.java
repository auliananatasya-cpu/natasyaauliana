import java.util.Random;
import java.util.Scanner;

class Card {
    String suit, name;
    int points;

    public Card(int n1, int n2) {
        this.suit = setSuit(n1);
        this.name = setName(n2);
        this.points = setPoints(this.name);
    }

    private String setSuit(int n) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        return suits[n - 1];
    }

    private String setName(int n) {
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return names[n - 1];
    }

    private int setPoints(String cardName) {
        if (cardName.equals("Ace")) {
            return 11; // Poin awal Ace = 11 (Poin c)
        } else if (cardName.equals("Jack") || cardName.equals("Queen") || cardName.equals("King")) {
            return 10;
        } else {
            return Integer.parseInt(cardName);
        }
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }
}

class Deck {
    Card[] cardArray = new Card[52];
    int cardIndex = 0;

    Deck() {
        int suits = 4;
        int cardType = 13;
        int cardCount = 0;
        for (int i = 1; i <= suits; i++) {
            for (int j = 1; j <= cardType; j++) {
                cardArray[cardCount] = new Card(i, j);
                cardCount++;
            }
        }
    }

    // Poin a: Method shuffle untuk mengacak deck
    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < cardArray.length; i++) {
            int randomIndex = rand.nextInt(cardArray.length);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[randomIndex];
            cardArray[randomIndex] = temp;
        }
        cardIndex = 0;
    }

    public Card dealCard() {
        if (cardIndex < cardArray.length) {
            return cardArray[cardIndex++];
        }
        return null;
    }

    public void print() {
        for (int i = 0; i < cardArray.length; i++) {
            System.out.println(cardArray[i]);
        }
    }
}

class Hand {
    Card[] cards = new Card[5];
    int count = 0;

    public void addCard(Card c) {
        if (count < 5) {
            cards[count] = c;
            count++;
        }
    }

    // Poin c: Menghitung total poin & menyesuaikan Ace (11 jadi 1 jika total > 21)
    public int getTotalPoints() {
        int total = 0;
        int aceCount = 0;

        for (int i = 0; i < count; i++) {
            total += cards[i].points;
            if (cards[i].name.equals("Ace")) {
                aceCount++;
            }
        }

        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    public void displayHand() {
        for (int i = 0; i < count; i++) {
            System.out.println(" - " + cards[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        // Poin a: Shuffle Deck
        deck.shuffle();
        System.out.println("=== DECK BERHASIL DIAJAK (SHUFFLE) ===");

        // Poin b & c: Permainan Pemain
        Hand playerHand = new Hand();
        System.out.println("\n--- PEMBAGIAN KARTU PEMAIN ---");
        playerHand.addCard(deck.dealCard());
        playerHand.addCard(deck.dealCard());

        playerHand.displayHand();
        System.out.println("Total poin Anda saat ini: " + playerHand.getTotalPoints());

        while (playerHand.count < 5 && playerHand.getTotalPoints() < 21) {
            System.out.print("Apakah ingin mengambil kartu lagi? (y/n): ");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("y")) {
                playerHand.addCard(deck.dealCard());
                System.out.println("\nKartu Anda sekarang:");
                playerHand.displayHand();
                System.out.println("Total poin Anda: " + playerHand.getTotalPoints());
            } else {
                break;
            }
        }

        if (playerHand.getTotalPoints() > 21) {
            System.out.println("Anda Bust (poin melebihi 21)!");
        }

        // Poin d: Giliran Dealer
        System.out.println("\n--- GILIRAN DEALER ---");
        Hand dealerHand = new Hand();
        dealerHand.addCard(deck.dealCard());
        dealerHand.addCard(deck.dealCard());

        System.out.println("Kartu Dealer:");
        dealerHand.displayHand();
        System.out.println("Total poin Dealer awal: " + dealerHand.getTotalPoints());

        while (dealerHand.getTotalPoints() < 16 && dealerHand.count < 5) {
            Card newCard = deck.dealCard();
            dealerHand.addCard(newCard);
            System.out.println("Dealer mengambil kartu: " + newCard);
        }

        System.out.println("Total poin Dealer akhir: " + dealerHand.getTotalPoints());
        
        if (dealerHand.getTotalPoints() > 21) {
            System.out.println("Dealer Bust! Anda Menang!");
        } else {
            System.out.println("Dealer berhenti mengambil kartu (poin >= 16).");
        }

        scanner.close();
    }
}