import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class _02_SequencesOfEqualStrings {

	public static void printsStrings(String str, int count) {
		for (int i = 0; i < count; i++) {
			if (i == count - 1) {
				System.out.print(str);
			} else {
				System.out.print(str + " ");
			}
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter words separated with a single space.");
		String input = scanner.nextLine();
		String[] wordsString = input.split(" ");
		TreeMap<String, Integer> words = new TreeMap<String, Integer>();
		for (String wordString : wordsString) {
			if (words.containsKey(wordString)) {
				words.put(wordString, words.get(wordString) + 1);
			} else {
				words.put(wordString, 1);
			}
		}
		for (Map.Entry<String, Integer> word : words.entrySet()) {
			String wordString = word.getKey();
			int count = word.getValue();
			printsStrings(wordString, count);
		}
	}

}
