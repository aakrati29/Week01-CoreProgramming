import java.util.*;

//Creating class DeckOfCardsCreaction fo checking
public class DeckOfCardsCreaction {

    // Create a method to taking the deck of cards
    public static String[] takeingDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
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

    // Create a method to shuffle the deck of cards
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Create a method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numberOfCards, int numberOfPlayers) {
        if (numberOfCards % numberOfPlayers != 0) {
            throw new IllegalArgumentException("Cards cannot be evenly distributed among players.");
        }

        int cardsPerPlayer = numberOfCards / numberOfPlayers;
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];

        int deckIndex = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Initialize the deck
        String[] deck = takeingDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Input number of cards and players
        System.out.print("Enter the number of cards to distribute : ");
        int numberOfCards = s.nextInt();
		
        System.out.print("Enter the number of players : ");
        int numberOfPlayers = s.nextInt();

        // Distribute cards and print results
        try {
            String[][] players = distributeCards(deck, numberOfCards, numberOfPlayers);
            printPlayers(players);
        } 
		
		catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
		
		//Closing Scanner class object
        s.close();
    }
}