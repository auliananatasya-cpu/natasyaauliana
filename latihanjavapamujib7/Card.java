public class Card {
    String suit, name;
    int points;

    public Card(int n1, int n2) {
        switch (n1) {
            case 1:
                this.suit = "Spades";
                break;
            case 2:
                this.suit = "Hearts";
                break;
            case 3:
                this.suit = "Diamonds";
                break;
            default:
                this.suit = "Clubs";
                break;
        }

        switch (n2) {
            case 1:
                this.name = "Ace";
                this.points = 11;
                break;
            case 11:
                this.name = "Jack";
                this.points = 10;
                break;
            case 12:
                this.name = "Queen";
                this.points = 10;
                break;
            case 13:
                this.name = "King";
                this.points = 10;
                break;
            default:
                this.name = String.valueOf(n2);
                this.points = n2;
                break;
        }
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "The " + name + " of " + suit;
    }
}