import java.util.Collection;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Stream;

import org.omg.CORBA.INTERNAL;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.toLowerCase();
		String[] words = input.split("\\W+");
		TreeMap<String, Integer> uniqueWords = new TreeMap<>();
		for (String word : words) {
			uniqueWords.put(word, 0);
		}
		
		for (int i = 0; i < words.length; i++) {
			uniqueWords.put(words[i], uniqueWords.get(words[i]) + 1);
		}
		
		int maxValue = Collections.max(uniqueWords.values());
		for (Entry<String, Integer> entry : uniqueWords.entrySet()) {
			if (entry.getValue() == maxValue) {
				System.out.printf("%s -> %d times", entry.getKey(), entry.getValue());
				System.out.println();
			}
		}
	}	

}
