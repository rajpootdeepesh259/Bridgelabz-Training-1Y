import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                           "Jack", "Queen", "King", "Ace" };

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }

        return deck;
    }

  
    public static String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck;
    }

  
    public static String[][] distributeCards(String[] deck, int n, int x) {

        if (n * x > deck.length) {
            System.out.println("Error: Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[x][n];

        int cardIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }

        return players;
    }


    public static void printPlayersCards(String[][] players) {

        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

   
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

    
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = sc.nextInt();

    
        String[][] distributed = distributeCards(deck, cardsPerPlayer, players);
        printPlayersCards(distributed);

        sc.close();
    }
}