import java.awt.List;
import java.util.Arrays;

public class _3_FullHouse {
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
	 
	 public static void printCollection(String[] arr) {
		String result = "";
		for (String element : arr) {
			result += element;
		}
		System.out.print("(" + result + ")");
	 }
	 
	 public static boolean isFullHouse(String[] hand){
		 boolean hasThreeEquals = false;
		 boolean hasTwoEqual = false;
		 int[] cards = new int[13];
		 for (int i = 0; i < 5; i++) {
			String currentCard = hand[i];
			if (currentCard.contains("A")) { cards[0]++; }
            if (currentCard.contains("2")) { cards[1]++; }
            if (currentCard.startsWith("3")) { cards[2]++; }
            if (currentCard.startsWith("4")) { cards[3]++; }
            if (currentCard.startsWith("5")) { cards[4]++; }
            if (currentCard.startsWith("6")) { cards[5]++; }
            if (currentCard.startsWith("7")) { cards[6]++; }
            if (currentCard.startsWith("8")) { cards[7]++; }
            if (currentCard.startsWith("9")) { cards[8]++; }
            if (currentCard.startsWith("10")) { cards[9]++; }
            if (currentCard.startsWith("J")) { cards[10]++; }
            if (currentCard.startsWith("Q")) { cards[11]++; }
            if (currentCard.startsWith("K")) { cards[12]++; }
		}
		for (int i = 0; i < 13; i++) {
			if (cards[i] == 3) {
				hasThreeEquals = true;
				break;
			}
		}
		for (int i = 0; i < 13; i++) {
			if (cards[i] == 2) {
				hasTwoEqual = true;
				break;
			}
		}
		boolean isFullH = hasThreeEquals && hasTwoEqual;
		return isFullH;
	 }
	public static void main(String[] args) {
		 List deck = genegateDeck();
		 int fullHousesAtLine = 0;
		 int fullHouses = 0;
		 for (int firstC = 0; firstC < deck.countItems(); firstC++) {
			for (int secondC = firstC + 1; secondC < deck.countItems(); secondC++) {
				for (int thirdC = secondC + 1; thirdC < deck.countItems(); thirdC++) {
					for (int fourthC = thirdC + 1; fourthC < deck.countItems(); fourthC++) {
						for (int fifthC = fourthC + 1; fifthC < deck.countItems(); fifthC++) {
							String[] hand = new String[5];
							hand[0] = deck.getItem(firstC);
							hand[1] = deck.getItem(secondC);
							hand[2] = deck.getItem(thirdC);
							hand[3] = deck.getItem(fourthC);
							hand[4] = deck.getItem(fifthC);
							if (isFullHouse(hand)) {
								printCollection(hand);
								System.out.print("\t");
								fullHouses++;
								fullHousesAtLine++;
							}
							if (fullHousesAtLine == 4) {
								fullHousesAtLine = 0;
								System.out.println();
							}
						}
					}
				}
			}
		 }
		 System.out.println();
		 System.out.println(fullHouses + " full houses");
	}

}
