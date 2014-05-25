import java.awt.List;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class _6_RandomHandsOfFiveCards {

	public static List genegateDeck(){
		 String card = "";
		 List deck = new List();
		 for (int i = 2; i <= 14; i++) {
	         switch (i) {
		         case 10: card = "10"; break;
		         case 11: card = "J"; break;
		         case 12: card = "Q"; break;
		         case 13: card = "K"; break;
		         case 14: card = "A"; break;
		         default: card = "" + i; break;
	         }
            for (int j = 1; j <= 4; j++) {
           	 char color = 0;
                switch (j) {
	                 case 1: color = '♣'; deck.add(card + color); break;
	                 case 2: color = '♦'; deck.add(card + color); break;
	                 case 3: color = '♠'; deck.add(card + color); break;
	                 case 4: color = '♥'; deck.add(card + color); break;
                }
            }
		 }
		 return deck;
	}
	
	public static void printArray(String[] array) {
		for (String string : array) {
			System.out.print(string + " ");
		}
	}
	
	public static String[] generateHand(Random generator, List deck) {
		String[] hand = new String[5];
		for (int i = 0; i < 5; i++) {
			int index = generator.nextInt(deck.countItems());
			hand[i] = deck.getItem(index);
			deck.remove(index);
		}
		return hand;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("Enter hands count: ");
				int handsCount = scanner.nextInt();
				Random randomGenerator = new Random();
				for (int i = 0; i < handsCount; i++) {
					List deck = genegateDeck();
					String[] hand = generateHand(randomGenerator, deck);
					printArray(hand);
					System.out.println();
				}
				break;
			} catch (InputMismatchException inE) {
				System.out.println("Please use correct input format.");
				scanner.nextLine();
				continue;
			}
		}
	}

}
