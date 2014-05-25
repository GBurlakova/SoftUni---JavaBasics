import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a sequence of cards separated by a space.");
		String inputLine = scanner.nextLine();
		String[] cardFaces = inputLine.split("[ ♥♣♦♠]+");
		TreeMap<String, Integer> facesMap = new TreeMap<>();
		for (String cardFace : cardFaces) {
			facesMap.put(cardFace, 0);
		}
		for (String cardFace : cardFaces) {
			facesMap.put(cardFace, facesMap.get(cardFace) + 1);
		}
		double cardFacesCount = cardFaces.length;
		double frequency = 0.0;
		for (Entry<String, Integer> entry : facesMap.entrySet()) {
			frequency = (entry.getValue() / cardFacesCount) * 100;
			System.out.printf("%s -> %.02f%%", entry.getKey(), frequency);
			System.out.println();
		}
	}

}
